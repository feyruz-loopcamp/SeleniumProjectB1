package com.loop.test.day8_webtables_properties;

import com.loop.test.Utilities.ConfigurationReader;
import com.loop.test.base.TestBase;
import org.testng.annotations.Test;

public class T1_login_docuport extends TestBase {


    @Test
    public void login_docuport(){
        driver.get(ConfigurationReader.getProperty("dev"));
    }

}
