[![Build Status](https://travis-ci.org/IuriyG/job4j.svg?branch=master)](https://travis-ci.org/IuriyG/job4j)
![GitHub top language](https://img.shields.io/github/languages/top/IuriyG/job4j?color=success)
[![codecov](https://codecov.io/gh/IuriyG/job4j/branch/master/graph/badge.svg)](https://codecov.io/gh/IuriyG/job4j)

  # <font size="10" color="#03A9F4" face="Arial">[Job4j](https://job4j.ru "Обучение и трудоустройство Java-программистов от Junior до Senior.")</font>

Я начал обучение в проекте Job4j! 
И успешно закочнил!

<font size="3" color="#F5F5F5" face="Arial"> <b>Описание курса: </b> </font>
Ты научишься использовать инструмент сборки Maven. Будешь писать модульные тесты и оформлять свой код, 
так как это делают профессионалы. Познакомишься с базовыми принципами построения программы через 
объектно-ориентированный подход. Научишься использовать Java Collections Frameworks. 
Весь код будешь заливать на GitHub. Займешься рефакторингом кода с применением шаблонов проектирования. 
После этого уровня ты сможешь претендовать на позиции Стажер Java разработчик.



## <font size="8" color="#03A9F4" face="Arial">[Часть 001. Базовый синтаксис.](https://github.com/IuriyG/job4j/tree/master/chapter_001/src/main/java/ru/job4j) </font>



<details><summary>0. Первая программа.</summary>

        JDK.
        IDEA.
        Первая задача.
        Разбор первой программы.
        Заголовок в файле java.

</details>

<details><summary>1. Тип данных.</summary>

* Определите тип данных для переменных.
* Переменные.

* <details><summary> Элементарный калькулятор.</summary>

        package ru.job4j.converter;

        public class Converter {
          public static int rubleToEuro(int value) {
            return value / 70;
          }
          public static int euroToRuble(int value) {
            return value * 70;
          }
          public static int rubleToDollar(int value) {
            return value / 60;
          }
          public static int dollarToRuble(int value) {
            return value * 60;
          }
          public static void main(String[] args) {
            int euro = rubleToEuro(140);
            int dollar = rubleToDollar(120);
            int rubleFromEuro = euroToRuble(2);
            int rubleFromDollar = dollarToRuble(2);
            System.out.println("140 rubles are " + euro + " euro ");
            System.out.println("2 euro are " + rubleFromEuro + " rubles ");
            System.out.println("120 rubles are " + dollar + " dollars ");
            System.out.println("2 dollar are " + rubleFromDollar + " rubles ");
          }
        }
    </details>

* <details><summary>Конвертер валюты.</summary>

        package ru.job4j.converter;

        public class Converter {
          public static int rubleToEuro(int value) {
            return value / 70;
          }
          public static int euroToRuble(int value) {
           return value * 70;
          }
          public static int rubleToDollar(int value) {
            return value / 60;
          }
          public static int dollarToRuble(int value) {
            return value * 60;
          }
          public static void main(String[] args) {
            int euro = rubleToEuro(140);
            int dollar = rubleToDollar(120);
            int rubleFromEuro = euroToRuble(2);
            int rubleFromDollar = dollarToRuble(2);
            System.out.println("140 rubles are " + euro + " euro ");
            System.out.println("2 euro are " + rubleFromEuro + " rubles ");
            System.out.println("120 rubles are " + dollar + " dollars ");
            System.out.println("2 dollar are " + rubleFromDollar + " rubles ");
          }
        }
  </details>

* [Идеальный вес.](https://github.com/IuriyG/job4j/blob/master/chapter_001/src/main/java/ru/job4j/calculator/Fit.java)
* [Расстояние между точками в системе координат.](https://github.com/IuriyG/job4j/blob/master/chapter_001/src/main/java/ru/job4j/condition/Point.java)
* [Стороны прямоугольника.](https://github.com/IuriyG/job4j/blob/master/chapter_001/src/main/java/ru/job4j/condition/SqArea.java)
* [Площадь треугольника.](https://github.com/IuriyG/job4j/blob/master/chapter_001/src/main/java/ru/job4j/condition/TrgArea.java)

</details>

<details><summary>2. Тестирование.</summary>

* [Что такое тестирование.](https://github.com/IuriyG/job4j/blob/master/chapter_001/src/main/java/ru/job4j/converter/Converter.java)
* [Модульные тесты.](https://github.com/IuriyG/job4j/blob/master/chapter_001/src/test/java/ru/job4j/converter/ConverterTest.java)
* [Тесты для идеального веса.](https://github.com/IuriyG/job4j/blob/master/chapter_001/src/test/java/ru/job4j/calculator/FitTest.java)
* <details><summary>Тесты для расстояния между точками.</summary>

        package ru.job4j.condition;

        import org.junit.Assert;
        import org.junit.Test;

        public class PointTest {

        @Test
        public void distance() {
          int in = 0;
          int in2 = 0;
          int in3 = 2;
          int in4 = 0;
          int expected = 2;
          double out = Point.distance(in, in2, in3, in4);
          Assert.assertEquals(expected, out,0.01);
          }
        }
  </details>

* <details><summary>Тесты для стороны прямоугольника.</summary>

        package ru.job4j.condition;

        import org.junit.Assert;
        import org.junit.Test;

        public class SqAreaTest {

        @Test
        public void square() {
          int in = 6;
          int in2 = 2;
          int expected = 2;
          double out = SqArea.square(in, in2);
          Assert.assertEquals(expected, out, 0.01);
          }
        }
  </details>

</details>

<details><summary>3. Автоматическая сборка, Maven.</summary>

        Установить и настроить Maven 3.
        Подключить сборщик Maven.
        Зависимости.
        Maven c множественными модулями.
        Интеграция Maven и IDEA.

</details>

<details><summary>4. Хранение исходного кода. Git.</summary>

        Установить и настроить msysgit.
        Завести новую учетную запись и репозиторий под курс.
        Репозиторий — привязка к github.  
        Коммиты на решения задач.
        Git с разных компьютеров.
        Интеграция Git и IDEA.

</details>

<details><summary>5. Операторы ветвления.</summary>

* [Операторы ветвлений.](https://github.com/IuriyG/job4j/commit/1ff82b02529a0264af7f862ae94a3b7c97ac571f)
* [Глупый бот](https://github.com/IuriyG/job4j/commit/1ff82b02529a0264af7f862ae94a3b7c97ac571f)
* [Максимум из двух чисел.](https://github.com/IuriyG/job4j/blob/master/chapter_001/src/main/java/ru/job4j/condition/Max.java)
* [А существует ли треугольник?](https://github.com/IuriyG/job4j/commit/4c7ed006a563cfdad0589bf3d9bf64cdd1a451ce)
* [Максимум из трех чисел.](https://github.com/IuriyG/job4j/commit/503243e92fa20896e7715a629c0fa6d4e43afeca)
* [Отладка программы в IDEA.](https://github.com/IuriyG/job4j/commit/187733e95bb10eec59d20fde69cc0f413cc298ac)

</details>

<details><summary>6. Циклы.</summary>

* Теория.
* [Подсчет суммы чётных чисел в диапазоне.](https://github.com/IuriyG/job4j/commit/27af6c9c2d75f57e25ae173971ac7b66515a9ac2)
* [Создать программу, вычисляющую факториал.](https://github.com/IuriyG/job4j/commit/bd4b5d1c57c6b4eee962dea0d04550f700b2c819)
* [Построить шахматную доску в псевдографике.](https://github.com/IuriyG/job4j/commit/a5201b9441d691e5e8f28bef3367fc2b0c79a89e)
* [Протеиновая диета.](https://github.com/IuriyG/job4j/commit/f30d371b75e88de6aedb50a4166eb614fe429f5d)
* [Простое число.](https://github.com/IuriyG/job4j/commit/6be8d02c9ea25ff853d76520e7c01bd3fef7d1f1)
* [Простые числа.](https://github.com/IuriyG/job4j/commit/e9f9ad026b4daada475bd853983627a3fb04b6df)
* [Ипотека.](https://github.com/IuriyG/job4j/commit/3f2c5d9f630575790fbc8a2f403a9a7a61b15f6e)
* [JavaDoc. Code convention.](https://github.com/IuriyG/job4j/commit/aa91752a14900d1b121fcafc1e481160ec086184)
* [Крест в псевдографике.](https://github.com/IuriyG/job4j/commit/49ad9c502b2a9d450ef5fa015d4332a39341dc9a)

</details>

<details><summary>7. Массивы.</summary>

* Теория.
* [Заполнить массив степенями чисел.](https://github.com/IuriyG/job4j/commit/71d93de7f8ed1c62c95dede382618f67be2a9a45)
* [Классический поиск перебором.](https://github.com/IuriyG/job4j/commit/f7407f300b1677c0a0337798d4c4650db74fff25)
* [Перевернуть массив.](https://github.com/IuriyG/job4j/commit/5f1e199a22ec2a991d0811d60b1437eeba4cc30d)
* [Массив заполнен true или false.](https://github.com/IuriyG/job4j/commit/6938ae8ab5a8b039f1b78c93873a4c7f94c62080)
* [Слово начинается с ...](https://github.com/IuriyG/job4j/commit/5c3d69f24347c01f0ac6462de16b14744d51decd)
* [Слово заканчивается с ...](https://github.com/IuriyG/job4j/commit/1df84e70256507547877afa1f40821a9db5d0b42)
* [Поиск индекса в диапазоне.](https://github.com/IuriyG/job4j/commit/edb15afad899b2d8067d3098a4524c6fff03a566)
* [Поиск минимального числа в массиве.](https://github.com/IuriyG/job4j/commit/d8eb240dd4e22c9e22588ceb497ed54be81b1041)
* [Поиск минимума в диапазоне.](https://github.com/IuriyG/job4j/commit/399e5f27e725b3ce7c39842140d73de2532a5dc9)
* [Сортировка выборкой.](https://github.com/IuriyG/job4j/commit/6a2d890546b488982461db3606f8e75fbaf39c55)
* [Двухмерный массив. Таблица умножения.](https://github.com/IuriyG/job4j/commit/a5d8f1219dd25198d09d44d96e773cdd7ee093ae)
* [Выигрышные комбинации в сокобан.](https://github.com/IuriyG/job4j/commit/bf836ddca012ccb4e316e381dda75c3754b043b3)
* [Дефрагментация массива.](https://github.com/IuriyG/job4j/commit/d30a78cb6d3992af065b7314548c66e247b6998a)
* Checkstyle.

</details>

<details><summary>8. Контрольные вопросы и тестовые задания.</summary>

* <details><summary>Сдача теории.</summary>

      Вопросы. 
        1. Что такое виртуальная машина?
        2. К какому типу языка программирования относится Java?
        3. Из каких компонентов состоит Java (JDK, JRE, JVM)?
        4. Для чего используется JDK?
        5. Для чего используется JRE? 
        6. Для чего используется VM?
        7. Расскажите про примитивные типы.
        8. Опишите шаги для компиляции и запуска приложения в консоли (javac java).
        9. Что такое "оператор условия"?
        10. Какие типы операторов условия существуют?
        11. Расскажите про булевы операции || &&?  Расскажите элементы таблицы истинности?
        12. Что такое тернарное условие?
        13. Что такое циклы и для чего они используются?
        14. Для чего используется цикл for?
        15. Для чего используется цикл foreach?
        16. Для чего используется цикл while?
        17. Для чего используется цикл do while?
        18. Что такое массив?
        19. Как создать массив?
        20. Как присвоить значение ячейке массива?
        21. Как можно пройти по всем элементам массива?
        22. Как можно найти элемент в массиве?
        23. Что будет, если записывать элемент по индексу -1?
        24. Как удалить ячейку в массиве?
        25. Как отредактировать ячейку в массиве?

* [Тестовое задание: Объединить два массива.](https://github.com/IuriyG/job4j/commit/d9b0b7fc2b4ae21c9a59ac181ad2b4593cad70ab)
* [Тестовое задание: Сокобан.](https://github.com/IuriyG/games_oop_javafx/commit/372d19328e6dab204c496ff8c4871197c3c1fc35)

</details>

  </details>



## <font size="8" color="#03A9F4" face="Arial">[Часть 002. ООП.](https://github.com/IuriyG/job4j/tree/master/chapter_002/src/test/java/ru/job4j) </font>



<details><summary>0. Инструменты.</summary>

* <details><summary>Качество кода.</summary>

  * [Создание модуля maven.](https://github.com/IuriyG/job4j/commit/b1ebce1cc5c7438dad17aa4efdbde827199a6127)
  * [Чтение кода и базовые ошибки.](https://github.com/IuriyG/job4j/commit/f57bb7ffd7d6d672cb0c53c67adc4a5bd3a72d3d)

  </details>

* <details><summary>Git.</summary>

  * [Ветки.](https://github.com/IuriyG/job4j/commit/cfa1558c010af7557c73c097bfd2f55b54afe629)
  * [Ветки в IDEA.](https://github.com/IuriyG/job4j/commit/0243bad8dcc65fbb901e407bdc2062101863e872)
  * [Объединение нескольких коммитов.](https://github.com/IuriyG/job4j/commit/acd4cb15a26f9bdab522a4b17ee209100ac6641a)
  * [Слияние веток.](https://github.com/IuriyG/job4j/commit/3a2534e208300869c178c489b2422b324c0108d6)
  * [Конфликты слияния.](https://github.com/IuriyG/job4j/commit/62b113f3fef56b44347489726cb06c073a7b64f0)
  * [Удаление ветки и создание ветки из коммита.](https://github.com/IuriyG/job4j/branches)

  </details>

* <details><summary>Отладка.</summary>

      Дебаг в IDEA.

  </details>

  </details>

<details><summary>1. Классы и объекты.</summary>

* Теория.
* [Создание объекта.](https://github.com/IuriyG/job4j/commit/6a566332f0d82436a45604b60b3d4e08d0d210df)
* [Вызов метода объекта.](https://github.com/IuriyG/job4j/commit/3c3e4356324ffaaab335dbe30b1554eb6e16b41b)
* [Вызов метода с аргументами.](https://github.com/IuriyG/job4j/commit/50142df85b1dc9d8e492584f74cf77404806b953)
* [Вызов метод с возвращаемым типом.](https://github.com/IuriyG/job4j/commit/4dd833800929161605a31cb95f2583b1b95aeab5)
* [Поля объекта.](https://github.com/IuriyG/job4j/commit/53cefe5ce0cf091cf272053e86f84c8c95e95778)
* [Взаимодействие объектов.](https://github.com/IuriyG/job4j/commit/b3a94d98fa8fb559963b03b45fa20c43fbf0f54f)
* [Состояние объекта.](https://github.com/IuriyG/job4j/blob/5c66331cc40ae5df2913e2dfb4a5ebd200cbe0a5/chapter_001/src/main/java/ru/job4j/oop/Battery.java)
* [Рефакторинг — Расстояние между точками.](https://github.com/IuriyG/job4j/commit/d5bc899704626bff425571d228400be4ec7c504d)
* [Рефакторинг — Площадь треугольника.](https://github.com/IuriyG/job4j/commit/5857774651d6ae2fd456a8649b1598f982b0ab28)
* [Перегрузить метод max для трех чисел.](https://github.com/IuriyG/job4j/commit/66c272bebd29e874c83670169a7ef701ffeeaedc)
* [Расстояние между точками в трехмерном пространстве.](https://github.com/IuriyG/job4j/commit/6f3e96c24e7fb61a673ff0d23fd25d3f4226cd81)
* Локальные переменные и поля.
* Зона видимости переменных.

</details>

<details><summary>2. Наследование</summary>

* Теория.
* [Конструктор по умолчанию.](https://github.com/IuriyG/job4j/commit/f420d24e1a709d9041628bf154737ca0bf0de71b)
* [Перегрузка конструктора.](https://github.com/IuriyG/job4j/commit/9fc99486238eb9f541e40d050681b54fede19231)
* [Реализация профессий в коде.](https://github.com/IuriyG/job4j/commit/a94d74493931f67c96e3f6644cb375ca2e419256)
* [Переопределение.](https://github.com/IuriyG/job4j/commit/779e88a94d371bf7489bb09fff635b75e7039dbc)
* [Аннотация @Override.](https://github.com/IuriyG/job4j/commit/603496b9b6e260769c1fece04c1dafaec6f8344c)

</details>

<details><summary>3. Инкапсуляция.</summary>

* [Теория.](https://github.com/IuriyG/job4j/blob/1e40893ad747eebd28285183e68ea189216eaa68/chapter_001/src/main/java/ru/job4j/encapsulation/Config.java)
* Общая задача на второй модуль.
* [Модель данных.](https://github.com/IuriyG/job4j/blob/bb67f2686ce1ecf2335f8fa18870a4a96c8ec023/chapter_001/src/main/java/ru/job4j/pojo/College.java)
* [Массивы и модели.](https://github.com/IuriyG/job4j/commit/50f9639ea30eac74be4399b806ee99139d4d37ab)
* [Удаление моделей из массива.](https://github.com/IuriyG/job4j/commit/844e4402b626e0f1192ec143eebd8a4d2e528846)
* Сравнение моделей. Метод equals.
* [Реализовать класс Tracker.](https://github.com/IuriyG/job4j/commit/c7bf953bbff74de6fe6fe4dd37852f3916ffef4f)

</details>

<details><summary>4. Полиморфизм.</summary>

* Теория.
* [Чтение из консоли. Класс Scanner.](https://github.com/IuriyG/job4j/commit/992aa46d340253e54b222a148949a4d6628fbbbd)
* [Scanner и чтение числа из консоли.](https://github.com/IuriyG/job4j/blob/a5fb220413b34d797b6c3b1a9a07b2f2a9cdd933/chapter_001/src/main/java/ru/job4j/io/Matches.java)
* [Реализация класса StartUI.](https://github.com/IuriyG/job4j/commit/2b5885300f07f255176e6472289b9986b9da5230)
* [Интерфейс Input.](https://github.com/IuriyG/job4j/blob/1d85898e9b/chapter_001/src/main/java/ru/job4j/poly/Bus.java)
* [Приведение типов. Повышение типа и понижение типа.](https://github.com/IuriyG/job4j/commit/b476be5fe00441e9d04a7e24e33b2c950598cbbc)
* Зависимости классов.
* [Разрыв зависимости StartUI от Scanner.](https://github.com/IuriyG/job4j/commit/64ca3f4587a234971740fe74aae699c24b241129)
* [Статические методы.](https://github.com/IuriyG/job4j/commit/4e9094bc89f02bd0d1ba5791d9715ece20ffc5b5)
* [Input и полиморфизм.](https://github.com/IuriyG/job4j/commit/f844f67043781cc4cf2b10ad40abc073d5520959)
* [Тестирование. Подготовка данных.](https://github.com/IuriyG/job4j/commit/ef42fe4319c9bc8c353026f8b8096fa86b95c509)
* [Создания Manifest для проекта Tracker.](https://github.com/IuriyG/job4j/commit/16748e777f515be00751bea94122b2f6c7dcf70c)
* [Шаблон проектирования — Стратегия.](https://github.com/IuriyG/job4j/commit/84fc927ebbdfc6924cc4e6e6a13d38ab12b0a358)
* [Реализация меню за счет шаблона стратегия.](https://github.com/IuriyG/job4j/commit/5724cbf36cc3e7c0156dfc2161151541f7b5ed73)
* [Написать тесты на StartUI.](https://github.com/IuriyG/job4j/commit/1cee9d13ddd5d60f949c7270d46189afa089ec6c)
* [Рефакторинг теста @Before @After.](https://github.com/IuriyG/job4j/commit/e877671ad9a7999903961ba6c8a1ce2a43555bb9)
* [Тесты вывода на консоль в StartUI.](https://github.com/IuriyG/job4j/commit/8ea012a1855f3467c2498fc4e24af24be5a24cb1)

</details>

<details><summary>5. Исключения.</summary>

* [Теория.](https://github.com/IuriyG/job4j/commit/7bf6794e1c7de2002d0119bdb7d2d4a29ea2406a)
* [Обеспечить бесперебойную работу приложения Tracker.](https://github.com/IuriyG/job4j/commit/79d9e9f48e5a7f265bab96d4601bbdbaca62d668)
* [Рефакторинг — Шаблон Декоратор для валидатора.](https://github.com/IuriyG/job4j/commit/90c056949c23e0d00597c0ee98730db96ccb6c07)
* [if-else-throw.](https://github.com/IuriyG/job4j/commit/85b980cceb956732be88c73a51aed4cc254d6ff2)

</details>

<details><summary>6. Абстрактные и анонимные классы</summary>

        Теория.
        Рефакторинг — Перенести общие методы в абстрактный класс.

</details>

<details><summary>7. Шаблоны проектирования</summary>

* Наследование, композиция и агрегация.
* [Singleton.](https://github.com/IuriyG/job4j/commit/2e5194c4df6b7e4975b26ac08329676535bd2b69)
* Фабричный метод, абстрактная фабрика.

</details>

<details><summary>8. Контрольные вопросы и тестовое задание.</summary>

* [Каркас шахматной доски.](https://github.com/IuriyG/games_oop_javafx/commit/650566718eec5f27b099292b417a82ac7751e26c)

* <details><summary>Сдача теории.</summary>

      Вопросы.
        1. Что такое ООП?        
        2. Базовые концепции ООП?
        3. Укажите из каких элементов состоит класс.
        4. Что такое конструктор?
        5. Можно ли наследовать конструктор?
        6. Что такое перегрузка конструктора?
        7. Что такое статический метод?
        8. Что такое не статический метод?
        9. Для чего используется ключевое слово this?
        10. Какой класс является базовый родительным классов для всех классов?
        11. Что такое наследование? Приведите примеры из реальной жизни.
        12. Опишите процесс создания нового объекта.
        13. Как вызвать метод из родительского класса?
        14. Что такое переопределение метода?
        15. Можно ли переопределить статический метод?
        16. Что такое виртуальная функция и используются ли они в Java?
        17. Что такое перегрузка метода?
        18. Можно ли изменить тип возвращаемых данных при перегрузке метода?
        19. Что такое множественное наследование? Как его можно реализовать в Java.
        20. Что такое полиморфизм? Приведите примеры из реальной жизни.
        21. Что такое инкапсуляция?
        22. Как реализована инкапсуляция в Java? 
        23. Можно ли применить модификаторы доступ к конструкторам?
        24. Что такое интерфейс?
        25. Какие типы исключительных ситуаций бывают?
        26. Назовите основные методы класса Object?
        27. Что такое шаблоны проектирования?
        28. Объясните шаблон - декоратор.
        29. Объясните шаблон - стратегия.

</details>
</details>



## <font size="8" color="#03A9F4" face="Arial">[Часть 003. Collections. Lite.](https://github.com/IuriyG/job4j/tree/master/chapter_003/src/main/java/ru/job4j) </font>



<details><summary>1. Collections Framework.</summary>

* [Знакомство с коллекциями. ArrayList.](https://github.com/IuriyG/job4j/commit/b156c0553f7a87522e99fab0272eed50764da1c9)
* [Телефонный справочник на базе ArrayList.](https://github.com/IuriyG/job4j/commit/baec4bd40b89b940fb85f0cddc9e28c394d37872)
* [Очередь с приоритетом на LinkedList.](https://github.com/IuriyG/job4j/commit/ba134f8c663aa1450d6497fc8b40e2ea41653993)
* [Конвертация ArrayList в двухмерный массив.](https://github.com/IuriyG/job4j/commit/336f85238f7584514bf513d6320cf0dbd2a1fd0f)
* [Конвертация двумерного массива в ArrayList.](https://github.com/IuriyG/job4j/commit/5c9b3be314dbc1327f508bf3b7dbbca824b5a404)

</details>

<details><summary>2. Обобщения.</summary>

* [Знакомство с коллекциями. HashSet.](https://github.com/IuriyG/job4j/commit/7a2192554a3e86d00e1abeee6dccbcb4ca637a14)
* [Конвертация листа массивов в один лист Integer.](https://github.com/IuriyG/job4j/commit/7ac5744e81874fd2da6ab775d5d703eaca5e002c)
* [Написать программу преобразования List в Map.](https://github.com/IuriyG/job4j/commit/f92c535809b4822eb49b4480f57fab1e2cc9b9e1)
* [Изменить программу Tracker из 2-го модуля.](https://github.com/IuriyG/job4j/commit/3e5c97a87ca7c162969db1d0d727ab42a0f4d2c5)

</details>

<details><summary>3. Сортировка.</summary>

* [Теория.](https://github.com/IuriyG/job4j/commit/6aab12aa3314d149287b588f8750fa1aaecbea04)
* [Организовать сортировку User.](https://github.com/IuriyG/job4j/commit/84b1faf4c355683a4e0c044aec9d97e0140855f5)
* [Сортировка User с использованием Comparator.](https://github.com/IuriyG/job4j/commit/b4f738005ac1d535cd897fd97363e130bdede5f7)
* [Компаратор для строк.](https://github.com/IuriyG/job4j/commit/ccbd973c0b7e07a771bee830c2d58587280b6346)

</details>

<details><summary>4. Инструменты.</summary>

* JaCoCo. Процент покрытие тестами.
* [Travis CI.](https://github.com/IuriyG/job4j/commit/774580d0f879bbc782a23da2db83d964fdf09145)

</details>

<details><summary>5. Контрольные вопросы</summary>

* Peer review.
* [Банковские переводы.](https://github.com/IuriyG/job4j/commit/3ea745f8cd88956ddd3deaafe99967ef1e79a24a)

* <details><summary>Сдача теории.</summary>

      Вопросы.
        1. Что такое "коллекция". 
        2. Перечислите основные методы из интерфейса java.util.Collection.
        3. Назовите преимущества использования коллекций.
        4. Какие данные могут хранить коллекции?
        5. Какие есть типы коллекций? Как они характеризуются?
        6. Назовите основные реализации List, Set, Map.
        7. В чём отличие ArrayList от LinkedList?
        8. В чём отличие HashSet от TreeSet?
        9. В чём отличие Set от Map?
        10. Как задается порядок следования объектов в коллекции, как отсортировать коллекцию?
        11. Чем отличается Comparable от Comparator?
        12. Что такое сортировка по принципу Natural Order?
        13. Что такое equals и hashcode?
        14. Какие есть способы перебора всех элементов List?
        15. Как реализован цикл foreach?
        16. В чем разница между Iterator и Iterable?
        17. Как происходит удаление элементов из ArrayList?
        18. Как происходит удаление элементов из LinkedList?

</details>
</details>



## <font size="8" color="#03A9F4" face="Arial">[Часть 004. FP, Lambda, Stream API.](https://github.com/IuriyG/job4j/tree/master/chapter_004/src/main/java/ru/job4j) </font>



<details><summary>1. Lambda.</summary>

* Функциональные интерфейсы.
* [Ссылки на методы.](https://github.com/IuriyG/job4j/commit/5f9081929a906e939619b038ea469da45973937f)
* [Зона видимости в лямбда-выражении и исключения.](https://github.com/IuriyG/job4j/commit/00916e8d56b86e773d787217b997198d63166c73)
* [Подсчет функции в диапазоне.](https://github.com/IuriyG/job4j/commit/319ebd6d8addc257e38346cbf80af3f4f0cbaf37)
* [Функции высшего порядка.](https://github.com/IuriyG/job4j/commit/5dfd713be88f9bdcb926fea76e2fcfa598934ee4)

</details>

<details><summary>2. Stream API. </summary>

* [Теория.](https://github.com/IuriyG/job4j/commit/1215063d2200fee4658b7bf12d7f09ab695ded15)
* [Фильтрация учеников.](https://github.com/IuriyG/job4j/commit/925c7c266e321e18e2790307072c1834ce054105)
* [Список адресов.](https://github.com/IuriyG/job4j/commit/84586b027a55c3ddfeb7db706360ae4dbe190669)
* [Уникальность элементов и сортировка.](https://github.com/IuriyG/job4j/commit/c5b0b5b9a7b44f030bfb52ad5f4dd9c3e23c9eca)
* [Преобразование List в Map.](https://github.com/IuriyG/job4j/commit/71041489b3ba82fac161e1e08252fc5ea25f45c3)
* [Преобразование матрицы чисел в список чисел.](https://github.com/IuriyG/job4j/commit/c955aca5e2ec287f3fdb78f24b5791ec321bdf45)
* <details><summary>Тестовое задание из модуля коллекции Lite переделать на Stream API.</summary>

  * [Метод findByPassport();](https://github.com/IuriyG/job4j/commit/bd4f8205e019d33a14387f7b7a119b746922ee71)
  * [Метод findByRequisite();](https://github.com/IuriyG/job4j/commit/5ab9bd60f857501a7f2c5df919ab3d36e172164c)

</details>
</details>

<details><summary>3. Jdk 1.9, 1.10, Нововведения.</summary>

* [Stream API улучшения.](https://github.com/IuriyG/job4j/commit/c36b22fac65100d277baf5b06767394d990b2e67)
* [Collection API Улучшения.](https://github.com/IuriyG/job4j/commit/afbf9d97f4d3cd638a4febb8aab5d940921ec883)
* [Local-Variable Type Inference.](https://github.com/IuriyG/job4j/commit/5e5fa2c4257e3a2e993af74b1e931a560ee0e6e4)

</details>

<details><summary>4. Контрольные вопросы.</summary>

* [Реализовать класс для подсчета статистики по аттестатам учеников.](https://github.com/IuriyG/job4j/commit/7cd2f583a11afe8e29fabdb38bcefcbe33a69220)
* <details><summary>Сдача теории.</summary>

      Вопросы.
        1. Что такое lambda-выражение?      
        2. Что такое функциональные интерфейсы?
        3. Перечислите функциональные интерфейсы из пакета java.util.function.
        4. Что такое функции высшего порядка?
        5. Какие функциональные интерфейсы из пакета java.util.function поддерживают функции высшего порядка?
        6. Что такое ссылки на методы?
        7. Что такое ссылки на конструкторы?
        8. Расскажите о зоне видимости переменных в lambda - выражениях?
        9. Как быть в ситуации, если внутри lambda - выражении операторы могут выкинуть исключение?
        10. Что такое Stream API?
        11. Расскажите, какой шаблон проектирования используется внутри Stream API?
        12. Перечислите конвейерные методы Stream API.
        13. Перечислите терминальные методы Stream API.
        14. Что такое ленивая загрузка?
        15. Что делает метод filter?
        16. Что делает метод map.
        17. Что делает метод flatMap?
        18. Что делает метод collect?
        19. Что делает метод reduce?
        20. Что делает метод findFirst?
        21. Возможно ли прервать выполнение потока по аналогии с break?
        22. Возможно ли пропустить элемент потока по аналогии с continue?
        23. Что такое Optional?
        24. Перечислите методы Optional?
        25. Расскажите про фабричные методы List.of, Set.of, Map.of?
        26. Для чего используется ключевое слово var?
        27. В каких случаях можно использовать var?

</details>
</details>

<details><summary>5. Тестовое задание после прохождения курса.</summary>

* [EasyStream.](https://github.com/IuriyG/job4j/commit/cf76ef208621b688008f348c676145b769e68438)

</details>
