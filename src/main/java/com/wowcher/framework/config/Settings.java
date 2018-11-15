package com.wowcher.framework.config;

import com.wowcher.framework.base.BrowserType;
import com.wowcher.framework.utilities.LogUtil;
import sun.security.krb5.internal.crypto.CksumType;

import java.sql.Connection;

public class Settings {

    //dev02 db connection string
    public static String dev02DBUrl;
    //For username for all database connection
    public static String dbUserName;
    //Passwords the same for all database connections
    public static String dbPassword;
    //dev02 connection String
    public static Connection dev02DBConnectionString;
    //Log path for the framework
    public static String logPath;
    //excel sheet path
    public static String excelSheetPath;
    //database driver type
    public static String dbDriverType;
    //stores the application under test URL
    public static String AUT;
    //Store browser type
    public static BrowserType BrowserType;
    public static LogUtil Logs;
}
