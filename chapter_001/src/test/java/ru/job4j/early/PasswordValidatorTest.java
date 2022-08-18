package ru.job4j.early;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * @author Iuriy Gaydarzhi.
 * @since 17.08.2022
 */
public class PasswordValidatorTest {

    @Test
    public void whenStrIsEmpty() {
        String str = "";
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> PasswordValidator.validate(str), "NumberFormatException error was expected"
        );
        assertEquals("Пароль пуст!", exception.getMessage());
    }

    @Test
    public void whenPasLesThen8() {
        String str = "1234567";
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> PasswordValidator.validate(str), "NumberFormatException error was expected"
        );
        assertEquals("Длина пароля должна быть в диапазоне от 8 до 32 символов!", exception.getMessage());
    }

    @Test
    public void whenPasMoreThen32() {
        String str = "12345678910111213141516171819202122232425262728";
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> PasswordValidator.validate(str), "NumberFormatException error was expected"
        );
        assertEquals("Длина пароля должна быть в диапазоне от 8 до 32 символов!", exception.getMessage());
    }

    @Test
    public void whenPasHaveOnlyLowCase() {
        String str = "abcdehijkl";
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> PasswordValidator.validate(str), "NumberFormatException error was expected"
        );
        assertEquals("Пароль должен содержать хотя бы "
                + "один символ в верхнем и нижнем регистре!", exception.getMessage());
    }

    @Test
    public void whenPasHaveOnlyUpperCase() {
        String str = "ABCDEHIJKL";
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> PasswordValidator.validate(str), "NumberFormatException error was expected"
        );
        assertEquals("Пароль должен содержать хотя бы "
                + "один символ в верхнем и нижнем регистре!", exception.getMessage());
    }

    @Test
    public void whenPasHaveLowQwerty() {
        String str = "ABCqwerty";
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> PasswordValidator.validate(str), "NumberFormatException error was expected"
        );
        assertEquals("Пароль не должен содержать подстрок: "
                + "qwerty, 12345, password, admin, user!", exception.getMessage());
    }

    @Test
    public void whenPasHaveUpperQWERTY() {
        String str = "abcQWERTY";
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> PasswordValidator.validate(str), "NumberFormatException error was expected"
        );
        assertEquals("Пароль не должен содержать подстрок: "
                + "qwerty, 12345, password, admin, user!", exception.getMessage());
    }

    @Test
    public void whenPasHaveUpperAndLowQWeRtY() {
        String str = "abcQwErTy";
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> PasswordValidator.validate(str), "NumberFormatException error was expected"
        );
        assertEquals("Пароль не должен содержать подстрок: "
                + "qwerty, 12345, password, admin, user!", exception.getMessage());
    }

    @Test
    public void whenPasHaveUpperPASSSWORD() {
        String str = "abcPASSWORD";
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> PasswordValidator.validate(str), "NumberFormatException error was expected"
        );
        assertEquals("Пароль не должен содержать подстрок: "
                + "qwerty, 12345, password, admin, user!", exception.getMessage());
    }

    @Test
    public void whenPasHaveLowPassword() {
        String str = "ABCpassword";
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> PasswordValidator.validate(str), "NumberFormatException error was expected"
        );
        assertEquals("Пароль не должен содержать подстрок: "
                + "qwerty, 12345, password, admin, user!", exception.getMessage());
    }

    @Test
    public void whenPasHaveLowAndUpperPaSsWoRd() {
        String str = "ABCPaSsWoRd";
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> PasswordValidator.validate(str), "NumberFormatException error was expected"
        );
        assertEquals("Пароль не должен содержать подстрок: "
                + "qwerty, 12345, password, admin, user!", exception.getMessage());
    }

    @Test
    public void whenPasHaveUpperADMIN() {
        String str = "abcADMIN";
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> PasswordValidator.validate(str), "NumberFormatException error was expected"
        );
        assertEquals("Пароль не должен содержать подстрок: "
                + "qwerty, 12345, password, admin, user!", exception.getMessage());
    }

    @Test
    public void whenPasHaveLowAdmin() {
        String str = "ABCadmin";
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> PasswordValidator.validate(str), "NumberFormatException error was expected"
        );
        assertEquals("Пароль не должен содержать подстрок: "
                + "qwerty, 12345, password, admin, user!", exception.getMessage());
    }

    @Test
    public void whenPasHaveLowAndUpperAdMiN() {
        String str = "ABCaDmIn";
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> PasswordValidator.validate(str), "NumberFormatException error was expected"
        );
        assertEquals("Пароль не должен содержать подстрок: "
                + "qwerty, 12345, password, admin, user!", exception.getMessage());
    }

    @Test
    public void whenPasHaveUpperUSER() {
        String str = "abcdUSER";
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> PasswordValidator.validate(str), "NumberFormatException error was expected"
        );
        assertEquals("Пароль не должен содержать подстрок: "
                + "qwerty, 12345, password, admin, user!", exception.getMessage());
    }

    @Test
    public void whenPasHaveLowUser() {
        String str = "ABCDuser";
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> PasswordValidator.validate(str), "NumberFormatException error was expected"
        );
        assertEquals("Пароль не должен содержать подстрок: "
                + "qwerty, 12345, password, admin, user!", exception.getMessage());
    }

    @Test
    public void whenPasHaveLowAndUpperUsEr() {
        String str = "ABCDuSeR";
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> PasswordValidator.validate(str), "NumberFormatException error was expected"
        );
        assertEquals("Пароль не должен содержать подстрок: "
                + "qwerty, 12345, password, admin, user!", exception.getMessage());
    }

    @Test
    public void whenPasHaveNum() {
        String str = "AbCD12345";
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> PasswordValidator.validate(str), "NumberFormatException error was expected"
        );
        assertEquals("Пароль не должен содержать подстрок: "
                + "qwerty, 12345, password, admin, user!", exception.getMessage());
    }

    @Test
    public void whenPasHaveOneSymUpperLetterAndNoDigit() {
        String str = "a(BCDEHIJKLM";
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> PasswordValidator.validate(str), "NumberFormatException error was expected"
        );
        assertEquals("Пароль должен содержать хотя бы одну цифру или символ!", exception.getMessage());
    }

    @Test
    public void whenPasHaveOneDigitUpperLetterAndNoSym() {
        String str = "a1BCDEHIJKLM";
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> PasswordValidator.validate(str), "NumberFormatException error was expected"
        );
        assertEquals("Пароль должен содержать хотя бы одну цифру или символ!", exception.getMessage());
    }

    @Test
    public void whenPasHaveOneUpLetterOneSymOneDigitOtherLowLetter() {
        String str = "A1#bcdehijkl";
        assertEquals(PasswordValidator.validate(str), str);
    }
}