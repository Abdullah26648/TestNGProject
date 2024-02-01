package Clarusway.Tests;

import Clarusway.Utilities.TestBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class C21_ParallelTest {

    @Test
    public void test1(){
        WebDriver driver = new ChromeDriver();driver.get("https://google.com");driver.quit();
    }

    @Test
    public void test2(){
        WebDriver driver = new ChromeDriver();driver.get("https://linkedin.com");driver.quit();
    }

    @Test
    public void test3(){
        WebDriver driver = new ChromeDriver();driver.get("https://youtube.com");driver.quit();
    }

    @Test
    public void test4(){
        WebDriver driver = new ChromeDriver();driver.get("https://instagram.com");driver.quit();
    }

    @Test
    public void test5(){
        WebDriver driver = new ChromeDriver();driver.get("https://facebook.com");driver.quit();
    }

}
