package Clarusway.Tests;

import Clarusway.Utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class C11_SoftAssertion extends TestBase {
/*
    Open page https://practicetestautomation.com/practice-test-login/
    Type username incorrectUser into Username field.
    Type password Password123 into Password field.
    Click Submit button.
    Verify error message is displayed.
    Verify error message text is Your username is invalid!
*/

    @Test
    public void softAssertionTest(){
//        Open page https://practicetestautomation.com/practice-test-login/
        driver.get("https://practicetestautomation.com/practice-test-login/");

//        Type username incorrectUser into Username field.
        driver.findElement(By.id("username")).sendKeys("incorrectUser");

//        Type password Password123 into Password field
        driver.findElement(By.id("password")).sendKeys("Password123");

//        Click Submit button.
        driver.findElement(By.id("submit")).click();

//        Verify error message is displayed.
//        Verify error message text is Your username is invalid!
        WebElement errorMessage = driver.findElement(By.id("error"));
        boolean isDisplayed = errorMessage.isDisplayed();
        String errorMessageText = errorMessage.getText();

        SoftAssert softAssert = new SoftAssert();

        softAssert.assertTrue(isDisplayed);
        softAssert.assertEquals(errorMessageText, "Your username is invalid!", "Error mesajı 'Your username is invalid!' değil");

        softAssert.assertAll();//Unutma!!!

    }

}
