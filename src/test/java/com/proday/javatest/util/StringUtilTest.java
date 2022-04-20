package com.proday.javatest.util;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author Ruben Malaga
 */
public class StringUtilTest {

    @Test
    public void repeatStringOnce() {
        Assert.assertEquals(
            "holaholahola", StringUtil.repeat("hola", 3)
        );
    }

    @Test
    public void repeatStringMultipleTimes() {
        Assert.assertEquals(
            "hola", StringUtil.repeat("hola", 1)
        );
    }

    @Test
    public void repeatStringZeroTimes() {
        Assert.assertEquals(
            "", StringUtil.repeat("hola", 0)
        );
    }

    @Test(expected = IllegalArgumentException.class)
    public void repeatStringNegativeTimes() {
        StringUtil.repeat("hola", -1);
    }
}
