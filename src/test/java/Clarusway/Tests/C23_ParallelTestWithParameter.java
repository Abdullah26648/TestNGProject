package Clarusway.Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class C23_ParallelTestWithParameter {

    /*
    TestNG'de, test kodunun kendisini de yapılandırarak tek bir test yöntemini paralel olarak çalıştırma imkanımız olabilir.
    threadPoolSize: Oluşturmak ve testi paralel olarak çalıştırmak istediğimiz iş parçacığı sayısına denir.
    invocationCount: Bu yöntemi kaç kez çağırmak istediğimiz zaman kullanırız.
    */
    @Test (threadPoolSize = 3, invocationCount = 10)
    public void test01() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.navigate().refresh();
        driver.get("http://www.clarusway.com");
        driver.quit();
    }

}
