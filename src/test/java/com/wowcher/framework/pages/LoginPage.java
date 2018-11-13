package com.wowcher.framework.pages;

import com.wowcher.framework.base.BasePage;
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

    public BasePage Login(String userName, String password){
        txtUserName.sendKeys(userName);
        txtPassword.sendKeys(password);
        btnLogin.submit();
        return GetInstance(HomePage.class);
    }
}
