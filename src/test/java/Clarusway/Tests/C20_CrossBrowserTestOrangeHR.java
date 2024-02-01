package Clarusway.Tests;

import Clarusway.Utilities.TestBase;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class C20_CrossBrowserTestOrangeHR extends TestBase {
    /*
    Go to URL: https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
    Enter username Admin
    Enter password admin123
    Click login button
    Assert that user singed in
    Doing Cross Browser Testing.
    */
    @Test
    public void testLogin() throws InterruptedException {
    //  Go to URL: https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(1000);

    //  Enter username Admin
        driver.findElement(By.name("username")).sendKeys("Admin");
        Thread.sleep(1000);

    //  Enter password admin123
        driver.findElement(By.name("password")).sendKeys("admin123");
        Thread.sleep(1000);

    //  Click login button
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(1000);

    //  Assert that user singed in
        assertTrue(driver.findElement(By.xpath("//img[@alt='profile picture']")).isDisplayed());


    //  Doing Cross Browser Testing.



    }

}
