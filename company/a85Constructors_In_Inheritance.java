package com.company;

class base1
{
    base1()
    {
        System.out.println("Constructor of base class");
    }
    base1(int a)
    {
        System.out.println("Overloaded Constructor with argument of value " + a);
    }
}
class derived1 extends base1
{
    derived1()
    {
        //super(99);
        System.out.println("constructor of derived class");
    }
    derived1(int a, int b)
    {
        super(a);//super keyword is used to call the constructor with arguments
        System.out.println("Overloaded constructor of derived class with " + a + " and " + b);

    }
}
class child_of_derived1 extends derived1
{
    child_of_derived1()
    {
        System.out.println("I am child of derived class constructor.");
    }
    child_of_derived1(int x, int y, int z)
    {
        super(x,y);
        System.out.println("Overloaded constructor with value of x, y, z are " + x + " " + y + " " + z);
    }
}
public class a85Constructors_In_Inheritance {
    public static void main(String[] args) {
        /*
        //base1 b = new base1();
        //derived1 d = new derived1(34,8);
         */
        //child_of_derived1 c = new child_of_derived1();
        child_of_derived1 c = new child_of_derived1(23,56,11);
    }
}
