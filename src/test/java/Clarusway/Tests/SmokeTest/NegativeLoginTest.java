package Clarusway.Tests.SmokeTest;

import Clarusway.Utilities.TestBase;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class NegativeLoginTest extends TestBase {
        /*
        Go to URL: https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
        Enter username Admin
        Enter password admin123
        Click login button
        Assert that user singed in
        Doing Cross Browser Testing.
        */
    @Test
    public void NegativeLoginTest() throws InterruptedException {

            //  Go to URL: https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
            driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
            Thread.sleep(1000);

            //  Enter username Admin
            driver.findElement(By.name("username")).sendKeys("admin");
            Thread.sleep(1000);

            //  Enter password admin123
            driver.findElement(By.name("password")).sendKeys("admin12");
            Thread.sleep(1000);

            //  Click login button
            driver.findElement(By.xpath("//button[@type='submit']")).click();
            Thread.sleep(1000);

            //  Assert that user singed in
            assertTrue(driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p oxd-alert-content-text']")).isDisplayed());


            //  Doing Cross Browser Testing.


    }

}
