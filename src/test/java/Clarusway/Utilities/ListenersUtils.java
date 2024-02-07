package Clarusway.Utilities;

import org.testng.*;
import org.testng.annotations.ITestAnnotation;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class ListenersUtils implements ITestListener, IRetryAnalyzer, IAnnotationTransformer {

    @Override//Test methodu çalışmaya başladığında çalışır
    public void onTestStart(ITestResult result) {
        System.out.println(result.getName()+" testi başladı");
    }

    @Override//Başarı ile geçen (PASS) test sonrası çalışır
    public void onTestSuccess(ITestResult result) {
        System.out.println(result.getName()+" testi geçti");
    }

    @Override//Kalan (FAIL) test sonrası çalışır
    public void onTestFailure(ITestResult result) {
        System.out.println(result.getName()+" testi kaldı");
    }

    @Override//Atlanan (SKIP) test sonrası çalışır
    public void onTestSkipped(ITestResult result) {
        System.out.println(result.getName()+" testi atlandı");
    }

    @Override//Belirli bir başarı oranı sonrası çalışır
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        //
    }

    @Override//Zaman aşımı ile kalan test sonrası çalışır
    public void onTestFailedWithTimeout(ITestResult result) {
        System.out.println(result.getName()+" testi zaman aşımı ile kaldı");
    }

    @Override//Tüm test başlarken çalışır
    public void onStart(ITestContext context) {
        System.out.println("Test Başladı: "+context.getStartDate());
    }

    @Override//Tüm test bitince çalışır
    public void onFinish(ITestContext context) {
        System.out.println("Test Bitti: "+context.getEndDate());
    }

    // Otomatik olarak Başarısız Test Senaryolarını bir kez daha yeniden çalıştırır
// IRetryAnalyzer Yöntemi Uygulanmıştır
// BU yöntem, BAŞARISIZ TEST SENARYOLARINI YENİDEN ÇALIŞTIRMAK İÇİN OTOMATİK OLARAK ÇAĞRILACAKTIR
    private int retryCount = 0;
    private static final int maxRetryCount = 2; // YENİDEN ÇALIŞTIRMA SAYISI
    @Override
    public boolean retry(ITestResult result) {
        if (retryCount < maxRetryCount) {
            retryCount++;
            return true;
        }
        return false;
    }

    // IAnnotationTransformer yöntemi eklenmiştir
// Bu, başarısız test senaryolarını otomatik olarak testng xml dosyalarını kullanarak yeniden çalıştırır
    @Override
    public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
        annotation.setRetryAnalyzer(ListenersUtils.class);
    }

}
