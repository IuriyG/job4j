package ru.job4j.array;

/**
 * Класс проверки валидности имен в языке Java.
 *
 * @author Iuriy Gaydarzhi.
 * @since 16.11.2022
 */
public class JavaNameValidator {

    /**
     * @param name Строка.
     * @return false если не соответствует иначе true.
     */
    public static boolean isNameValid(String name) {
        if (name.isEmpty() || Character.isUpperCase(name.codePointAt(0))
                || Character.isDigit(name.codePointAt(0))) {
            return false;
        }
        for (int i = 1; i < name.length(); i++) {
            int code = name.codePointAt(i);
            if (isUpperLatinLetter(code) && !isSpecialSymbol(code)
                    && isLowerLatinLetter(code) && !Character.isDigit(code)) {
                return false;
            }
        }
        return true;
    }

    /**
     * Является ли символ символом доллара и нижнее подчеркивание.
     *
     * @param code HTML-код символа.
     * @return true если совпадает иначе false.
     */
    public static boolean isSpecialSymbol(int code) {
        return code == 36 || code == 95;
    }

    /**
     * Является ли символ прописным латинским.
     *
     * @param code HTML-код символа.
     * @return true если совпадает иначе false.
     */
    public static boolean isUpperLatinLetter(int code) {
        return code < 65 || code > 90;
    }

    /**
     * Является ли символ строчным латинским.
     *
     * @param code HTML-код символа.
     * @return true если совпадает иначе false.
     */
    public static boolean isLowerLatinLetter(int code) {
        return code < 97 || code > 122;
    }
}
