package Clarusway.Tests;

import Clarusway.Utilities.DataProviderUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class C24_DataProviderTest extends DataProviderUtils {
    @Test(dataProvider = "ExelDataParallel", dataProviderClass = DataProviderUtils.class)
    public void DataProviderFakerTest(String username,String password,String comment) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://testpages.eviltester.com/styled/basic-html-form-test.html");

        driver.findElement(By.name("username")).sendKeys(username);

        driver.findElement(By.name("password")).sendKeys(password);

        WebElement comments = driver.findElement(By.name("comments"));
        comments.clear();

        comments.sendKeys(comment);

        driver.findElement(By.xpath("//input[@value='submit']")).click();

        String actualUsername = driver.findElement(By.id("_valueusername")).getText();

        assertEquals(actualUsername,username);

        driver.quit();

    }
}
