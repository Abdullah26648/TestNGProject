package Clarusway.Tests;

import Clarusway.Utilities.TestBase;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static org.testng.AssertJUnit.assertTrue;

public class C10_HardAndSoftAssertions extends TestBase {

/*
    Test Case1: Positive Login Test
    Open page https://practicetestautomation.com/practice-test-login/
    Type username student into Username field
    Type password Password123 into Password field
    Click Submit button.
    Verify new page URL contains practicetestautomation.com/logged-in-successfully/
    Verify new page contains expected text ('Congratulations' or 'successfully logged in')
    Verify button Log out is displayed on the new page.
*/

    @Test
    public void hardAssertionTest(){
//        Open page https://practicetestautomation.com/practice-test-login/
        driver.get("https://practicetestautomation.com/practice-test-login/");

//        Type username student into Username field
        driver.findElement(By.id("username")).sendKeys("student");

//        Type password Password123 into Password field
        driver.findElement(By.id("password")).sendKeys("Password123");

//        Click Submit button.
        driver.findElement(By.id("submit")).click();

//        Verify new page URL contains practicetestautomation.com/logged-in-successfully/
        assertTrue(driver.getCurrentUrl().contains("practicetestautomation.com/logged-in-successfully/"));

//        Verify new page contains expected text ('Congratulations' or 'successfully logged in')
        assertTrue(driver.findElement(By.tagName("strong")).getText().contains("Congratulations"));

//        Verify button Log out is displayed on the new page.
        assertTrue(driver.findElement(By.linkText("Log out")).isDisplayed());

    }

    @Test
    public void softAssertionTest(){
//        Open page https://practicetestautomation.com/practice-test-login/
        driver.get("https://practicetestautomation.com/practice-test-login/");

//        Type username student into Username field
        driver.findElement(By.id("username")).sendKeys("student");

//        Type password Password123 into Password field
        driver.findElement(By.id("password")).sendKeys("Password123");

//        Click Submit button.
        driver.findElement(By.id("submit")).click();

//        Verify new page URL contains practicetestautomation.com/logged-in-successfully/
        //1. Adım:
        SoftAssert softAssert = new SoftAssert();

        //2. Adım:
        softAssert.assertTrue(driver.getCurrentUrl().contains("practicetestautomation.com/logged-in-successfully/"));

//        Verify new page contains expected text ('Congratulations' or 'successfully logged in')
        softAssert.assertTrue(driver.findElement(By.tagName("strong")).getText().contains("Congratulations"));

//        Verify button Log out is displayed on the new page.
        softAssert.assertTrue(driver.findElement(By.linkText("Log out")).isDisplayed());

        //3. Adım:
        softAssert.assertAll();
        System.out.println("---Fail Durumunda Çalışmayan Satır---");

    }


}