package com.loop.test.day8_webtables_properties;

import com.loop.test.Utilities.PizzaOrderWebTableUtils;
import com.loop.test.base.TestBase;
import org.testng.annotations.Test;

public class T4_pizza_order extends TestBase {

    @Test
    public void pizza_order_validation(){
        driver.get("https://loopcamp.vercel.app/web-tables.html");
        System.out.println(PizzaOrderWebTableUtils.returnAnyField(driver, "Robert Baratheon", "City" ));

    }

}
