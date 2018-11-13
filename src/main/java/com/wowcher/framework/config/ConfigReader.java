package com.wowcher.framework.config;

import java.io.IOException;
import java.util.Properties;

public class ConfigReader {



    private void ReadProperty() throws IOException {
        Properties p = new Properties();
        p.load(getClass().getResourceAsStream("GlobalConfig.properties"));

        Settings.dev02DBConnectionString = p.getProperty("dev02DBConnectionString");

    }


}
