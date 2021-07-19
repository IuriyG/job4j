package ru.job4j.ex;

/**
 * @author Iuriy Gaydarzhi.
 * @since 18.07.2021
 */
public class UserInvalidException extends UserNotFoundException {
    public UserInvalidException(String message) {
        super(message);
    }
}
