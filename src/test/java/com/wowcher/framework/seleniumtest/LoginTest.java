package com.wowcher.framework.seleniumtest;

import com.wowcher.framework.base.BrowserType;
import com.wowcher.framework.base.DriverContext;
import com.wowcher.framework.base.FrameworkInitialize;
import com.wowcher.framework.config.ConfigReader;
import com.wowcher.framework.config.Settings;
import com.wowcher.framework.pages.HomePage;
import com.wowcher.framework.pages.LoginPage;
import com.wowcher.framework.utilities.DatabaseUtil;
import com.wowcher.framework.utilities.ExcelUtil;
import com.wowcher.framework.utilities.LogUtil;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.sql.Connection;

public class LoginTest extends FrameworkInitialize {


    @Before
    public void Initialize() throws Exception {


        ConfigReader.PopulateSettings();

        Connection conn = DatabaseUtil.Open(Settings.dev02DBConnectionString, Settings.dbUserName, Settings.dbPassword);

        DatabaseUtil.ExecuteQuery("select * from ORDER_LINE where product_order_id=25979200", conn);


        LogUtil logUtil = new LogUtil();
        logUtil.CreateLogFile();
        logUtil.Write("FrameWork initializers,ddjskldjskjdksjdkl");
        InitalizeBrowser(Settings.BrowserType);
        DriverContext.Browser.GoToUrl(Settings.AUT);

        try {
            ExcelUtil util = new ExcelUtil(Settings.excelSheetPath);
        }
        catch (Exception e)
        {

        }
    }

    @Test
    public void Login() throws IOException {
        /*
        driver.findElement(By.name("UserName")).sendKeys("admin");
        driver.findElement(By.name("Password")).sendKeys("admin");
        driver.findElement(By.name("Login")).submit();*/

        CurrentPage = GetInstance(HomePage.class);
        CurrentPage  = CurrentPage.As(HomePage.class).ClickLogin();
        //CurrentPage.As(LoginPage.class).Login("admin", "password");

        //Data driven(DDT) from Excel
        CurrentPage.As(LoginPage.class).Login(ExcelUtil.ReadCell(("UserName"), 1),ExcelUtil.ReadCell(("Password"),1));



    }
}
