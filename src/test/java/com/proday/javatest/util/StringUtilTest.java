package com.proday.javatest.util;

/**
 * @author Ruben Malaga
 */
public class StringUtilTest {

    public static void main(String[] args) {
        String result = StringUtil.repeat("hola", 3);
        assertEquals(result, "holaholahola");
    }

    private static void assertEquals(String actual, String expected) {
        if (!actual.equals(expected)) {
            throw new RuntimeException(
                actual + " is not equal to expected " + expected
            );
        }
    }
}
