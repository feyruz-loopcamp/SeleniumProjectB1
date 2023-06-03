package com.loop.test.day7_windows;

import com.loop.test.Utilities.DocuportUtilites;
import com.loop.test.Utilities.Driver;
import com.loop.test.base.TestBase;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class T0_login_docuport extends TestBase {

    @Test
    public void T(){
        DocuportUtilites.loginDocuport(driver, "advisoR");
        System.out.println("((RemoteWebDriver) Driver.getDriver()).getSessionId() = " + ((RemoteWebDriver) driver).getSessionId());
        DocuportUtilites.logOut(driver);
        System.out.println("((RemoteWebDriver) Driver.getDriver()).getSessionId() = " + ((RemoteWebDriver) driver).getSessionId());
    }



}
