package com.tech.tests;

import com.tech.utilities.ConfigReader;
import com.tech.utilities.Driver;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Test01 {

    @Test
    public void test(){
        Driver.getDriver().get(ConfigReader.getProperty("app_url"));

        String actualTitle=Driver.getDriver().getTitle();
        String expectedTitle=ConfigReader.getProperty("app_title");

       // Assert.assertEquals(actualTitle,expectedTitle);
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertEquals(actualTitle,expectedTitle);
        softAssert.assertAll();

        Driver.getDriver().findElement(By.partialLinkText("Account")).click();
        Driver.closeDriver();

    }
}
