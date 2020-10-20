package ru.job4j.stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * В этом задании необходимо реализовать класс для подсчета статистики по аттестатам учеников.
 * Класс Analyze получает статистику по аттестатам.
 * <b>1. Метод averageScore</b> - с этим методом все достаточно просто, для реализации понадобятся методы:
 * - flatMap() для преобразования в поток объектов Subject;
 * - mapToInt() для последующего преобразования в потом оценок по каждому предмету;
 * - average() для расчета среднего бала по предмету;
 * - orElse() для того чтобы вернуть значение по умолчанию.
 * <b>2. Метод averageScoreBySubject</b> - поскольку нам надо выполнить преобразование в поток объектов класса Tuple,
 * последовательность будет следующей:
 * - метод map() для преобразования в поток объектов класса Tuple,
 * внутри метода мы будем создавать эти объекты - там будет фигурировать строка new Tuple();
 * - при этом в конструктор первым параметром будет передаваться имя текущего объекта Pupil -
 * используем соответствующий геттер;
 * - вторым параметром рассчитанный средний балл - расчет можно произвести по той же последовательности,
 * что описана для метода averageScore;
 * - последним методом будет collect(), с помощью которого мы все соберем в коллекцию List.
 * <b>3. Метод averageScoreByPupil</b> - реализация этого метода несколько сложна,
 * поскольку в данном случае требуется выполнить промежуточный сбор данных в Map(). Опишем вкратце алгоритм:
 * - flatMap() для преобразования в поток объектов Subject;
 * - метод collect() в который мы передаем метод groupingBy() (минимум с двумя параметрами) класса Collectors.
 * При этом карта собирается следующим образом: ключ - это имя предмета, значение - средний балл по этому
 * предмету для каждого ученика. Для расчета среднего балла используйте метод averagingDouble() класса Collectors;
 * - после этого собранную карту мы разбираем с помощью entrySet() и открываем поток с помощью stream();
 * - полученный поток с помощью map() преобразуем в поток объектов класса Tuple,
 * внутри метода мы будем создавать эти объекты - там будет фигурировать строка new Tuple();
 * - в конструктор мы будем передавать параметры с помощью методов getKey() и getValue() интерфейса Entry;
 * - последним методом будет collect(), с помощью которого мы все соберем в коллекцию List.
 * <b>4. Метод bestStudent</b> - для реализации данного метода можно использовать
 * метод averageScoreBySubject за исключением следующих особенностей:
 * - в данном методе мы рассчитываем суммарный балл,
 * а не средний - поэтому вместо average() нужно использовать метод sum();
 * - терминальной операцией будет не метод collect(), а использование метода max(), в который будем
 * передавать компаратор. При этом компаратор определит объект Tuple, у которого значение Score будет максимальным;
 * - orElse() для того чтобы вернуть значение по умолчанию.
 * <b>5. Метод bestSubject</b> - для реализации данного метода можно использовать метод
 * averageScoreByPupil за исключением следующих особенностей:
 * - в данном методе мы рассчитываем суммарный балл, а не средний - поэтому вместо averagingDouble()
 * нужно использовать метод summingDouble();
 * - терминальной операцией будет не метод collect(), а использование метода max(), в который будем передавать
 * компаратор. При этом компаратор определит объект Tuple, у которого значение Score будет максимальным;
 * - orElse() для того чтобы вернуть значение по умолчанию.
 * <b>Задание.</b>
 * 1. Реализуйте методы в классе Analyze.
 * 2. Загрузите код в репозиторий.
 * 3. Все методы нужно реализовывать в одном потоке, т.е. пишете return и последовательно вызываете все методы,
 * о которых было указано выше.
 * 3. Оставьте ссылку на коммит. Переведите на ответственного.
 */
public class Analyze {
    /**
     * Метод averageScore вычисляет общий средний балл.
     *
     * @param stream поток объектов Pupil.
     * @return возвращает результат или 0.
     */
    public static double averageScore(Stream<Pupil> stream) {
        return stream.flatMap(pupil -> pupil.getSubjects().stream()).mapToInt(Subject::getScore).average().orElse(0D);
    }

    /**
     * Метод вычисляет средний балл ученика по его предметам.
     *
     * @param stream поток объектов Pupil.
     * @return возвращает список из объекта Tuple (имя ученика и средний балл или 0).
     */
    public static List<Tuple> averageScoreBySubject(Stream<Pupil> stream) {
        return stream.map(pupil -> new Tuple(pupil.getName(), pupil.getSubjects().stream().mapToInt(Subject::getScore).average().orElse(0D))).collect(Collectors.toList());
    }

    /**
     * Метод вычисляет средний балл по всем предметам для каждого ученика.
     *
     * @param stream поток объектов Pupil.
     * @return возвращает список из объекта Tuple (название предмета и средний балл).
     */
    public static List<Tuple> averageScoreByPupil(Stream<Pupil> stream) {
        Map<String, Double> map = stream.flatMap(pupil -> pupil.getSubjects().stream()).collect(Collectors.groupingBy(Subject::getName, Collectors.averagingDouble(Subject::getScore)));
        return map.entrySet().stream().map(stringDoubleEntry -> new Tuple(stringDoubleEntry.getKey(), stringDoubleEntry.getValue())).collect(Collectors.toList());
    }

    /**
     * Метод возвращает лучшего ученика. Лучшим считается ученик с наибольшим баллом по всем предметам.
     *
     * @param stream поток объектов Pupil.
     * @return возвращает объект Tuple (имя ученика и суммарный балл или null).
     */
    public static Tuple bestStudent(Stream<Pupil> stream) {
        return stream.map(pupil -> new Tuple(pupil.getName(), pupil.getSubjects().stream().mapToInt(Subject::getScore).sum())).max(Comparator.comparing(Tuple::getScore)).orElse(null);
    }

    /**
     * Метод возвращает предмет с наибольшим баллом для всех студентов.
     *
     * @param stream поток объектов Pupil.
     * @return возвращает объект Tuple (имя предмета, сумма баллов каждого ученика по этому предмету или null).
     */
    public static Tuple bestSubject(Stream<Pupil> stream) {
        Map<String, Double> map = stream.flatMap(pupil -> pupil.getSubjects().stream()).collect(Collectors.groupingBy(Subject::getName, Collectors.summingDouble(Subject::getScore)));
        return map.entrySet().stream().map(stringDoubleEntry -> new Tuple(stringDoubleEntry.getKey(), stringDoubleEntry.getValue())).max(Comparator.comparing(Tuple::getScore)).orElse(null);
    }
}
