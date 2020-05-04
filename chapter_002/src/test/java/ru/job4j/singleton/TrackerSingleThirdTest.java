package ru.job4j.singleton;

import org.junit.Assert;
import org.junit.Test;

public class TrackerSingleThirdTest {

    @Test
    public void whenTrackerSingleIsTrue() {
        TrackerSingleFourth tsf = TrackerSingleFourth.getInstance();
        TrackerSingleFourth tsf2 = TrackerSingleFourth.getInstance();
        Assert.assertEquals(tsf, tsf2);
    }
}
