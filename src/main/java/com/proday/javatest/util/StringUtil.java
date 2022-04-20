package com.proday.javatest.util;

/**
 * @author Ruben Malaga
 */
public class StringUtil {

    public static String repeat(String str, int times) {
        if (times < 0 ){
            throw new IllegalArgumentException("Negative times not allowed");
        }

        String result = "";

        for (int index = 0; index < times; index++) {
            result += str;
        }

        return result;
    }
}
