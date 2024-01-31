package Clarusway.Tests;

import Clarusway.Utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class C15_DataProvider extends TestBase {
    @Test(dataProvider = "NameLastname")
    public void DataProviderTest(String name,String lastname) {
        System.out.println("name = " + name +" -- "+"lastname = "+ lastname);
    }

    @DataProvider
    public Object[][] NameLastname() {

        String [][] data = {{"John","Doe"},{"Jim","Sun"},{"Zoey","Bread"}};

        return data;

    }
    @Test(dataProvider = "NameLastname")
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
