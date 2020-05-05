package ru.job4j.singleton;

import org.junit.Assert;
import org.junit.Test;

public class TrackerSingleEagerTest {

    @Test
    public void whenTrackerSingleIsTrue() {
        TrackerSingleInnerClass tsf = TrackerSingleInnerClass.getInstance();
        TrackerSingleInnerClass tsf2 = TrackerSingleInnerClass.getInstance();
        Assert.assertEquals(tsf, tsf2);
    }
}
