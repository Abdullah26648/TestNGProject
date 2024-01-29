package Clarusway.Tests;

import org.testng.annotations.Test;

public class C03_DependsOnMethods {
    /*
    - İkinci test methodu birinci test methoduna bağımlı olmak istediğinde bu attribute kullanılır.
    - Birinci test methodu başarısız olursa, birinci test methodundaki bağımlı method, yani ikinci test methodu çalışmayacaktır.
    - Bir parametrede bir method veya birden çok method iletilebilir.
    */
    @Test
    public void loginTest() {
        System.out.println("Login Test");
        //throw  new RuntimeException();// --> Bu method fail olursa, bu methoda bağle diğer methodlar çalışmaz.
    }

    @Test(dependsOnMethods = "loginTest")//--> homepageTest, loginTest'e bağımlıdır. homepageTest çalışmadan, loginTest calışmaz.
    public void homepageTest(){
        System.out.println("Homepage Test");
    }

    @Test(dependsOnMethods = {"homepageTest", "loginTest"})
    public void smokeTest(){
        System.out.println("Smoke Test");
    }

    @Test//Bu test hiçbir teste bağımlı değildir
    public void independentTest(){
        System.out.println("independentTest");
    }

    /*
        independentTest
        Login Test
        Homepage Test
        Smoke Test
     */


}