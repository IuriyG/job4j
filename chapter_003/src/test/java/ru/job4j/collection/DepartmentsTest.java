package ru.job4j.collection;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author Iuriy Gaydarzhi.
 * @since 02.09.2021
 */
public class DepartmentsTest {

    @Test
    public void whenMissed() {
        List<String> input = List.of("k1/sk1");
        List<String> expect = Arrays.asList("k1", "k1/sk1");
        List<String> result = Departments.fillGaps(input);
        assertThat(result, is(expect));
    }

    @Test
    public void whenNonChange() {
        List<String> input = Arrays.asList("k1", "k1/sk1");
        List<String> expect = Arrays.asList("k1", "k1/sk1");
        List<String> result = Departments.fillGaps(input);
        assertThat(result, is(expect));
    }

    @Test
    public void whenThreeStrings() {
        List<String> input = Arrays.asList("K2/SK1", "K2/SK1/SSK1", "K2");
        List<String> expect = Arrays.asList("K2", "K2/SK1", "K2/SK1/SSK1");
        List<String> result = Departments.fillGaps(input);
        assertThat(result, is(expect));
    }

    @Test
    public void sortAscTest() {
        List<String> input = Arrays.asList("k1", "ssk1", "sk1");
        List<String> expect = Arrays.asList("k1", "sk1", "ssk1");
        Departments.sortAsc(input);
        assertThat(input, is(expect));
    }

    @Test
    public void sortDescTest() {
        List<String> input = Arrays.asList("sk1", "ssk1", "k2");
        List<String> expect = Arrays.asList("k2", "sk1", "ssk1");
        Departments.sortDesc(input);
        assertThat(input, is(expect));
    }
}
