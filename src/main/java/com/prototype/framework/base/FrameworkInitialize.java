package com.prototype.framework.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class FrameworkInitialize extends Base {

    public void InitalizeBrowser(BrowserType browsertypes)
    {

        WebDriver driver=null;
        switch (browsertypes)
        {
            case Chrome:
            {
                String exePath = this.getClass().getClassLoader().getResource("webDrivers/chromedriver").getPath();
                System.setProperty("webdriver.chrome.driver", exePath);
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
                driver = new SafariDriver();
                break;
            }
        }
        //Set the Driver
        DriverContext.setDriver(driver);
        //Browser
        DriverContext.Browser = new Browser(driver);
    }

}
