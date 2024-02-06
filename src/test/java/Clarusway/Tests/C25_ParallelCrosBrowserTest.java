package Clarusway.Tests;

import Clarusway.Utilities.DataProviderUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class C25_ParallelCrosBrowserTest {
/*
Go to https://testpages.eviltester.com/styled/apps/notes/simplenotes.html
Add 10 notes using data provider with excel
Run it with 3 different browsers using XML file
Run it parallel with 3 threads
 */

    @Test(dataProvider = "ExelDataParallel2", dataProviderClass = DataProviderUtils.class)
    public void Task_29_Chrome(String title, String note) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://testpages.eviltester.com/styled/apps/notes/simplenotes.html");
        driver.findElement(By.xpath("//input[@id='note-title-input']")).sendKeys(title);
        driver.findElement(By.xpath("//textarea[@id='note-details-input']")).sendKeys(note);
        driver.findElement(By.id("add-note")).click();
        driver.quit();
    }

    @Test(dataProvider = "ExelDataParallel2", dataProviderClass = DataProviderUtils.class)
    public void Task_29_Edge(String title, String note) throws InterruptedException {
        WebDriver driver = new EdgeDriver();
        driver.get("https://testpages.eviltester.com/styled/apps/notes/simplenotes.html");
        driver.findElement(By.xpath("//input[@id='note-title-input']")).sendKeys(title);
        driver.findElement(By.xpath("//textarea[@id='note-details-input']")).sendKeys(note);
        driver.findElement(By.id("add-note")).click();
        driver.quit();
    }

    @Test(dataProvider = "ExelDataParallel2", dataProviderClass = DataProviderUtils.class)
    public void Task_29_Firefox(String title, String note) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://testpages.eviltester.com/styled/apps/notes/simplenotes.html");
        driver.findElement(By.xpath("//input[@id='note-title-input']")).sendKeys(title);
        driver.findElement(By.xpath("//textarea[@id='note-details-input']")).sendKeys(note);
        driver.findElement(By.id("add-note")).click();
        driver.quit();
    }


}