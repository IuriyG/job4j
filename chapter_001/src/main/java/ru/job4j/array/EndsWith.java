package ru.job4j.array;

/**
 * Класс сравнивает последние элементы массивов.
 */
public class EndsWith {

    /**
     * Метод проверяет, на идентичность последние символы массивов.
     *
     * @param word Входящий массив.
     * @param post Входящий массив.
     * @return True если совпали, иначе false.
     */
    public static boolean endsWith(char[] word, char[] post) {
        int i = word.length - 1;
        boolean result = true;
        for (int j = post.length - 1; j >= 0; j--, i--) {
            if (post[j] != word[i]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
