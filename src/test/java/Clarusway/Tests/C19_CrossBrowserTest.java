package Clarusway.Tests;

import Clarusway.Utilities.ParameterBrowserTestBase;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class C19_CrossBrowserTest extends ParameterBrowserTestBase {
    @Test
    public void test1(){
        driver.get("https://google.com");
    }

    @Test
    public void test2(){
        driver.get("https://linkedin.com");
    }

    @Test
    public void test3(){
        driver.get("https://youtube.com");
    }

}
