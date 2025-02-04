package com.prototype.framework.base;

import org.openqa.selenium.WebDriver;

public class Browser {

    private WebDriver _driver;

    public BrowserType Type;

    public Browser(WebDriver driver) {
        _driver = driver;
    }

    public void GoToUrl(String url)
    {
        _driver.get(url);
    }

    public void Maximize()
    {
        _driver.manage().window().maximize();
    }

    public void closeBrowser() {
        _driver.close();
    }




}

