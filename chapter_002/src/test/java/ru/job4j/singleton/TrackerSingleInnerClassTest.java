package ru.job4j.singleton;

import org.junit.Assert;
import org.junit.Test;

public class TrackerSingleInnerClassTest {

    @Test
    public void whenTrackerSingleIsTrue() {
        TrackerSingleEager tst = TrackerSingleEager.getInstance();
        TrackerSingleEager tst2 = TrackerSingleEager.getInstance();
        Assert.assertEquals(tst, tst2);
    }
}
