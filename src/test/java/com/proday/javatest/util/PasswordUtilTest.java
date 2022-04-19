package com.proday.javatest.util;

import static org.junit.Assert.assertEquals;

import static com.proday.javatest.util.SecurityLevel.MEDIUM;
import static com.proday.javatest.util.SecurityLevel.STRONG;
import static com.proday.javatest.util.SecurityLevel.WEAK;

import org.junit.Test;


/**
 * @author Ruben Malaga
 */
public class PasswordUtilTest {

    @Test
    public void weakWhenHasLessThan8Letters() {
        assertEquals(WEAK, PasswordUtil.assessPassword("123aa!"));
    }

    @Test
    public void weakWhenHasOnlyLetters() {
        assertEquals(WEAK, PasswordUtil.assessPassword("abcdefghklmn"));
    }

    @Test
    public void mediumWhenHasLettersAndNumbers() {
        assertEquals(MEDIUM, PasswordUtil.assessPassword("abcd12345"));
    }

    @Test
    public void strongWhenHasLettersNumbersAndSymbols() {
        assertEquals(STRONG, PasswordUtil.assessPassword("abcd123!"));
    }
}
