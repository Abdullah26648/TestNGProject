package Clarusway.Tests;

import Clarusway.Utilities.DataProviderUtils;
import Clarusway.Utilities.TestBase;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class C16_DataProviderUtilsTest extends TestBase {
    @Test(dataProvider = "NameLastname", dataProviderClass = DataProviderUtils.class)
    public void parameterTest(String name,String password) throws InterruptedException {

        driver.get("https://testpages.eviltester.com/styled/basic-html-form-test.html");
        Thread.sleep(3000);

        driver.findElement(By.name("username")).sendKeys(name);
        Thread.sleep(3000);

        driver.findElement(By.name("password")).sendKeys(password);
        Thread.sleep(3000);

        driver.findElement(By.xpath("//input[@value='submit']")).click();

        String actualUsername = driver.findElement(By.id("_valueusername")).getText();

        assertEquals(actualUsername,name);

    }
}
