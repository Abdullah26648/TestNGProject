package Clarusway.CodeChallenge;

import Clarusway.Utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class C02Shadow extends TestBase {
     /*
           https://bonigarcia.dev/selenium-webdriver-java/shadow-dom.html adresine gidin
            body nin ve p taglı elementin "Hello Shadow DOM" icerdigini dogrulayin
         */
     @Test
     public void testShadowDom() {
         driver.get(
                 "https://bonigarcia.dev/selenium-webdriver-java/shadow-dom.html");



     }
}
