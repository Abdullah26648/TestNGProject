package Clarusway.Tasks;

import Clarusway.Utilities.TestBase;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.time.Duration;

import static org.testng.AssertJUnit.assertEquals;

@Listeners(Clarusway.Utilities.ListenersUtils.class)
public class Task_32 extends TestBase {
    /*
    Go to https://testpages.eviltester.com/styled/dynamic-buttons-simple.html
    Click buttons to see message All Buttons Clicked!
    Use Allure reports and listeners
    */
    @Test
    @Severity(SeverityLevel.CRITICAL)
    public void test() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://testpages.eviltester.com/styled/dynamic-buttons-simple.html");
        driver.findElement(By.id("button00")).click();
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("button01"))));
        driver.findElement(By.id("button01")).click();
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("button02"))));
        driver.findElement(By.id("button02")).click();
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("button03"))));
        driver.findElement(By.id("button03")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("buttonmessage")));
        String message = driver.findElement(By.id("buttonmessage")).getText();
        assertEquals("All Buttons Clicked",message);


    }

}
