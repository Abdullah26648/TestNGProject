package Clarusway.Utilities;

import com.github.javafaker.Faker;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Factory;

import java.time.Duration;

public abstract class TestBase {

    protected static WebDriver driver;
    protected  Faker faker;
    protected  Actions actions;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        actions = new Actions(driver);
        faker = new Faker();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        //driver.quit();
    }

}
