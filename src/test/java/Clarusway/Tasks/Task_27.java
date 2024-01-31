package Clarusway.Tasks;

import Clarusway.Utilities.TestBase;
import com.google.common.collect.Table;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Task_27 extends TestBase {
    /*
        Find the height of the earliest built tower on this page:
        (Listedeki ilk inşa edilmiş kulenin uzunluğunu yazdırınız)
        https://www.techlistic.com/p/demo-selenium-practice.html
        Your code must be dynamic
        Run test with XML file
    */
    @Test
    public void Heightoftheearliestbuilttower() {
//      https://www.techlistic.com/p/demo-selenium-practice.html
        driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");

//      Your code must be dynamic
//      Find the height of the earliest built tower on this page:
//      (Listedeki ilk inşa edilmiş kulenin uzunluğunu yazdırınız)
        WebElement table = driver.findElement(By.xpath("//table[@class='tsc_table_s13']"));

        List<WebElement> years = table.findElements(By.xpath(".//tbody/tr/td[4]"));

        List<Integer> ListOfYears = new ArrayList<>();

        for (WebElement year : years) {
            ListOfYears.add(Integer.parseInt(year.getText()));
        }

        int earliestYear = ListOfYears.stream().min(Integer::compare).orElseThrow();

        int index = ListOfYears.indexOf(earliestYear);

        WebElement earliestBuiltTower = table.findElement(By.xpath(".//tbody/tr[" + (index + 1) + "]/td[3]"));
        System.out.println("Height of the earliest built tower: " + earliestBuiltTower.getText());

//      Run test with XML file





    }

}
