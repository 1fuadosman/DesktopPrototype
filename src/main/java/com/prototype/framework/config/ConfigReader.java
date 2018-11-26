package com.prototype.framework.config;

import com.prototype.framework.base.BrowserType;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigReader {

    public static void PopulateSettings() throws IOException {
        ConfigReader reader = new ConfigReader();
        reader.ReadProperty();
    }


    private void ReadProperty() throws IOException {

        Properties p = new Properties();
        InputStream inputStream = new FileInputStream("src/test/resources/GlobalConfig.properties");
        p.load(inputStream);
       // p.load(Thread.currentThread().getContextClassLoader().getResourceAsStream("GlobalConfig.properties"));
        Settings.dev02DBUrl = p.getProperty("dev02DBUrl");
        Settings.dbUserName = p.getProperty("dbUserName");
        Settings.dbPassword = p.getProperty("dbPassword");
        Settings.logPath = p.getProperty("logPath");
        Settings.excelSheetPath = p.getProperty("excelSheetPath");
        Settings.dbDriverType = p.getProperty("dbDriverType");
        Settings.AUT = p.getProperty("AUT");
        //cast browser type to convert string parameter to BrowserType
        Settings.BrowserType = BrowserType.valueOf(p.getProperty("BrowserType"));
    }


}
