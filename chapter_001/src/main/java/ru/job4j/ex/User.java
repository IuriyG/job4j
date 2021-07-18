package ru.job4j.ex;

/**
 * @author Iuriy Gaydarzhi.
 * @since 18.07.2021
 */
public class User {
    private final String username;
    private final boolean valid;

    public User(String username, boolean valid) {
        this.username = username;
        this.valid = valid;
    }

    public String getUsername() {
        return username;
    }

    public boolean isValid() {
        return valid;
    }
}
