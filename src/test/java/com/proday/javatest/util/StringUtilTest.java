package com.proday.javatest.util;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author Ruben Malaga
 */
public class StringUtilTest {

    @Test
    public void testRepeat() {
        Assert.assertEquals(
            "holaholahola", StringUtil.repeat("hola", 3)
        );

        Assert.assertEquals(
            "hola", StringUtil.repeat("hola", 1)
        );
    }
}
