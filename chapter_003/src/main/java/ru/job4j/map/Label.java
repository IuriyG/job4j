package ru.job4j.map;

/**
 * @author Iuriy Gaydarzhi.
 * @since 21.07.2022
 */
public record Label(String name, double score) implements Comparable<Label> {
    @Override
    public int compareTo(Label o) {
        return Double.compare(o.score, this.score);
    }
}