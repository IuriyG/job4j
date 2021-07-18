package ru.job4j.ex;

/**
 * @author Iuriy Gaydarzhi.
 * @since 17.07.2021
 *
 * 1. Создайте класс ru.job4j.ex.ElementNotFoundException.
 * Класс должен наследоваться от java.lang.Exception.
 * 2. Допишите метод поиска индекса элемента в строковом массиве.
 * 3. Если элемента нет, то нужно выкинуть исключение ElementNotFoundException.
 * В сигнатуре метода объявить это исключение.
 * 4. Добавьте метод main, и в нем вызовите метод indexOf. В методе main используйте конструкцию try-catch.
 * 5. Залейте код в репозиторий, оставьте ссылку на коммит и переведите на ответственного.
 */
public class FindEl {

    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int rsl = -1;
        for (int i = 0; i < value.length; i++) {
            if (value[i].equals(key)) {
                rsl = i;
                break;
            }
        }
        if (rsl < 0) {
            throw new ElementNotFoundException("There is no such element");
        }
        return rsl;
    }

    public static void main(String[] args) {
        try {
            indexOf(new String[]{"HON", "DOTA2", "WOW"}, "lol");
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}
