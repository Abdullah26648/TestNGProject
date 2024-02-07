package Clarusway.CodeChallenge;

import org.testng.annotations.DataProvider;

public class C06CrossBrowser {
        /*
        https://bonigarcia.dev/selenium-webdriver-java/ adresine gidin
        Title ın "Selenium WebDriver" icerdigini dogrulayin
        Chapter 7. Login Form butona tıklayın
        USERNAME:user
        PASSWORD:user
        olacak şekilde formu doldurun ve login olun.

        Kodlarınızı "chrome","safari" ve "firefox" browserlarda test edin

        */


    @DataProvider(name = "browsers")
    public static Object[][] data() {
        return new Object[][]{{"chrome"}, {"safari"}, {"firefox"}};
    }


}
