package com.prototype.framework.pages;

import com.prototype.framework.base.BasePage;
import com.prototype.framework.base.DriverContext;
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
        DriverContext.waitForElementClickable(lnkLogin);
        lnkLogin.click();
        return GetInstance(LoginPage.class);

    }

    public boolean IsLogin()
    {
        return lnkLogin.isDisplayed();
    }

    public String GetLoggedInUser()
    {
        DriverContext.waitForElementVisible(lnkUserName);
        return lnkUserName.getText();
    }

    public EmployeeListPage ClickEmployeeList() {
        DriverContext.waitForElementClickable(lnkEmployeeList);
        lnkEmployeeList.click();
        return GetInstance(EmployeeListPage.class);
    }

}
