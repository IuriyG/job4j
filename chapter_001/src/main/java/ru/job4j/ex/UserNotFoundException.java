package ru.job4j.ex;

/**
 * @author Iuriy Gaydarzhi.
 * @since 18.07.2021
 */
public class UserNotFoundException extends Exception {
    public UserNotFoundException(String message) {
        super(message);
    }
}
