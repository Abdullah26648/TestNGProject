package Clarusway.Tasks.Special;

import Clarusway.Utilities.ExcelUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;


public class Task_29 {
    /*
    Go to https://testpages.eviltester.com/styled/apps/notes/simplenotes.html
    Add 10 notes using data provider with excel
    Run it with 3 different browsers using XML file
    Run it parallel with 3 threads
    */
    protected WebDriver driver;// static removed

    @BeforeMethod
    @Parameters("browser")
    public void setUp(@Optional("chrome")String browser){
        //if(driver == null) {                     // null removed
        switch (browser) {
            case "chrome":
                driver = new ChromeDriver();
                break;

            case "firefox":
                driver = new FirefoxDriver();
                break;

            case "edge":
                driver = new EdgeDriver();
                break;
        }
        //}                                     // null removed
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @Test(dataProvider = "getDataFromExcel")
    public void testdataProvider(String title, String note) throws InterruptedException {
        driver.get("https://testpages.eviltester.com/styled/apps/notes/simplenotes.html");
        driver.findElement(By.id("note-title-input")).sendKeys(title);
        driver.findElement(By.id("note-details-input")).sendKeys(note);
        driver.findElement(By.id("add-note")).click();
        Assert.assertEquals(title, driver.findElement(By.xpath("//p[@class='title-note-in-list']")).getText());

    }
    @DataProvider()
    public Object[][] getDataFromExcel() {
        ExcelUtils excelUtil = new ExcelUtils("Resources/username_password.xlsx", "Sheet2");
        return excelUtil.getDataArrayWithoutFirstRow();
    }
    @AfterMethod
    public void tearDown() {
        //if (driver != null) { // null removed
            driver.quit();
        //    driver = null;    // null removed
        //}                     // null removed
    }
}
