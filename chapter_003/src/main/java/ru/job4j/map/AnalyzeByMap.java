package ru.job4j.map;

import java.util.*;

/**
 * Класс реализует подсчет статистики по аттестатам учеников.
 *
 * @author Iuriy Gaydarzhi.
 * @since 21.07.2022
 */
public class AnalyzeByMap {

    /**
     * Метод вычисляет общий средний балл всех учеников.
     *
     * @param pupils Принимает объект {@link Pupil}.
     * @return Средний бал.
     */
    public static double averageScore(List<Pupil> pupils) {
        double rsl = 0;
        int count = 0;
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                rsl += subject.score();
                count++;
            }
        }
        return rsl / count;
    }

    /**
     * Метод вычисляет средний балл по каждому ученику.
     *
     * @param pupils Принимает объект {@link Pupil}.
     * @return Возвращает список из объектов {@link Label} (фамилию ученика и средний балл).
     */
    public static List<Label> averageScoreByPupil(List<Pupil> pupils) {
        List<Label> ll = new ArrayList<>();
        double sum = 0;
        int count = 0;
        for (int i = 0; i < pupils.size(); i++) {
            for (Subject subject : pupils.get(i).subjects()) {
                sum += subject.score();
                count++;
            }
            ll.add(i, new Label(pupils.get(i).name(), sum / count));
            count = 0;
            sum = 0;
        }
        return ll;
    }

    /**
     * Метод вычисляет средний балл по каждому предмету.
     *
     * @param pupils Принимает объект {@link Pupil}.
     * @return Возвращает список из объектов {@link Label} (название предмета и средний балл).
     */
    public static List<Label> averageScoreBySubject(List<Pupil> pupils) {
        List<Label> ll = new ArrayList<>();
        Map<String, Integer> map = new LinkedHashMap<>();
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                map.computeIfPresent(subject.name(), (s, integer) -> (integer + subject.score()));
                map.putIfAbsent(subject.name(), subject.score());
            }
        }
        System.out.println("map.size() = " + map.size());
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            ll.add(new Label(entry.getKey(), ((double) entry.getValue()) / map.size()));
        }
        return ll;
    }

    /**
     * Метод возвращает лучшего ученика.
     * Лучшим считается ученик с наибольшим суммарным баллом по всем предметам.
     *
     * @param pupils Принимает объект {@link Pupil}.
     * @return Возвращает объект {@link Label} (фамилию ученика и суммарный балл).
     */
    public static Label bestStudent(List<Pupil> pupils) {
        List<Label> ll = new ArrayList<>();
        double sum = 0;
        for (int i = 0; i < pupils.size(); i++) {
            for (Subject subject : pupils.get(i).subjects()) {
                sum += subject.score();
            }
            ll.add(i, new Label(pupils.get(i).name(), sum));
            sum = 0;
        }
        ll.sort(Comparator.naturalOrder());
        return ll.get(0);
    }

    /**
     * Метод возвращает предмет с наибольшим суммарным баллом для всех студентов.
     *
     * @param pupils Принимает объект {@link Pupil}.
     * @return Возвращает объект {@link Label} (фамилию предмета, сумма баллов каждого ученика по этому предмету).
     */
    public static Label bestSubject(List<Pupil> pupils) {
        int count = 0;
        List<Label> ll = new ArrayList<>();
        Map<String, Integer> map = new LinkedHashMap<>();
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                map.computeIfPresent(subject.name(), (s, integer) -> (integer + subject.score()));
                map.putIfAbsent(subject.name(), subject.score());
            }
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            ll.add(count, new Label(entry.getKey(), ((double) entry.getValue())));
            count++;
        }
        ll.sort(Comparator.naturalOrder());
        return ll.get(0);
    }
}