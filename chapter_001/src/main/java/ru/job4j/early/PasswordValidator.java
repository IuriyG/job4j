package ru.job4j.early;

/**
 * @author Iuriy Gaydarzhi.
 * @since 17.08.2022
 */
public class PasswordValidator {
    public static String validate(String password) {
        if (password.length() < 1) {
            throw new IllegalArgumentException("Пароль пуст!");
        }

        if (password.length() < 8 || password.length() > 32) {
            throw new IllegalArgumentException("Длина пароля должна быть в диапазоне от 8 до 32 символов!");
        }

        if (password.equals(password.toLowerCase()) || password.equals(password.toUpperCase())) {
            throw new IllegalArgumentException("Пароль должен содержать хотя бы " + "один символ в верхнем и "
                    + "нижнем регистре!");
        }

        String[] badPas = new String[]{"qwerty", "password", "admin", "user", "12345"};

        for (String badPa : badPas) {
            if (password.toLowerCase().contains(badPa.toLowerCase())) {
                throw new IllegalArgumentException("Пароль не должен содержать подстрок: " + "qwerty, 12345, "
                        + "password, admin, user!");
            }
        }
        if (!validateSymAndNum(password)) {
            throw new IllegalArgumentException("Пароль должен содержать хотя бы одну цифру или символ!");
        }

        return password;
    }

    private static boolean validateSymAndNum(String str) {
        var checkDig = true;
        var checkSym = true;
        for (var i = 0; i < str.length(); i++) {
            var sym = str.charAt(i);
            if (Character.isDigit(sym) && checkDig) {
                checkDig = false;
            }
            if (Character.toString(sym).matches("\\p{Punct}") && checkSym) {
                checkSym = false;
            }
            if (!checkDig && !checkSym) {
                return true;
            }
        }
        return false;
    }
}