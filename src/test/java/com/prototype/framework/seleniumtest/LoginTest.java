package com.prototype.framework.seleniumtest;


import com.prototype.framework.pages.HomePage;
import com.prototype.framework.pages.LoginPage;
import com.prototype.framework.steps.TestInitialize;
import com.prototype.framework.utilities.ExcelUtil;
import org.junit.Test;

public class LoginTest extends TestInitialize {




    @Test
    public void Login() {

        CurrentPage = GetInstance(HomePage.class);
        CurrentPage  = CurrentPage.As(HomePage.class).ClickLogin();
        CurrentPage.As(LoginPage.class).Login(ExcelUtil.ReadCell(("UserName"), 1),ExcelUtil.ReadCell(("Password"),1));


    }
}
