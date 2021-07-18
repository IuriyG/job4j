package ru.job4j.ex;

/**
 * @author Iuriy Gaydarzhi.
 * @since 17.07.2021
 */
public class FindEl {

    public static int indexOf(String[] value, String key) throws NumberFormatException {

        int rsl = -1;
        for (int i = 0; i < value.length; i++) {
            if (value[i].equals(key)) {
                rsl = i;
                break;
            }
        }
        if (rsl < 0) {
            throw new ElementNotFoundException("There is no such element");
        }
        return rsl;
    }

    public static void main(String[] args) {
        try {
            indexOf(new String[]{"HON", "DOTA2", "WOW"}, "lol");
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }
}
