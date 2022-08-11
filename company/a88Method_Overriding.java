package com.company;

class A
{
    public void method1()
    {
        System.out.println("Method 1 of class A");
    }
    public void method2()
    {
        System.out.println("Method 2 of class A");
    }
}
class B extends A
{
    @Override
    public void method2()
    {
        System.out.println("Method 2 of class B");
    }
    public void method3()
    {
        System.out.println("Method 3 of class B");
    }
}
public class a88Method_Overriding {
    public static void main(String[] args) {
        A a  = new A();
        B b  = new B();
        a.method1();
        a.method2();
        b.method2();
        b.method3();
    }
}
