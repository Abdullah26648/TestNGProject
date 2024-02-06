package Clarusway.Tests.SmokeTest;

import Clarusway.Utilities.ExtentReportUtils;
import Clarusway.Utilities.TestBase;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static Clarusway.Utilities.ExtentReportUtils.*;
import static org.testng.AssertJUnit.assertTrue;

public class PositiveLoginTest extends TestBase {
        /*
        Go to URL: https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
        Enter username Admin
        Enter password admin123
        Click login button
        Assert that user singed in
        Doing Cross Browser Testing.
        */
    @Test
    public void PositiveLoginTest() throws InterruptedException {

        //Raporlama için:
        //1. Adım:  ExtentReportUtils.createTestReport();
        ExtentReportUtils.createTestReport("positiveLoginTest","positiveLoginTest ...");

        //2. Adım: pass(), fail() ...
        //        Go to URL: https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
        ExtentReportUtils.info("Kullanıcı anasayfaya gider");
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(1000);
        pass("Kullanıcı anasayfada");
        passAndCaptureScreenshot("Kullanıcı anasayfada");

//        Enter username Admin
        driver.findElement(By.name("username")).sendKeys("Admin");
        Thread.sleep(1000);
        passAndCaptureScreenshot("Enter username Admin");

//        Enter password admin123
        driver.findElement(By.name("password")).sendKeys("admin123");
        Thread.sleep(1000);
        passAndCaptureScreenshot("Enter password admin123");

//        Click login button
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(1000);
        passAndCaptureScreenshot("Click login button");

//        Assert that user singed in
        assertTrue(driver.findElement(By.xpath("//img[@alt='profile picture']")).isDisplayed());

        //3. Adım: flush();
        flush();

    }

}
