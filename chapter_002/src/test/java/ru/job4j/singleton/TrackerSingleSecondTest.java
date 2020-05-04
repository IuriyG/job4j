package ru.job4j.singleton;

import org.junit.Assert;
import org.junit.Test;

public class TrackerSingleSecondTest {

    @Test
    public void whenTrackerSingleIsTrue() {
        TrackerSingleSecond tss = TrackerSingleSecond.getInstance();
        TrackerSingleSecond tss2 = TrackerSingleSecond.getInstance();
        Assert.assertEquals(tss, tss2);
    }
}
