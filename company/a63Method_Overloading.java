package com.company;

public class a63Method_Overloading {
    //METHOD OVERLOADING --> using same name of methods with different parameters
    static void func()
    {
        System.out.println("Hey there I am using VS Code!");
    }
    static void func(int a)//a,b are parameters
    {
        System.out.println("My age is " + a);
    }
    static void func(int a, int b)
    {
        System.out.println("I have " + a + " pens and " + b + " pencils.");
    }

    public static void main(String[] args){
        func();
        func(19);
        func(12, 6);//19,12,6 are arguments
    }
}
