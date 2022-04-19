package com.proday.javatest.util;

import static com.proday.javatest.util.SecurityLevel.MEDIUM;
import static com.proday.javatest.util.SecurityLevel.STRONG;
import static com.proday.javatest.util.SecurityLevel.WEAK;

/**
 * @author Ruben Malaga
 */
public class PasswordUtil {

    public static SecurityLevel assessPassword(String password) {
        if (password.length() < 8) {
            return WEAK;
        }

        if (password.matches("[a-zA-Z]+")) {
            return WEAK;
        }

        if (password.matches("[a-zA-Z0-9]+")) {
            return MEDIUM;
        }

        return STRONG;
    }
}
