package ru.job4j.collection;

import org.junit.*;

import java.util.List;

public class ConvertListTest {
    @Test
    public void whenTwoList() {
        List<int[]> in = List.of(new int[]{1}, new int[]{2, 3});

        List<Integer> expect = List.of(1, 2, 3);
        Assert.assertEquals(ConvertList.convert(in), (expect));
    }
}
