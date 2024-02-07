package Clarusway.Tests;

import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.SkipException;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class C26_AllureReportTest {

    @Test
    @Severity(SeverityLevel.BLOCKER)
    public void test1(){
        System.out.println("Test 1 BLOCKER");
    }

    @Test
    @Severity(SeverityLevel.CRITICAL)
    public void test2(){
        System.out.println("Test 2 CRITICAL");
    }

    @Test
    @Severity(SeverityLevel.NORMAL)
    public void test3(){
        System.out.println("Test 3 NORMAL");
        throw new RuntimeException();
    }

    @Test
    @Severity(SeverityLevel.MINOR)
    public void test4(){
        System.out.println("Test 4 MINOR");
        assertTrue(false);
    }

    @Test
    @Severity(SeverityLevel.TRIVIAL)
    public void test5(){
        System.out.println("Test 5 TRIVIAL");
        throw  new SkipException("Skipped");
    }

}
