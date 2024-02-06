package Clarusway.Tasks;

import Clarusway.Utilities.ExtentReportUtils;
import Clarusway.Utilities.TestBase;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import static Clarusway.Utilities.ExtentReportUtils.passAndCaptureScreenshot;

public class Task_30 extends TestBase {
    /*
    Go to https://automationexercise.com/
    Create an account and delete it.
    Create HTML report for each step with screenshots
    */
    @Test
    public void test() throws InterruptedException {
        ExtentReportUtils.createTestReport("Task_30", "Task_30 ...");
        //Go to https://automationexercise.com/
        ExtentReportUtils.info("Kullanıcı automationexercise gider");
        driver.get("https://automationexercise.com/");
        //Create an account and delete it.
        ExtentReportUtils.info("Kullanıcı oluştura tıklar");
        driver.findElement(By.xpath("//i[@class='fa fa-lock']")).click();
        passAndCaptureScreenshot("Kullanıcı oluştura tıklar");
        ExtentReportUtils.info("Kullanıcı bilgilerini girer");
        driver.findElement(By.xpath("//input[@data-qa='signup-name']")).sendKeys(faker.name().firstName());
        driver.findElement(By.xpath("//input[@data-qa='signup-email']")).sendKeys(faker.internet().emailAddress());
        passAndCaptureScreenshot("Kullanıcı bilgilerini girer");
        ExtentReportUtils.info("Signup buttonuna tıklar");
        driver.findElement(By.xpath("//button[@data-qa='signup-button']")).click();
        passAndCaptureScreenshot("Signup buttonuna tıklar");
        ExtentReportUtils.info("Cinsiyeti secer");
        driver.findElement(By.xpath("//input[@type='radio']")).click();
        passAndCaptureScreenshot("Cinsiyeti secer");
        ExtentReportUtils.info("Şifresini girer");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys(faker.internet().password(), Keys.PAGE_DOWN);
        passAndCaptureScreenshot("Şifresini girer");
        ExtentReportUtils.info("Doğum tarihini girer");
        actions.moveToElement(driver.findElement(By.id("days"))).
                sendKeys(
                        Keys.TAB,
                        Keys.PAGE_DOWN,
                        Keys.PAGE_DOWN,
                        Keys.TAB,
                        Keys.PAGE_DOWN,
                        Keys.PAGE_DOWN,
                        Keys.TAB,
                        Keys.PAGE_DOWN,
                        Keys.PAGE_DOWN
                ).perform();
        passAndCaptureScreenshot("Doğum tarihini girer");
        ExtentReportUtils.info("Uygun gördüklerini işaretler");
        driver.findElement(By.xpath("//input[@id='newsletter']")).click();
        driver.findElement(By.xpath("//input[@id='optin']")).click();
        passAndCaptureScreenshot("Uygun gördüklerini işaretler");
        ExtentReportUtils.info("Kullanıcı bilgilerini girer");
        driver.findElement(By.xpath("//input[@id='first_name']")).sendKeys(faker.name().firstName());
        driver.findElement(By.xpath("//input[@id='last_name']")).sendKeys(faker.name().lastName());
        driver.findElement(By.xpath("//input[@id='company']")).sendKeys(faker.company().name());
        driver.findElement(By.xpath("//input[@id='address1']")).sendKeys(faker.address().streetAddress());
        Select select = new Select(driver.findElement(By.xpath("//select[@id='country']")));
        select.selectByIndex(1);
        driver.findElement(By.xpath("//input[@id='state']")).sendKeys(faker.address().state());
        driver.findElement(By.xpath("//input[@id='city']")).sendKeys(faker.address().city());
        driver.findElement(By.xpath("//input[@id='zipcode']")).sendKeys(faker.address().zipCode());
        driver.findElement(By.xpath("//input[@id='mobile_number']")).sendKeys(faker.number().digits(10));
        passAndCaptureScreenshot("Kullanıcı bilgilerini girer");
        ExtentReportUtils.info("Create account'a tıklar");
        driver.findElement(By.xpath("//button[@data-qa='create-account']")).click();
        passAndCaptureScreenshot("Create account'a tıklar");
        ExtentReportUtils.info("Continue'a tıklar");
        driver.findElement(By.xpath("//a[@data-qa='continue-button']")).click();
        driver.switchTo().frame(1);
        driver.findElement(By.xpath("//div[@id='dismiss-button']")).click();
        driver.switchTo().defaultContent();
        passAndCaptureScreenshot("Oluşturulan hesap");
        ExtentReportUtils.info("Delete account'a tıklar");
        driver.findElement(By.xpath("//i[@class='fa fa-trash-o']")).click();
        passAndCaptureScreenshot("Silinen hesap");
        ExtentReportUtils.info("Continue'a tıklar");
        driver.findElement(By.xpath("//a[@data-qa='continue-button']")).click();
        passAndCaptureScreenshot("Silinmiş hesap");

    }

}
