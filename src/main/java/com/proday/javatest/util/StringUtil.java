package com.proday.javatest.util;

/**
 * @author Ruben Malaga
 */
public class StringUtil {

    public static String repeat(String str, int times) {
        String result = "";

        for (int index = 0; index < times; index++) {
            result += str;
        }

        return result;
    }
}
