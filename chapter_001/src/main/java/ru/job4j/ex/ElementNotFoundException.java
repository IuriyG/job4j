package ru.job4j.ex;

/**
 * @author Iuriy Gaydarzhi.
 * @since 17.07.2021
 */
public class ElementNotFoundException extends RuntimeException {
    public ElementNotFoundException(String message) {
        super(message);
    }
}
