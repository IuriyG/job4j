package ru.job4j.array;

/**
 * The type Java name validator.
 *
 * @author Iuriy Gaydarzhi.
 * @since 16.11.2022
 */
public class JavaNameValidator {
    /**
     * Is name valid boolean.
     *
     * @param name the name
     * @return the boolean
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
     * Is special symbol boolean.
     *
     * @param code the code
     * @return boolean
     */
    public static boolean isSpecialSymbol(int code) {
        return code == 36 || code == 95;
    }

    /**
     * Is upper latin letter boolean.
     *
     * @param code the code
     * @return the boolean
     */
    public static boolean isUpperLatinLetter(int code) {
        return code < 65 || code > 90;
    }

    /**
     * Is lower latin letter boolean.
     *
     * @param code the code
     * @return boolean
     */
    public static boolean isLowerLatinLetter(int code) {
        return code < 97 || code > 122;
    }
}
