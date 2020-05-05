package ru.job4j.singleton;

import org.junit.Assert;
import org.junit.Test;

public class TrackerSingleTest {

    @Test
    public void whenTrackerSingleIsTrue() {
        TrackerSingle ts = TrackerSingle.INSTANCE;
        TrackerSingle ts2 = TrackerSingle.INSTANCE;
        Assert.assertEquals(ts, ts2);
    }
}
