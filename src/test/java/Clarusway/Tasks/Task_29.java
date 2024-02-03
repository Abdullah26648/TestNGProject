package Clarusway.Tasks;

import Clarusway.Utilities.DataProviderUtils;
import Clarusway.Utilities.ParameterBrowserTestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Arrays;

public class Task_29 extends ParameterBrowserTestBase {
    /*
    Go to https://testpages.eviltester.com/styled/apps/notes/simplenotes.html
    Add 10 notes using data provider with excel
    Run it with 3 different browsers using XML file
    Run it parallel with 3 threads
    */
    @Test(dataProvider = "ExelDataParallel2", dataProviderClass = DataProviderUtils.class)
    public void Task_29(String title, String note) throws InterruptedException {

        //  Go to https://testpages.eviltester.com/styled/apps/notes/simplenotes.html
        driver.get("https://testpages.eviltester.com/styled/apps/notes/simplenotes.html");

        //  Add 10 notes using data provider with excel
        //  Run it with 3 different browsers using XML file
        //  Run it parallel with 3 threads

        FluentWait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(20))
                .pollingEvery(Duration.ofMillis(500))
                .ignoreAll(Arrays.asList(NoSuchElementException.class, StaleElementReferenceException.class));

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='note-title-input']")));
        driver.findElement(By.xpath("//input[@id='note-title-input']")).sendKeys(title);

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//textarea[@id='note-details-input']")));
        driver.findElement(By.xpath("//textarea[@id='note-details-input']")).sendKeys(note);

        wait.until(ExpectedConditions.elementToBeClickable(By.id("add-note")));
        driver.findElement(By.id("add-note")).click();

    }

}
