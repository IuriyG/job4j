package ru.job4j.early;

/**
 * Класс проводит валидацию пароля.
 * Применяя принципы раннего возврата и охранных выражений.
 *
 * @author Iuriy Gaydarzhi.
 * @since 17.08.2022
 */
public class PasswordValidator {
    /**
     * Метод проверяет пароль на соответствие следующим критериям:
     * <ol>
     *     <li>Не пустой ли пароль;</li>
     *     <li>Длина пароля находится в диапазоне от 8 до 32;</li>
     *     <li>Пароль содержит хотя бы один символ в верхнем регистре;</li>
     *     <li>Пароль содержит хотя бы один символ в нижнем регистре;</li>
     *     <li>Пароль не должен содержать подстрок без учета регистра:</li>
     *     <ul>
     *         <li>password</li>
     *         <li>qwerty</li>
     *         <li>admin</li>
     *         <li>user</li>
     *         <li>12345</li>
     *     </ul>
     *     <li>Вызывает метод {@link #validateSymAndNum(String)}</li>
     * </ol>
     *
     * @param password Входящая строка.
     * @return Если все условия пройдены успешно возвращает строку, иначе исключение!
     */
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

    /**
     * Метод проверяет наличие хотя бы одного спец. символа или цифры во входящей строке.
     *
     * @param str Входящая строка.
     * @return Если таковы отсутствуют, то возвращает false, иначе true.
     */
    private static boolean validateSymAndNum(String str) {
        boolean checkDig = true, checkSym = true;
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