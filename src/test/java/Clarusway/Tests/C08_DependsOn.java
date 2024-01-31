package Clarusway.Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class C08_DependsOn {

    WebDriver driver;

    @BeforeClass
    public void setUp(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test(dependsOnMethods = "test02")
    public void test01(){
        driver.get("https://youtube.com");
    }

    @Test(dependsOnMethods = "test03")
    public void test02(){
        driver.get("https://linkedin.com");
    }

    @Test
    public void test03(){

        driver.get("https://clarusway.com");

    }

}
