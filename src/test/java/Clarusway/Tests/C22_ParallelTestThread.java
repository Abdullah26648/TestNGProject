package Clarusway.Tests;

import org.testng.annotations.Test;

public class C22_ParallelTestThread {

    @Test
    public void test1(){
        System.out.println("ThreadId: " + Thread.currentThread().threadId());//Thread.currentThread().threadId() --> Şu an çalışan Thread'in numarası
        System.out.println("Test 1");
    }

    @Test
    public void test2(){
        System.out.println("ThreadId: " + Thread.currentThread().threadId());System.out.println("Test 2");
    }

    @Test
    public void test3(){
        System.out.println("ThreadId: " + Thread.currentThread().threadId());System.out.println("Test 3");
    }

    @Test
    public void test4(){
        System.out.println("ThreadId: " + Thread.currentThread().threadId());System.out.println("Test 4");
    }

    @Test
    public void test5(){
        System.out.println("ThreadId: " + Thread.currentThread().threadId());System.out.println("Test 5");
    }

}
