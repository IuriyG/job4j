package ru.job4j.singleton;

import org.junit.Assert;
import org.junit.Test;

public class TrackerSingleLazyTest {

    @Test
    public void whenTrackerSingleIsTrue() {
        TrackerSingleLazy tss = TrackerSingleLazy.getInstance();
        TrackerSingleLazy tss2 = TrackerSingleLazy.getInstance();
        Assert.assertEquals(tss, tss2);
    }
}
