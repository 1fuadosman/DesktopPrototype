package com.wowcher.framework.utilities;

public class EmailGeneratorUtil {

    public static String generateEmail() {
        int r = (int)(Math.random() * 999999990);
        String randomEmail = "wowcherautomation+" + r + "@gmail.com";
        System.out.println("*** Email generated is: " + randomEmail + " ***");
        return randomEmail;
    }
}
