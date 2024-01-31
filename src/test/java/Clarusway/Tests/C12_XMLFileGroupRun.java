package Clarusway.Tests;

import org.testng.annotations.Test;

public class C12_XMLFileGroupRun {

    @Test(groups = "Group 3")
    public void test01() {
        System.out.println("Test 1 - Group 3");
    }

    @Test(groups = "Group 2")
    public void test02() {
        System.out.println("Test 2 - Group 2");
    }

    @Test(groups = "Group 1")
    public void test03() {
        System.out.println("Test 3 - Group 1");
    }

    @Test(groups = "Group 3")
    public void test04() {
        System.out.println("Test 4 - Group 3");
    }

    @Test(groups = "Group 1")
    public void test05() {
        System.out.println("Test 5 - Group 1");
    }

    @Test(groups = "Group 2")
    public void test06() {
        System.out.println("Test 6 - Group 2");
    }

    @Test(groups = "Group 2")
    public void test07() {
        System.out.println("Test 7 - Group 2");
    }

    @Test(groups = "Group 1")
    public void test08() {
        System.out.println("Test 8 - Group 1");
    }

}
