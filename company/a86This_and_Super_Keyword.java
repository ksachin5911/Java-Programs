package com.company;

class myclass
{
    int a;
    myclass()
    {
        System.out.println("Default constructor");
    }
    myclass(int i)
    {
        this.a = i;
    }
    public int getA() {
        return a;
    }
}
class your_class extends myclass {
    your_class() {
        System.out.println("Default constructor of your class");
    }

    your_class(int s) {
        super(s);
        System.out.println("Overloaded constructor with " + s);
    }
}
public class a86This_and_Super_Keyword {
    public static void main(String[] args) {
        myclass m = new myclass(55);
        your_class y = new your_class(88);
        System.out.println(m.getA());
    }
}
