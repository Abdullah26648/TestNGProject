package Clarusway.Tasks;

import Clarusway.Utilities.ExcelUtils;
import Clarusway.Utilities.ParameterBrowserTestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.time.Duration;

public class Task_29 extends ParameterBrowserTestBase{
    /*
    Go to https://testpages.eviltester.com/styled/apps/notes/simplenotes.html
    Add 10 notes using data provider with excel
    Run it with 3 different browsers using XML file
    Run it parallel with 3 threads
    */
    @Test(dataProvider = "ExelDataParallel")
    public void Task_29(String title, String note) throws InterruptedException {

    //  Go to https://testpages.eviltester.com/styled/apps/notes/simplenotes.html
        driver.get("https://testpages.eviltester.com/styled/apps/notes/simplenotes.html");

    //  Add 10 notes using data provider with excel
    //  Run it with 3 different browsers using XML file
    //  Run it parallel with 3 threads
        FluentWait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(20))//Toplam bekleme süresi
                .pollingEvery(Duration.ofSeconds(2))//Her 2 saniyede bir elementin varlığını kontrol eder
                .ignoring(NoSuchElementException.class);//NoSuchElementException'ı görmezden gelir

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='note-title-input']")));
        driver.findElement(By.xpath("//input[@id='note-title-input']")).sendKeys(title);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//textarea[@id='note-details-input']")));
        driver.findElement(By.xpath("//textarea[@id='note-details-input']")).sendKeys(note);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("add-note")));
        driver.findElement(By.id("add-note")).click();
        Thread.sleep(2000);
        driver.quit();

    }
    @DataProvider(parallel = true)
    public Object[][] ExelDataParallel() {

        ExcelUtils excelUtils = new ExcelUtils("Resources/username_password.xlsx","Sheet2");

        return excelUtils.getDataArrayWithoutFirstRow();
    }

}
