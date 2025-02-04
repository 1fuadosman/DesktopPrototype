package com.prototype.framework.pages;

import com.prototype.framework.base.BasePage;
import com.prototype.framework.base.DriverContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage extends BasePage{

    public LoginPage(){ }

    @FindBy(how = How.NAME, using = "UserName")
    public WebElement txtUserName;

    @FindBy(how = How.NAME, using = "Password")
    public WebElement txtPassword;

    @FindBy(how = How.CSS, using = "[class*='btn-default']")
    public WebElement btnLogin;

    public void Login(String userName, String password){
        DriverContext.waitForElementVisible(txtUserName);
        txtUserName.sendKeys(userName);
        txtPassword.sendKeys(password);
    }

    public HomePage ClickLogin(){
        DriverContext.waitForElementClickable(btnLogin);
        btnLogin.submit();
        return GetInstance(HomePage.class);
    }

}
