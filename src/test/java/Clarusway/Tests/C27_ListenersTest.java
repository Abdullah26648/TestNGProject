package Clarusway.Tests;

import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

@Listeners(Clarusway.Utilities.ListenersUtils.class)//Test class'ı ile listener class'ını bağlanmanın 1. yolu
public class C27_ListenersTest {

    @Test
    public void test1(){
        System.out.println("Test 1");
    }

    @Test
    public void test2(){
        System.out.println("Test 2");
    }

    @Test
    public void test3(){
        System.out.println("Test 3");
        throw new RuntimeException();
    }

    @Test
    public void test4(){
        System.out.println("Test 4");
        assertTrue(false);
    }

    @Test
    public void test5(){
        System.out.println("Test 5");
        throw  new SkipException("Skipped");
    }

}
