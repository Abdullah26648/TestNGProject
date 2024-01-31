package Clarusway.Tests;

import org.testng.annotations.Test;

public class C06_Description {
    //  Testle ilgili bilgileri açıklayan
    //  @Test annotationa eklenen ve genelde tek bir dizeden oluşan açıklamadır.

    @Test(description = "US01_TC03")
    public void test01(){
        System.out.println("Test 01");
    }

    @Test(description = "Test 02")
    public void test02(){
        System.out.println("Test 02");
    }

    @Test
    public void test03(){
        System.out.println("Test 03");
    }

    @Test(priority = -5, dependsOnMethods = "test02", enabled = true, timeOut = 3000, description = "Yanyana tüm attribute'ler eklenebilir")
    void test04(){//dependsOnMethods attribute'ü bulunduğu için öncelik bu sıralamdadir. priority = -5'te değildir.
        System.out.println("Test 04");
    }

}
