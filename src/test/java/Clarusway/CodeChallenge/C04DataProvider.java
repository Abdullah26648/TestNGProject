package Clarusway.CodeChallenge;

import Clarusway.Utilities.TestBase;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class C04DataProvider extends TestBase {
     /*
           https://bonigarcia.dev/selenium-webdriver-java/login-form.html adresine gidin
            DataProvider kullanarak login işlemini gerçekleştirin
         */



    @DataProvider(name = "loginData")
    public static Object[][] data() {
        return new Object[][] { { "user", "user", "Login successful" },
                { "bad-user", "bad-passwd", "Invalid credentials" } };
    }



    @Test(dataProvider = "loginData")
    public void testParameterized(String username, String password, String expectedText) {
        driver.get(
                "https://bonigarcia.dev/selenium-webdriver-java/login-form.html");

    }
}
