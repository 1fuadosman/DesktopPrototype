package com.prototype.framework.utilities;

public class EmailGeneratorUtil {

    public static String generateEmail() {
        int randomNumber = (int)(Math.random() * 999999999);
        String randomEmail = "wowcherautomation+" + randomNumber + "@gmail.com";
        System.out.println("*** Email generated is: " + randomEmail + " ***");
        return randomEmail;
    }
}
