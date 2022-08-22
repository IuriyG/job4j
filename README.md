[![Build Status](https://travis-ci.com/IuriyG/job4j.svg?branch=master)](https://travis-ci.org/IuriyG/job4j)
[![jdk17](https://img.shields.io/badge/JDK-17-blue.svg)](http://jdk.java.net/17/)
![GitHub top language](https://img.shields.io/github/languages/top/IuriyG/job4j)
![Lines of code](https://img.shields.io/tokei/lines/github/IUriyg/job4j)
[![CodeFactor](https://www.codefactor.io/repository/github/iuriyg/codewars/badge)](https://www.codefactor.io/repository/github/iuriyg/job4j)
[![codecov](https://codecov.io/gh/IuriyG/job4j/branch/master/graph/badge.svg)](https://codecov.io/gh/IuriyG/job4j)

# <font size="10" color="#03A9F4" face="Comic sans MS">[Job4j](https://job4j.ru "Обучение и трудоустройство Java-программистов от Junior до Senior.")</font>

Начал обучение в проекте Job4j!  
И успешно окончил: <font size="3" color="#03A9F4" face="Comic sans MS">[Уровень "Стажер."](https://job4j.ru/courses/java_with_zero_to_job.html "Уровень <Стажер>")</font>
Курс состоит из 4 блоков, состав приведен ниже.
Курс периодически обновляется, по возможности решаю новые задачи и добавляю! В некоторых первых коммитах могут отсутствовать JavaDoc, но они добавляются в следующих, после проверки ментором решения задачи.  

<font size = "4" color = "#DEDEDE" face = "Comic sans MS">Описание курса: </font>
Ты научишься использовать инструмент сборки Maven. Будешь писать модульные тесты и оформлять свой код, 
так как это делают профессионалы. Познакомишься с базовыми принципами построения программы через 
объектно-ориентированный подход. Научишься использовать Java Collections Frameworks. 
Весь код будешь заливать на GitHub. Займешься рефакторингом кода с применением шаблонов проектирования. 
После этого уровня ты сможешь претендовать на позиции Стажер Java разработчик.

## <font size="8" color="#03A9F4" face="Comic sans MS">[Часть 1. Базовый синтаксис.](https://github.com/IuriyG/job4j/tree/master/chapter_001/src/main/java/ru/job4j) </font>

  <details><summary>1. Первая программа.</summary>

* JDK.
* IDEA.
* MSysGit. Установить и настроить.
* [GitHub. Регистрация.](https://github.com/IuriyG/job4j_elementary)
* Генерация публичного и закрытого ключа для github.
* Импорт проекта в IDEA.
* Создание репозитория и привязка к исходному коду.
* [Загрузка файлов на github.](https://github.com/IuriyG/job4j_elementary/blob/master/src/ru/job4j/Echo.java)
* [Фиксация изменений на github.](https://github.com/IuriyG/job4j_elementary/commit/94b8ddc702b079b0b7687626d9bc364a456204a3)
* Кто такой - CI Бот?
* [Разбор первой программы.](https://github.com/IuriyG/job4j/blob/master/chapter_001/src/main/java/Multiple.java)
* Заголовок в файле java.
* Процесс компиляции и запуска Java программы.
* Checkstyle.

  </details>

 <details><summary>2. Тип данных.</summary>

* Что такое переменная.
* Определите тип данных для переменных.
* Переменные.
* Арифметические операции.
* Переназначение переменной.
* Методы.
* [Аргументы.](https://github.com/IuriyG/job4j/blob/df61cdf30eb3ce430d15c4b6658d38a9c0aedac7/chapter_001/src/main/java/ru/job4j/calculator/ArgMethod.java)
* Результат работы метода.
* [Конвертер валюты.](https://github.com/IuriyG/job4j/blob/master/chapter_001/src/main/java/ru/job4j/converter/Converter.java)
* [Идеальный вес.](https://github.com/IuriyG/job4j/blob/master/chapter_001/src/main/java/ru/job4j/calculator/Fit.java)
* [Расстояние между точками в системе координат.](https://github.com/IuriyG/job4j/blob/master/chapter_001/src/main/java/ru/job4j/condition/Point.java)
* [Стороны прямоугольника.](https://github.com/IuriyG/job4j/blob/master/chapter_001/src/main/java/ru/job4j/condition/SqArea.java)
* [Площадь треугольника.](https://github.com/IuriyG/job4j/blob/master/chapter_001/src/main/java/ru/job4j/condition/TrgArea.java)
* [String.](https://github.com/IuriyG/job4j/blob/b4b6e6c3fe3da680feb7254db157c3ec6443ee7a/chapter_001/src/main/java/ru/job4j/condition/Greeting.java)
* Преобразование примитивных типов.

</details>

<details><summary>3. Тестирование.</summary>

* [Что такое тестирование.](https://github.com/IuriyG/job4j/blob/master/chapter_001/src/main/java/ru/job4j/converter/Converter.java)
* [Модульные тесты.](https://github.com/IuriyG/job4j/blob/master/chapter_001/src/test/java/ru/job4j/converter/ConverterTest.java)
* [Что такое import.](https://github.com/IuriyG/job4j/commit/20e5b5735a2ec22fa120992b694ec805b2d67903)
* [Входные данные в тесте.](https://github.com/IuriyG/job4j/commit/360664ec1c6350104d93b524f5ba11d8ad16b84b)
* [Тесты для задачи "идеальный вес".](https://github.com/IuriyG/job4j/blob/master/chapter_001/src/test/java/ru/job4j/calculator/FitTest.java)
* [Тесты для расстояния между точками.](https://github.com/IuriyG/job4j/blob/master/chapter_001/src/test/java/ru/job4j/condition/PointTest.java)
* [Тесты для стороны прямоугольника.](https://github.com/IuriyG/job4j/blob/master/chapter_001/src/test/java/ru/job4j/condition/SqAreaTest.java)
* Аннотация @Test

</details>

<details><summary>4. Оператор ветвления.</summary>

* [Операции сравнения.](https://github.com/IuriyG/job4j/commit/63ffc3c4ffbd076f2e7627e1a13c2a0eff576857)
* Операторы ветвлений.
* [Оператор if с блоком else](https://github.com/IuriyG/job4j/commit/8e5227d637137af0437d4040025f7ed3bc05804c)
* [Операторы сравнения в String.](https://github.com/IuriyG/job4j/commit/0cc1d592985f55e2e4f458a4638c82a66079664c)
* [Глупый бот](https://github.com/IuriyG/job4j/blob/master/chapter_001/src/main/java/ru/job4j/condition/DummyBot.java)
* Блок-схемы.
* Псевдокод.
* [Тернарное сравнение.](https://github.com/IuriyG/job4j/commit/d3e7f8c1b9241ee5b8489f5082482d9f0bd3af42)
* Булева логика.
* [Оператор &&](https://github.com/IuriyG/job4j/commit/041ae46c8247d968435badd97872b1ad9376ac64)
* [Оператор ||](https://github.com/IuriyG/job4j/commit/db350c616de03624be02040dafa8caa1839fff8b)
* [Логическое отрицание!](https://github.com/IuriyG/job4j/commit/4a07287e93dde6c0a9d594b8613d7ac5dba91bb1)
* [if c return.](https://github.com/IuriyG/job4j/commit/276bc4ba6ef721cc55200178aa654c28d435adbc)
* [Множественное логическое выражение И](https://github.com/IuriyG/job4j/commit/4c7ed006a563cfdad0589bf3d9bf64cdd1a451ce)
* [Math.abs](https://github.com/IuriyG/job4j/blob/dd1983b874b0ab6966c90c94dd7a07ab8bbbe4a1/chapter_001/src/main/java/ru/job4j/condition/ChessBoard.java)
* Вложенный оператор if else. Запутанный код
* [Отладка программы в IDEA.](https://github.com/IuriyG/job4j/commit/187733e95bb10eec59d20fde69cc0f413cc298ac)
* [Switch.](https://github.com/IuriyG/job4j/commit/1020789372e19b29e75e21fadf6ec207270b74ed)
* [Switch - matcher.](https://github.com/IuriyG/job4j/commit/e6dc3798a4e63a8d96735e25257934d2bcb0eb93)

</details>

<details><summary>5. Циклы.</summary>

* Цикл for. Определение.
* [Сумма чисел.](https://github.com/IuriyG/job4j/commit/4aa96600313f470d1a1844148f47162d03a17142)
* Вечный цикл for.
* [Подсчет суммы чётных чисел в диапазоне](https://github.com/IuriyG/job4j/blob/master/chapter_001/src/main/java/ru/job4j/loop/Counter.java)
* [Создать программу, вычисляющую факториал.](https://github.com/IuriyG/job4j/commit/bd4b5d1c57c6b4eee962dea0d04550f700b2c819)
* [Построить шахматную доску в псевдографике.](https://github.com/IuriyG/job4j/commit/a5201b9441d691e5e8f28bef3367fc2b0c79a89e)
* [Протеиновая диета](https://github.com/IuriyG/job4j/commit/f30d371b75e88de6aedb50a4166eb614fe429f5d)
* [Простое число](https://github.com/IuriyG/job4j/commit/6be8d02c9ea25ff853d76520e7c01bd3fef7d1f1)
* [Простые числа](https://github.com/IuriyG/job4j/blob/master/chapter_001/src/main/java/ru/job4j/loop/PrimeNumber.java)
* [Ипотека](https://github.com/IuriyG/job4j/commit/3f2c5d9f630575790fbc8a2f403a9a7a61b15f6e)
* Именование классов и переменных
* [Крест в псевдографике.](https://github.com/IuriyG/job4j/commit/49ad9c502b2a9d450ef5fa015d4332a39341dc9a)
* [Генерация конструкций в IDEA](https://github.com/IuriyG/job4j/commit/905e47d661ed1ba4fa26f7421f6c20965bda78c6)

</details>

<details><summary>6. Массивы.</summary>

* Объявление массива.
* [Размер массива.](https://github.com/IuriyG/job4j/commit/58885f67ed29c3e19dfe9c8d3fe160b8ac3aa7b0)
* [Заполнение массива.](https://github.com/IuriyG/job4j/commit/1a43b1504b2c5327b17d015f964ed0c1091a3fe4)
* [Массивы и цикл for.](https://github.com/IuriyG/job4j/commit/57d4c1df032bbf913440742eb7f88df29043a0dd)
* [Массивы и цикл for-each.](https://github.com/IuriyG/job4j/commit/57d4c1df032bbf913440742eb7f88df29043a0dd)
* [Заполнить массив степенями чисел.](https://github.com/IuriyG/job4j/commit/71d93de7f8ed1c62c95dede382618f67be2a9a45)
* [Массивы в тестах.](https://github.com/IuriyG/job4j/commit/71d93de7f8ed1c62c95dede382618f67be2a9a45)
* [Классический поиск перебором.](https://github.com/IuriyG/job4j/commit/f7407f300b1677c0a0337798d4c4650db74fff25)
* Упорядочить массив.
* [Выход за границу массива.](https://github.com/IuriyG/job4j/commit/0e322405cbc8aa593e418aeb202a57b2ce4fb315)
* [Переставить элементы массива.](https://github.com/IuriyG/job4j/commit/10b7657f20b58a37d3231fdbca6cc725e8fd8291)
* [Перевернуть массив.](https://github.com/IuriyG/job4j/commit/5f1e199a22ec2a991d0811d60b1437eeba4cc30d)
* [Массив заполнен true или false.](https://github.com/IuriyG/job4j/blob/4e7b11489354b53d6b24c251f6b85149f771d327/chapter_001/src/main/java/ru/job4j/array/Check.java)
* [Слово начинается с ...](https://github.com/IuriyG/job4j/commit/5c3d69f24347c01f0ac6462de16b14744d51decd)
* [Сравнить последние элементы двух массивов.](https://github.com/IuriyG/job4j/blob/3bf4b2f2abbdc516d96072636debdad1c3466e93/chapter_001/src/main/java/ru/job4j/array/EqLast.java)
* [Обход массива с последнего элемента.](https://github.com/IuriyG/job4j/blob/329baf3a6797b85939f0a97bfc30a9a67f4be4b3/chapter_001/src/main/java/ru/job4j/array/PrintEvenElements.java)
* [Слово заканчивается на ...](https://github.com/IuriyG/job4j/commit/1df84e70256507547877afa1f40821a9db5d0b42)
* [Поиск индекса в диапазоне.](https://github.com/IuriyG/job4j/commit/6ecb9b069fe3e20e1c8f6b397b0c3444b3d3709d)
* [Поиск минимального числа в массиве.](https://github.com/IuriyG/job4j/commit/d8eb240dd4e22c9e22588ceb497ed54be81b1041)
* [Поиск минимума в диапазоне.](https://github.com/IuriyG/job4j/commit/399e5f27e725b3ce7c39842140d73de2532a5dc9)
* [Сортировка выборкой.](https://github.com/IuriyG/job4j/commit/6a2d890546b488982461db3606f8e75fbaf39c55)
* [Двумерный массив.](https://github.com/IuriyG/job4j/commit/a38a8233f3448027d8bb64fb8815e7f377a18fbb)
* [Размер элемента двухмерного массива.](https://github.com/IuriyG/job4j/commit/235e3574014dbd65421e23754c5aa6de189075b2)
* [Двухмерный массив. Циклы.](https://github.com/IuriyG/job4j/commit/b77c3f6138e97886910ce292a3e1add33d05097e)
* [Двухмерный массив. If.](https://github.com/IuriyG/job4j/commit/fe9d3d772ec54ad884f06c943573d04d764bcc07)
* [Двухмерный массив. Таблица умножения.](https://github.com/IuriyG/job4j/commit/a5d8f1219dd25198d09d44d96e773cdd7ee093ae)
* [Моно-строка в матрице.](https://github.com/IuriyG/job4j/commit/bf836ddca012ccb4e316e381dda75c3754b043b3)
* [Моно-столбец в матрице.](https://github.com/IuriyG/job4j/commit/bf836ddca012ccb4e316e381dda75c3754b043b3)
* [Массив из диагонали матрицы.](https://github.com/IuriyG/job4j/commit/49419dd0e134e88985059c00bc233592ff3651a5)
* [Выигрышные комбинации в сокобан.](https://github.com/IuriyG/job4j/commit/bf836ddca012ccb4e316e381dda75c3754b043b3)
* [Дефрагментация массива.](https://github.com/IuriyG/job4j/commit/d30a78cb6d3992af065b7314548c66e247b6998a)
* [Жадный алгоритм. Сдача в кофе машине.](https://github.com/IuriyG/job4j/commit/9aa8f11c61c8f5220d02329b524d67b2036128b1)

</details>

<details><summary>7. Контрольные вопросы и тестовые задания.</summary>

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

* [Тестовое задание: сокобан.](https://github.com/IuriyG/games_oop_javafx/commit/372d19328e6dab204c496ff8c4871197c3c1fc35)
* [Тестовое задание: объединить два массива.](https://github.com/IuriyG/job4j/commit/d9b0b7fc2b4ae21c9a59ac181ad2b4593cad70ab)

</details>
  </details>

## <font size="8" color="#03A9F4" face="Comic sans MS">[Часть 2. ООП.](https://github.com/IuriyG/job4j/tree/master/chapter_002/src/test/java/ru/job4j) </font>

<details><summary>0. Техническое задание. Tracker.</summary>

* Техническое задание - проект Tracker.
* [Репозиторий под проект Tracker.](https://github.com/IuriyG/job4j_tracker)

 </details>

<details><summary>1. Качество кода.</summary>

* Чтение кода и базовые ошибки.

</details>

<details><summary>2. Автоматическая сборка, Maven.</summary>

* Запуск Maven. Фаза test.
* Структура Maven проекта.
* Подключение библиотек.
* [Checkstyle с Maven.](https://github.com/IuriyG/job4j/blob/94240f82bd0c55d5887edc8e915b1c5664a0a6ba/pom.xml#L96)

</details>

<details><summary>3. Классы и объекты.</summary>

* Теория.
* [Создание объекта.](https://github.com/IuriyG/job4j/commit/6a566332f0d82436a45604b60b3d4e08d0d210df)
* [Вызов метода объекта.](https://github.com/IuriyG/job4j/commit/3c3e4356324ffaaab335dbe30b1554eb6e16b41b)
* [Вызов метода с аргументами.](https://github.com/IuriyG/job4j/commit/50142df85b1dc9d8e492584f74cf77404806b953)
* [Вызов метод с возвращаемым типом.](https://github.com/IuriyG/job4j/commit/4dd833800929161605a31cb95f2583b1b95aeab5)
* [Поля объекта.](https://github.com/IuriyG/job4j/commit/53cefe5ce0cf091cf272053e86f84c8c95e95778)
* [Взаимодействие объектов.](https://github.com/IuriyG/job4j/commit/b3a94d98fa8fb559963b03b45fa20c43fbf0f54f)
* Конструктор.
* [Состояние объекта.](https://github.com/IuriyG/job4j/blob/5c66331cc40ae5df2913e2dfb4a5ebd200cbe0a5/chapter_001/src/main/java/ru/job4j/oop/Battery.java)
* [Статические и не статические методы.](https://github.com/IuriyG/job4j/commit/17ef71a54d0bfb28c495b2f98a161dbd34860a1b)
* [Рефакторинг — Расстояние между точками.](https://github.com/IuriyG/job4j/commit/d5bc899704626bff425571d228400be4ec7c504d)
* [Рефакторинг — Площадь треугольника.](https://github.com/IuriyG/job4j/commit/5857774651d6ae2fd456a8649b1598f982b0ab28)
* [Перегрузить метод max для трех чисел.](https://github.com/IuriyG/job4j/commit/66c272bebd29e874c83670169a7ef701ffeeaedc)
* [Расстояние между точками в трехмерном пространстве.](https://github.com/IuriyG/job4j/commit/6f3e96c24e7fb61a673ff0d23fd25d3f4226cd81)
* Локальные переменные и поля.
* Зона видимости переменных.

</details>

<details><summary>4. Наследование</summary>

* Что такое наследование.
* [Перегрузка конструктора.](https://github.com/IuriyG/job4j/commit/9fc99486238eb9f541e40d050681b54fede19231)
* [Вызов конструктора родителя super(...)](https://github.com/IuriyG/job4j/commit/a94d74493931f67c96e3f6644cb375ca2e419256)
* [Переопределение.](https://github.com/IuriyG/job4j/commit/779e88a94d371bf7489bb09fff635b75e7039dbc)
* [Вызов переопределенного метода родителя - super.method ...](https://github.com/IuriyG/job4j/commit/4bebbd482be06c2f7f943738f6f8180c51c48889)
* [Аннотация @Override.](https://github.com/IuriyG/job4j/commit/603496b9b6e260769c1fece04c1dafaec6f8344c)
* [Date. Отображение даты.](https://github.com/IuriyG/job4j/commit/fd1805d7ed1143117ebcfb1676a02bbd1d2c4ee5)

</details>

<details><summary>5. Инкапсуляция.</summary>

* [Что такое инкапсуляция.](https://github.com/IuriyG/job4j/blob/1e40893ad747eebd28285183e68ea189216eaa68/chapter_001/src/main/java/ru/job4j/encapsulation/Config.java)
* [Модель данных.](https://github.com/IuriyG/job4j/blob/bb67f2686ce1ecf2335f8fa18870a4a96c8ec023/chapter_001/src/main/java/ru/job4j/pojo/College.java)
* [Массивы и модели.](https://github.com/IuriyG/job4j/commit/50f9639ea30eac74be4399b806ee99139d4d37ab)
* Массив с пустыми ячейками.
* [Удаление моделей из массива.](https://github.com/IuriyG/job4j/commit/844e4402b626e0f1192ec143eebd8a4d2e528846)
* Сравнение моделей. Метод equals.
* [Tracker - хранилище.](https://github.com/IuriyG/job4j/commit/c7bf953bbff74de6fe6fe4dd37852f3916ffef4f)
* Метод замены заявки. Tracker.replace.
* Метод удаления заявки Tracker.delete.
* Что такое валидация?
* toString.

</details>

<details><summary>6. Полиморфизм.</summary>

* Что такое полиморфизм.
* [Чтение из консоли. Класс Scanner.](https://github.com/IuriyG/job4j/commit/992aa46d340253e54b222a148949a4d6628fbbbd)
* [Scanner и чтение числа из консоли.](https://github.com/IuriyG/job4j/blob/a5fb220413b34d797b6c3b1a9a07b2f2a9cdd933/chapter_001/src/main/java/ru/job4j/io/Matches.java)
* [Реализация класса StartUI.](https://github.com/IuriyG/job4j/commit/2b5885300f07f255176e6472289b9986b9da5230)
* Реализация класса StartUI. Вывод меню.
* Реализация класса StartUI. Добавление заявки.
* Реализация класса StartUI. Вывод всех заявок.
* Реализация класса StartUI. Изменение заявки.
* Реализация класса StartUI. Удаление заявки.
* Реализация класса StartUI. Вывод заявки по id.
* Реализация класса StartUI. Вывод заявок по имени.
* [Интерфейс Input.](https://github.com/IuriyG/job4j/blob/1d85898e9b/chapter_001/src/main/java/ru/job4j/poly/Bus.java)
* [Приведение типов. Повышение типа и понижение типа.](https://github.com/IuriyG/job4j/commit/b476be5fe00441e9d04a7e24e33b2c950598cbbc)
* [Зачем нужно приведение типов.](https://github.com/IuriyG/job4j/commit/b08d47800fd0ce7129459481dc295ab0fe237af6)
* Зависимости классов.
* [Разрыв зависимости StartUI от Scanner.](https://github.com/IuriyG/job4j/commit/64ca3f4587a234971740fe74aae699c24b241129)
* [Статические методы.](https://github.com/IuriyG/job4j/commit/4e9094bc89f02bd0d1ba5791d9715ece20ffc5b5)
* [Input и полиморфизм.](https://github.com/IuriyG/job4j/commit/f844f67043781cc4cf2b10ad40abc073d5520959)
* [Тестирование. Подготовка данных.](https://github.com/IuriyG/job4j/commit/ef42fe4319c9bc8c353026f8b8096fa86b95c509)
* [Создания Manifest для проекта Tracker.](https://github.com/IuriyG/job4j/commit/16748e777f515be00751bea94122b2f6c7dcf70c)
* [Шаблон проектирования — Стратегия.](https://github.com/IuriyG/job4j/commit/84fc927ebbdfc6924cc4e6e6a13d38ab12b0a358)
* [Реализация меню за счет шаблона стратегия.](https://github.com/IuriyG/job4j/commit/5724cbf36cc3e7c0156dfc2161151541f7b5ed73)
* [Написать тесты на StartUI.](https://github.com/IuriyG/job4j/commit/1cee9d13ddd5d60f949c7270d46189afa089ec6c)
* [Зависимость от System.out.](https://github.com/IuriyG/job4j/commit/e877671ad9a7999903961ba6c8a1ce2a43555bb9)
* [Рефакторинг теста @Before @After.](https://github.com/IuriyG/job4j/commit/e877671ad9a7999903961ba6c8a1ce2a43555bb9)
* [Тесты вывода на консоль в StartUI.](https://github.com/IuriyG/job4j/commit/8ea012a1855f3467c2498fc4e24af24be5a24cb1)

</details>

<details><summary>7. Исключения.</summary>

* [Что такое исключение.](https://github.com/IuriyG/job4j/commit/7bf6794e1c7de2002d0119bdb7d2d4a29ea2406a)
* [java.lang.NullPointerException.](https://github.com/IuriyG/job4j/commit/6d83114382c1c98013a940cb917d96067e1c6299)
* [Кидаем исключение - throw new RuntimeException](https://github.com/IuriyG/job4j/commit/1508fdf97690f58c24f09b8deac65a71f23d61c7)
* [Тестирование исключений с junit.](https://github.com/IuriyG/job4j/commit/b4f1f79f957c93a5b1b67f270dfbf453520af5e8)
* [Пользовательские исключения.](https://github.com/IuriyG/job4j/commit/f3de1f991ef5c46be364cb6f0708c981f4d546f6)
* [Иерархия исключений и множественный catch.](https://github.com/IuriyG/job4j/commit/69a0908ada62d129d3825ec155e3f038782bcf85)
* [Error - исключения, связанные с работой виртуальной машины.](https://github.com/IuriyG/job4j/commit/7ad38ceb37a44754c382341ade4e4968f8a1563d)
* [Обеспечить бесперебойную работу приложения Tracker.](https://github.com/IuriyG/job4j/commit/79d9e9f48e5a7f265bab96d4601bbdbaca62d668)
* [Тесты на StartUI.](https://github.com/IuriyG/job4j/blob/79d9e9f48e5a7f265bab96d4601bbdbaca62d668/chapter_002/src/test/java/ru/job4j/tracker/StartUITest.java)
* [Рефакторинг — Шаблон Декоратор для валидатора.](https://github.com/IuriyG/job4j/commit/90c056949c23e0d00597c0ee98730db96ccb6c07)
* [Тест на ValidateInput.](https://github.com/IuriyG/job4j/blob/9851a28757/chapter_002/src/test/java/ru/job4j/tracker/ValidateInputTest.java)
* [Замена if-else-throw на if-throw.](https://github.com/IuriyG/job4j/commit/33ebd679aea79b40c785708ed4e35b1d53023aca)
* [Принципы раннего возврата и охранных выражений](https://github.com/IuriyG/job4j/commit/c00d4b8b556958e2a36c2bfb1c72f5fea4a0170b)

</details>

<details><summary>8. ООА\П.</summary>

* Что такое ООА\П?
* [Singleton.](https://github.com/IuriyG/job4j/commit/90dcc8b9756fcb55781aef9b5bbc627a2bc6446e)
* Шаблон фабричный метод.
* [final.](https://github.com/IuriyG/job4j/commit/72ee09857833ab99461c0fab9bcd68b1a1d83839)

</details>

<details><summary>9. Контрольные вопросы.</summary>

* <details><summary>Экзамен. ООП.</summary>

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

* [Каркас шахматной доски.](https://github.com/IuriyG/games_oop_javafx/commit/650566718eec5f27b099292b417a82ac7751e26c)
</details>
</details>

## <font size="8" color="#03A9F4" face="Comic sans MS">[Часть 3. Collections. Lite.](https://github.com/IuriyG/job4j/tree/master/chapter_003/src/main/java/ru/job4j) </font>

<details><summary>1. Коллекция List, ArrayList.</summary>

* Интерфейс Collection.
* [Коллекции, ArrayList, List, Обобщения.](https://github.com/IuriyG/job4j/commit/b156c0553f7a87522e99fab0272eed50764da1c9)
* [Телефонный справочник на базе ArrayList.](https://github.com/IuriyG/job4j/commit/baec4bd40b89b940fb85f0cddc9e28c394d37872)
* [Очередь с приоритетом на LinkedList.](https://github.com/IuriyG/job4j/commit/ba134f8c663aa1450d6497fc8b40e2ea41653993)
* [ Конвертация ArrayList в двухмерный массив.](https://github.com/IuriyG/job4j/commit/0fa9c98a393cce2cac53fe4f68eb951eeb604b97)
* [Конвертация двумерного массива в ArrayList.](https://github.com/IuriyG/job4j/commit/5c9b3be314dbc1327f508bf3b7dbbca824b5a404)
* [Конвертация листа массивов в один лист Integer.](https://github.com/IuriyG/job4j/commit/7ac5744e81874fd2da6ab775d5d703eaca5e002c)
* [Изменить программу Tracker из 2-го модуля.](https://github.com/IuriyG/job4j/commit/145684edcb55b3303270de62f297c58c64916015)

</details>

<details><summary>2. Коллекция Set, HashSet.</summary>

* [Set, HashSet, Iterator.](https://github.com/IuriyG/job4j/commit/7a2192554a3e86d00e1abeee6dccbcb4ca637a14)
* [Уникальные задачи.](https://github.com/IuriyG/job4j/commit/8beb21c9c02138c257d97982398d0363dddabfb9)
* [Идентичные тексты.](https://github.com/IuriyG/job4j/commit/9229286d94300a61919c6e3c7db3c2aac78927be)
* [Модели данных и HashSet.](https://github.com/IuriyG/job4j/commit/7a3d25c9f6fa830ebf22fd2dc8f343a88cff80ed)

</details>

<details><summary>3. Map. HashMap. LinkedHashMap.</summary>

* [Map, HashMap.](https://github.com/IuriyG/job4j/commit/dc4ed768ada2a384b373ad162f8f4a1f8968535a)
* [Паспорт и жители.](https://github.com/IuriyG/job4j/commit/1f020fce49efa24efee4d3f51d35bf8b84af8cec)
* [Преобразования List в Map.](https://github.com/IuriyG/job4j/commit/f92c535809b4822eb49b4480f57fab1e2cc9b9e1)
* [Банковские переводы.](https://github.com/IuriyG/job4j/commit/0fa1d13f16cdb422ad3292d4253b40013d79a035)
* [Аттестация](https://github.com/IuriyG/job4j/blob/944257fa4e3941faf9bef1160eb8873d731afe3d/chapter_003/src/main/java/ru/job4j/map/AnalyzeByMap.java)

</details>

<details> <summary>4. Сортировка.</summary>

* [Сортировка.](https://github.com/IuriyG/job4j/commit/6aab12aa3314d149287b588f8750fa1aaecbea04)
* [Организовать сортировку User.](https://github.com/IuriyG/job4j/commit/84b1faf4c355683a4e0c044aec9d97e0140855f5)
* [Комбинированный компаратор.](https://github.com/IuriyG/job4j/commit/464b72b4ff59ab140d195c1d93c641b6c9555e14)
* [Компаратор для строк.](https://github.com/IuriyG/job4j/commit/ccbd973c0b7e07a771bee830c2d58587280b6346)
* [Сортировка номера.](https://github.com/IuriyG/job4j/commit/b605b190fa209011396122f7fba9e2cf5b096721)

</details>

<details> <summary>5. Инструменты.</summary>

* JaCoCo. Процент покрытия тестами.
* [Travis CI.](https://github.com/IuriyG/job4j/commit/774580d0f879bbc782a23da2db83d964fdf09145)
* [Что такое JavaDoc.](https://github.com/IuriyG/job4j/commit/a0e8f6d038ecff9538e634f67c93783767e19dd1)
* [Генерация документации по JavaDoc.](https://github.com/IuriyG/job4j/commit/81e9d2bf0569ee369e08a7811d9c917b7efcf34e)

</details>

<details> <summary>6. Контрольные вопросы.</summary>

* <details><summary>Экзамен. Коллекции.</summary>

      Вопросы.
        1. Что такое "коллекция". 
        1.1  Перечислите основные методы из интерфейса java.util.Collection.
        2. Назовите преимущества использования коллекций.
        3. Какие данные могут хранить коллекции?
        4. Какие есть типы коллекций? Как они характеризуются?
        5. Назовите основные реализации List, Set, Map.
        6. В чём отличие ArrayList от LinkedList?
        7. В чём отличие HashSet от TreeSet?
        8. В чём отличие Set от Map?
        9. Как задается порядок следования объектов в коллекции, как отсортировать коллекцию?
        10. Чем отличается Comparable от Comparator?
        11. Что такое сортировка по принципу Natural Order?
        12. Что такое equals и hashcode?
        13. Какие есть способы перебора всех элементов List?
        14. Как реализован цикл foreach?
        15. В чем разница между Iterator и Iterable?
        16. Как происходит удаление элементов из ArrayList?
        17. Как происходит удаление элементов из LinkedList?
  </details>

* [Отсортировать департаменты.](https://github.com/IuriyG/job4j/commit/488fc718ba8cbbd07902e9062e1647815d1142cd)

</details>

## <font size="8" color="#03A9F4" face="Comic sans MS">[Часть 4. FP, Lambda, Stream API.](https://github.com/IuriyG/job4j/tree/master/chapter_004/src/main/java/ru/job4j) </font>

<details><summary>1. Lambda.</summary>

* [Анонимные классы.](https://github.com/IuriyG/job4j/commit/544550bd1196e537b05d6bb1c043b5fbac8c6002)
* [Функциональный интерфейс.](https://github.com/IuriyG/job4j/commit/fb3f17e536f1f6f2b32c1c81112b2074aaf2d435)
* [Встроенные функциональные интерфейсы.](https://github.com/IuriyG/job4j/commit/d9bceef378b09dcb80ab4a3fec2631780d570c8a)
* Лямбда.
* [Лямбда блок.](https://github.com/IuriyG/job4j/commit/8169c13a204b10c851e5fab2e6399f4ca1803451)
* Ленивая загрузка.
* [Ссылки на методы.](https://github.com/IuriyG/job4j/commit/5f9081929a906e939619b038ea469da45973937f)
* [Зона видимости в лямбда-выражениях и исключения.](https://github.com/IuriyG/job4j/commit/00916e8d56b86e773d787217b997198d63166c73)
* [Подсчет функции в диапазоне.](https://github.com/IuriyG/job4j/commit/319ebd6d8addc257e38346cbf80af3f4f0cbaf37)
* [Функции высшего порядка.](https://github.com/IuriyG/job4j/commit/5dfd713be88f9bdcb926fea76e2fcfa598934ee4)
* FP - функциональное программирование.

</details>

<details><summary>2. Stream API. </summary>

* [Stream API.](https://github.com/IuriyG/job4j/commit/1215063d2200fee4658b7bf12d7f09ab695ded15)
* [Отладка лямбда в IDEA.](https://github.com/IuriyG/job4j/commit/3d88cc84097ac27660aae98f3b2f213f0a60ac46)
* [Фильтрация учеников.](https://github.com/IuriyG/job4j/commit/d9e6868ca7f4e9b6b65352a388207d906bf6c9d6)
* [Список адресов.](https://github.com/IuriyG/job4j/commit/84586b027a55c3ddfeb7db706360ae4dbe190669)
* [Уникальность элементов и сортировка.](https://github.com/IuriyG/job4j/commit/c5b0b5b9a7b44f030bfb52ad5f4dd9c3e23c9eca)
  
* <details><summary>Генерирование колоды карт. FlatMap.</summary>

  * [Перечисления мастей карт.](https://github.com/IuriyG/job4j/blob/master/chapter_004/src/main/java/ru/job4j/stream/card/Suit.java)
  * [Перечисления значений карт.](https://github.com/IuriyG/job4j/blob/6e998f49fc/chapter_004/src/main/java/ru/job4j/stream/card/Value.java)
   </details>
  
* [Преобразование List в Map.](https://github.com/IuriyG/job4j/commit/71041489b3ba82fac161e1e08252fc5ea25f45c3)
* [Преобразование матрицы чисел в список чисел.](https://github.com/IuriyG/job4j/commit/c955aca5e2ec287f3fdb78f24b5791ec321bdf45)

* <details><summary>Тестовое задание из модуля коллекции Lite переделать на Stream API.</summary>

   * [Метод findByPassport();](https://github.com/IuriyG/job4j/commit/bd4f8205e019d33a14387f7b7a119b746922ee71)
   * [Метод findByRequisite();](https://github.com/IuriyG/job4j/commit/5ab9bd60f857501a7f2c5df919ab3d36e172164c)
  </details>

* [Перенос методов в Stream API.](https://github.com/IuriyG/job4j/commit/56f1dae4b1045665b46882ff639b063681eedb07)
* [Шаблоны проектирования в Stream API.](https://github.com/IuriyG/job4j/commit/23b306cf5500455d33dcc61f2bf299e0c80b140a)

</details>

<details><summary>3. Улучшенное Java API.</summary>

* [Stream API улучшения.](https://github.com/IuriyG/job4j/commit/c36b22fac65100d277baf5b06767394d990b2e67)
* [ Метод .of.](https://github.com/IuriyG/job4j/commit/afbf9d97f4d3cd638a4febb8aab5d940921ec883)
* [Local-Variable Type Inference.](https://github.com/IuriyG/job4j/commit/5e5fa2c4257e3a2e993af74b1e931a560ee0e6e4)
* [Optional в банковских переводах.](https://github.com/IuriyG/job4j/commit/6a7a851ef7cc2e6fd40f9eeeddfebd2847e58a5e)
* [Optional в Stream API.](https://github.com/IuriyG/job4j/commit/31b49473f8252b3b04409a136bd78ad6e8d44341)
* [Collection API Улучшения.](https://github.com/IuriyG/job4j/commit/afbf9d97f4d3cd638a4febb8aab5d940921ec883)
</details>

<details><summary>4. Экзамен. Lambda, Stream API, JDK Features.</summary>

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

* [Реализовать класс для подсчета статистики по аттестатам учеников.](https://github.com/IuriyG/job4j/commit/7cd2f583a11afe8e29fabdb38bcefcbe33a69220)

 </details>

<details><summary>5. Тестовое задание после прохождения курса.</summary>

* [EasyStream.](https://github.com/IuriyG/job4j/commit/cf76ef208621b688008f348c676145b769e68438)

</details>
