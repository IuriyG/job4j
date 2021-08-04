package ru.job4j.collection;

import java.util.Collections;
import java.util.HashSet;

/**
 * @author Iuriy Gaydarzhi.
 * @since 02.08.2021
 * <p>
 * Идентичные тексты.
 */
public class UniqueText {
    /**
     * Метод сравнивает 2 массива на уникальность слов.
     *
     * @param originText    Массив оригинального текста.
     * @param duplicateText Массив проверяемого текста.
     * @return Если слова в массиве абсолютно идентичны, но true, иначе - false.
     */
    public static boolean isEquals(String originText, String duplicateText) {
        String[] text = duplicateText.split(" ");
        HashSet<String> check = new HashSet<>();
        Collections.addAll(check, originText.split(" "));
        for (String s : text) {
            if (!check.contains(s)) {
                return false;
            }
        }
        return true;
    }
}
