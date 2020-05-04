package ru.job4j.singleton;

import org.junit.Assert;
import org.junit.Test;

public class TrackerSingleFirstTest {

    @Test
    public void whenTrackerSingleIsTrue() {
        TrackerSingleFirst ts = TrackerSingleFirst.INSTANCE;
        TrackerSingleFirst ts2 = TrackerSingleFirst.INSTANCE;
        Assert.assertEquals(ts, ts2);
    }
}
