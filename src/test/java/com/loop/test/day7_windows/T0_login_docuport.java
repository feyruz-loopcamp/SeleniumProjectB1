package com.loop.test.day7_windows;

import com.loop.test.Utilities.DocuportUtilites;
import com.loop.test.base.TestBase;
import org.testng.annotations.Test;

public class T0_login_docuport extends TestBase {

    @Test
    public void T(){
        DocuportUtilites.loginDocuport(driver, "advisoR");
        DocuportUtilites.logOut(driver);
    }



}
