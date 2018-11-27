package com.prototype.framework.base;

import com.prototype.framework.config.Settings;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DriverContext {

    public static WebDriver Driver;

    public static Browser Browser;

    public static void setDriver(WebDriver driver) {
        Driver = driver;
    }

    public static void waitForPageToLoad() {
        WebDriverWait wait = new WebDriverWait(Driver, 30);
        JavascriptExecutor jsExecutor = (JavascriptExecutor)Driver;

        ExpectedCondition<Boolean> jsLoad = webDriver -> ((JavascriptExecutor)Driver)
                .executeScript("return document.readyState").toString().equals("complete");

        //Get JS ready
        Boolean jsReady = jsExecutor.executeScript("return document.readyState").toString().equals("complete");

        if(!jsReady)
            wait.until(jsLoad);
        else
            Settings.Logs.Write("Page is ready!");
    }

    public static void waitForElementVisible(final WebElement elementFindBy){
        WebDriverWait wait = new WebDriverWait(Driver, 30);
        wait.until(ExpectedConditions.visibilityOf(elementFindBy));
    }

    public static void waitForElementClickable(final WebElement elementFindBy){
        WebDriverWait wait = new WebDriverWait(Driver, 30);
        wait.until(ExpectedConditions.elementToBeClickable(elementFindBy));
    }

}
