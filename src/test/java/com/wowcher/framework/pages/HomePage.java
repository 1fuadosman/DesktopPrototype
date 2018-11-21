package com.wowcher.framework.pages;

import com.wowcher.framework.base.BasePage;
import com.wowcher.framework.config.Settings;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage extends BasePage {

    public HomePage() { }

    @FindBy(how = How.LINK_TEXT, using = "Login")
    public WebElement lnkLogin;

    @FindBy(how = How.LINK_TEXT, using = "Employee List")
    public WebElement lnkEmployeeList;

    @FindBy(how = How.XPATH, using = "//a[@title='Manage']")
    public WebElement lnkUserName;


    public LoginPage ClickLogin() {
        lnkLogin.click();
        return GetInstance(LoginPage.class);

    }

    public boolean IsLogin()
    {
        return lnkLogin.isDisplayed();
    }

    public String GetLoggedInUser()
    {
        return lnkUserName.getText();
    }

}
