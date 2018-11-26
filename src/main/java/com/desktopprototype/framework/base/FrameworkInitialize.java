package com.desktopprototype.framework.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FrameworkInitialize extends Base {

    public void InitalizeBrowser(BrowserType browsertypes)
    {

        WebDriver driver=null;
        switch (browsertypes)
        {
            case Chrome:
            {
                driver = new ChromeDriver();
                break;
            }
            case Firefox:
            {
                System.setProperty("webdriver.firefox.marionette", "false");
                driver = new FirefoxDriver();
                break;
            }
            case IE:
            {
                break;
            }
            case Safari:
            {
                break;
            }
        }
        //Set the Driver
        DriverContext.setDriver(driver);
        //Browser
        DriverContext.Browser = new Browser(driver);
    }

}
