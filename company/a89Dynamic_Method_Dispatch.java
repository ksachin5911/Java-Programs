package com.company;

class Super
{
    public void name()
    {
        System.out.println("Im Sachin!");
    }
    public void welcome()
    {
        System.out.println("you are Welcome");
    }
}
class Sub extends Super
{
    @Override
    public void name()
    {
        System.out.println("Im Sachin in class Sub");
    }
    public void greet()
    {
        System.out.println("You are greeted");
    }
}
public class a89Dynamic_Method_Dispatch {
    public static void main(String[] args) {
        Super o = new Super();
        Super obj = new Sub(); //Reference of super class and object of subclass
        Sub t = new Sub();
        obj.welcome();
        obj.name();
        o.welcome();
        o.name();
        t.greet();
    }
}
