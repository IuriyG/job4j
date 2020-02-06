package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class TriangleTest {
    @Test
    public void whenExist() {
        Point pointA = new Point(0, 0);
        Point pointB = new Point(0, 2);
        Point pointC = new Point(2, 0);
        double expected = 2;
        Triangle triangle1 = new Triangle(pointA, pointB, pointC);
        double result = triangle1.area();
        Assert.assertEquals(expected, result, 0.01);
    }

    @Test
    public void whenExistNon() {
        Point pointA = new Point(2, 0);
        Point pointB = new Point(2, 0);
        Point pointC = new Point(2, 0);
        double expected = -1;
        Triangle triangle1 = new Triangle(pointA, pointB, pointC);
        double result = triangle1.area();
        Assert.assertEquals(expected, result, 0.01);
    }
}
