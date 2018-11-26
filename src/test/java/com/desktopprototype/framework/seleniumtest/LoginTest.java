package com.desktopprototype.framework.seleniumtest;


import com.desktopprototype.framework.pages.HomePage;
import com.desktopprototype.framework.pages.LoginPage;
import com.desktopprototype.framework.steps.TestInitialize;
import com.desktopprototype.framework.utilities.ExcelUtil;
import org.junit.Test;

public class LoginTest extends TestInitialize {




    @Test
    public void Login() {

        CurrentPage = GetInstance(HomePage.class);
        CurrentPage  = CurrentPage.As(HomePage.class).ClickLogin();
        CurrentPage.As(LoginPage.class).Login(ExcelUtil.ReadCell(("UserName"), 1),ExcelUtil.ReadCell(("Password"),1));


    }
}
