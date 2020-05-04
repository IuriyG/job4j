package ru.job4j.singleton;

import org.junit.Assert;
import org.junit.Test;

public class TrackerSingleFourthTest {

    @Test
    public void whenTrackerSingleIsTrue() {
        TrackerSingleThird tst = TrackerSingleThird.getInstance();
        TrackerSingleThird tst2 = TrackerSingleThird.getInstance();
        Assert.assertEquals(tst, tst2);
    }
}
