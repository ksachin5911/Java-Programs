package com.company;

abstract class base2
{
    base2()
    {
        System.out.println("Constructor of base2 class");
    }
    public void hello()
    {
        System.out.println("Hello Java");
    }
    abstract public void greet();
    abstract public void greet2();
}
class derived2 extends base2
{
    @Override
    public void greet()
    {
        System.out.println("Good Morning");
    }
    @Override
    public void greet2()
    {
        System.out.println("Good Afternoon");
    }
}
abstract class derived3 extends base2
{
    public void good()
    {
        System.out.println("Im good");
    }
}
public class a91Abstract_Classes {
    public static void main(String[] args) {
        derived2 d2 = new derived2();
        d2.greet();
        d2.greet2();
        d2.hello();
        //base2 b2 = new base2(); --> error- cannot be formed
        //derived3 d3 = new derived3(); --> error - cannot be formed
    }
}
