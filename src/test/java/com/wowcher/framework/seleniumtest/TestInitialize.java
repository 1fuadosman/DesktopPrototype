package com.wowcher.framework.seleniumtest;

import com.wowcher.framework.base.DriverContext;
import com.wowcher.framework.base.FrameworkInitialize;
import com.wowcher.framework.config.ConfigReader;
import com.wowcher.framework.config.Settings;
import com.wowcher.framework.utilities.DatabaseUtil;
import com.wowcher.framework.utilities.ExcelUtil;
import com.wowcher.framework.utilities.LogUtil;
import org.junit.Before;

public class TestInitialize extends FrameworkInitialize {

    @Before
    public void Initialize() throws Exception {


        //Initiliaze Config
        ConfigReader.PopulateSettings();

        //Logging
        Settings.Logs = new LogUtil();
        Settings.Logs.CreateLogFile();
        Settings.Logs.Write("FrameWork initializer");


        Settings.dev02DBConnectionString = DatabaseUtil.Open(Settings.dev02DBUrl, Settings.dbUserName, Settings.dbPassword);

        DatabaseUtil.ExecuteQuery("select * from ORDER_LINE where product_order_id=25979200", Settings.dev02DBConnectionString);

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
}
