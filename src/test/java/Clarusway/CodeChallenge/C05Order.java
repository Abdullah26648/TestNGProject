package Clarusway.CodeChallenge;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class C05Order {
    /*
           https://bonigarcia.dev/selenium-webdriver-java/navigation1.html adresine gidin
            DataProvider kullanarak login işlemini gerçekleştirin
            1.sayfadaki body nin "Lorem ipsum" icerdigini
            2.sayfadaki body nin "Ut enim" icerdigini
            3.sayfadaki body nin "Excepteur sint" icerdigini dogrulayin
            Assert işlemleri için assertBodyContains methodunu kullanın
         */
    WebDriver driver;
    //extent kullanma.......
    @BeforeClass
    public void setup() {
        driver = new ChromeDriver();
    }

    @AfterClass
    public void teardown() {
        driver.quit();
    }



    void assertBodyContains(String text) {
        String bodyText = driver.findElement(By.xpath("//p[@class='lead']")).getText();
        Assert.assertTrue(bodyText.contains(text));
    }
}
