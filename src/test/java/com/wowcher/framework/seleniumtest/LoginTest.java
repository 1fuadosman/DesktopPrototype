package com.wowcher.framework.seleniumtest;


import com.wowcher.framework.config.Settings;
import com.wowcher.framework.pages.HomePage;
import com.wowcher.framework.pages.LoginPage;
import com.wowcher.framework.utilities.ExcelUtil;
import org.junit.Test;

public class LoginTest extends TestInitialize {




    @Test
    public void Login() {

        CurrentPage = GetInstance(HomePage.class);
        CurrentPage  = CurrentPage.As(HomePage.class).ClickLogin();
        CurrentPage.As(LoginPage.class).Login(ExcelUtil.ReadCell(("UserName"), 1),ExcelUtil.ReadCell(("Password"),1));


    }
}
