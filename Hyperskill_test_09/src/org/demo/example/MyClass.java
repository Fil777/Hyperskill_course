package org.demo.example;

public class MyClass {

    public MyClass() {
        System.out.println("Myclass");
    }

    private void method1() {
        MyClass mc = new MyClass();
        System.out.println("method1");
    }

    public void method2() {
        MyClass mc = new MyClass();
        method1();
        System.out.println("method2");
    }
}