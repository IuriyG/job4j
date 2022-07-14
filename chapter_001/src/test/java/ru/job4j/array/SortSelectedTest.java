package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;


public class SortSelectedTest {
    @Test
    public void whenSort() {
        int[] input = new int[]{3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[]{1, 2, 3, 4, 5};
        assertThat(result).containsExactly(expect);
    }

    @Test
    public void whenSort3Numbers() {
        int[] input = new int[]{31, 3, 7};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[]{3, 7, 31};
        assertThat(result).containsExactly(expect);
    }
}
