package Clarusway.Tests;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class C07_Groups {
    //TestNG'de @BeforeGroups ve dependsOnGroups özellikleri, belirli bir grup testlerin çalışmadan önce başka bir grup testin tamamlanmasına bağımlılığını sağlar.

    @BeforeGroups(groups = "Group A")
    public void beforeGroupA(){
        System.out.println("beforeGroupA");
    }

    @BeforeGroups(groups = "Group B")
    public void beforeGroupB(){
        System.out.println("beforeGroupB");
    }

    @AfterGroups(groups = "Group B")
    public void afterGroupB(){
        System.out.println("afterGroupB");
    }

    @AfterGroups(groups = "Group A")
    public void afterGroupA(){
        System.out.println("afterGroupA");
    }

    @Test(groups = "Group B")
    public void test01(){
        System.out.println("Test 01");
    }

    @Test(groups = "Group A")
    public void test02(){
        System.out.println("Test 02");
    }

    @Test
    public void test03(){
        System.out.println("Test 03");
    }

    @Test(groups = "Group B")
    public void test04(){
        System.out.println("Test 04");
    }

    @Test(groups = "Group A")
    public void test05(){
        System.out.println("Test 05");
    }

    @Test
    public void test06(){
        System.out.println("Test 06");
    }

    @Test(dependsOnGroups = "Group A")//A grubu testinin tüm işlemi (afterGroup dahil) bittikten sonra çalışır
    public void groupATest(){
        System.out.println("Group A Test");
    }

    @Test(dependsOnGroups = "Group B")
    public void groupBTest(){
        System.out.println("Group B Test");
    }

}
