package Clarusway.Tests;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class C09_AssertionsInfo {

    @Test
    public void hardAssertionTest(){

        //Burada hard assertion kullanıldığı için, assertion kaldığında(fail) bir sonraki kod çalışmaz.
        assertEquals(5, 51,"Actual ve Expected değerler uyuşmadı");
        System.out.println("1. assertion geçtiği için bu kod çalıştı");

        assertTrue(1<2,"Koşul false verdi");
        System.out.println("2. assertion geçtiği için bu kod çalıştı");

        //Hard assertion daha çok tercih edilir. Fail durumunda kod hemen durmalı ve müdehale edilmelidir.

    }

    @Test
    public void softAssertionTest(){

        //Soft assert adımları:
        //1. Adım: SoftAssert objesi oluştur
        SoftAssert softAssert = new SoftAssert();

        //2. Adım: Assertion yap
        softAssert.assertEquals(5, 5,"Actual ve Expected değerler uyuşmadı");
        System.out.println("1. assertion fail olsa dahi bu kod çalışır.");

        softAssert.assertTrue(1<2,"Koşul false verdi");
        System.out.println("2. assertion fail olsa dahi bu kod çalışır.");

        softAssert.assertTrue("Hello".contains("He"),"Koşul false verdi");
        System.out.println("3. assertion fail olsa dahi bu kod çalışır.");

        //3. Adım: assertAll() metodunu kullan
        softAssert.assertAll();
        System.out.println("Fail durumunda bu kod çalışmaz. Çalıştıysa fail olmamıştır yada assertAll() metodu kullanılmamıştır.");


    }

}
