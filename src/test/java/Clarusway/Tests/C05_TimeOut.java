package Clarusway.Tests;

import org.testng.annotations.Test;

public class C05_TimeOut {
    /*
        - Test için bir timeOut - zaman aşımı değeri belirlemeye yardımcı olur (genellikle milisaniye olarak kullanılır). Test belirtilen zaman aşımı değerinden daha fazlasını alırsa, test başarısız olarak işaretlenir.
        - Yöntemin makul bir süre içinde geri döndüğünden emin olmak için bu zaman aşımını bir performans testi yapmak için kullanabiliriz.
    */
    @Test
    public void test01() {
        System.out.println("Test 01");
    }

    @Test(timeOut = 3000)
    public void test02() throws InterruptedException {
        Thread.sleep(4000);//ThreadTimeoutException --> 'timeOut = 5000' ile belirtilen zaman dolduğu için exception atar
        System.out.println("Test 02");
    }

    @Test(timeOut = 3000)
    public void test03() throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("Test 03");
    }

}
