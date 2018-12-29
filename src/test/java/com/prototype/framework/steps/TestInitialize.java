package com.prototype.framework.steps;

import com.prototype.framework.base.DriverContext;
import com.prototype.framework.base.FrameworkInitialize;
import com.prototype.framework.config.ConfigReader;
import com.prototype.framework.config.Settings;
import com.prototype.framework.utilities.ExcelUtil;
import com.prototype.framework.utilities.LogUtil;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;


public class TestInitialize extends FrameworkInitialize {

    @Before
    public void Initialize() throws Exception {


        //Initiliaze Config
        ConfigReader.PopulateSettings();

        //Logging
        Settings.Logs = new LogUtil();
        Settings.Logs.CreateLogFile();
        Settings.Logs.Write("FrameWork initializer");


        //Settings.dev02DBConnectionString = DatabaseUtil.Open(Settings.dev02DBUrl, Settings.dbUserName, Settings.dbPassword);

        //DatabaseUtil.ExecuteQuery("select * from ORDER_LINE where product_order_id=25979200", Settings.dev02DBConnectionString);

        Settings.Logs.Write("Test Cycle Created");
        InitalizeBrowser(Settings.BrowserType);
        Settings.Logs.Write("Browser Initialized");
        DriverContext.Browser.GoToUrl(Settings.AUT);
        Settings.Logs.Write("Navigated to URL " + Settings.AUT);


        try {
            ExcelUtil util = new ExcelUtil(Settings.excelSheetPath);
        }
        catch (Exception e)
        {

        }
    }

    @After
    public void complete(Scenario scenario) throws Exception {

        DriverContext.Browser.closeBrowser();

    }
}
