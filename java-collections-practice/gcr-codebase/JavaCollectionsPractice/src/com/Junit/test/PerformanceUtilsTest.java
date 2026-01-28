package com.Junit.test;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import com.Junit.main.PerformanceUtils;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

class PerformanceUtilsTest {

    // This test will FAIL because method takes 3 seconds > 2 seconds to make it pass I have take sleep time = 1000
    @Test
    @Timeout(value = 2, unit = TimeUnit.SECONDS)
    void testLongRunningTaskTimeout() {
        PerformanceUtils utils = new PerformanceUtils();
        String result = utils.longRunningTask();
        assertEquals("Task Completed", result);
    }
}
