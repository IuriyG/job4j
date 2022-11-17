package ru.job4j.array;

/**
 * @author Iuriy Gaydarzhi.
 * @since 16.11.2022
 */
public class JavaNameValidator {
    public static boolean isNameValid(String name) {
        if (name.isEmpty()) {
            return false;
        }
        if (Character.isUpperCase(name.codePointAt(0))) {
            return false;
        }
        for (int i = 0; i < name.length(); i++) {
            int code = name.codePointAt(i);
            if (isUpperLatinLetter(code) || isSpecialSymbol(code) || isLowerLatinLetter(code)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isSpecialSymbol(int code) {
        return code == 36 || code == 95;
    }

    public static boolean isUpperLatinLetter(int code) {
        return code >= 65 && code <= 90;
    }

    public static boolean isLowerLatinLetter(int code) {
        return code >= 97 && code <= 122;
    }
}
