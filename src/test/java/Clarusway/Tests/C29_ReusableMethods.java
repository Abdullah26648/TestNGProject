package Clarusway.Tests;

import Clarusway.Utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static Clarusway.Utilities.JavascriptUtils.*;
import static org.testng.AssertJUnit.assertTrue;

public class C29_ReusableMethods extends TestBase {

    //Üzerinde işlem yapılacak web elementi öncesinde flash yapın.

    @Test
    public void test01() {

        driver.get("https://practicetestautomation.com/practice-test-login/");

        generateAlert("Sayfa açıldı");

        driver.switchTo().alert().accept();

        WebElement username = driver.findElement(By.id("username"));

        addBorderWithJS(username,"inset");

        flash(username,"red");

        username.sendKeys("student");

        WebElement password = driver.findElement(By.id("password"));

        flash(password,"red");

        addBorderWithJS(password,"dashed");

        password.sendKeys("Password123");

        WebElement submit = driver.findElement(By.id("submit"));

        flash(submit,"yellow");

        submit.click();

        WebElement message = driver.findElement(By.tagName("strong"));

        flash(message,"blue");

        assertTrue(message.getText().contains("Congratulations"));

        addBorderWithJS(message, "solid");

        generateAlert("TEST BİTTİ");

        driver.switchTo().alert().accept();

    }


}