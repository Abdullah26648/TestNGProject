package Clarusway.Utilities;

import com.aventstack.extentreports.ExtentReports;
import com.github.javafaker.Faker;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public abstract class TestBase {

    protected static WebDriver driver;
    protected  Faker faker;
    protected  Actions actions;
    protected ExtentReports extent;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        actions = new Actions(driver);
        faker = new Faker();
        extent = new ExtentReports();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }

}
