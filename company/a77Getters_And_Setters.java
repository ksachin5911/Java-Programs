package com.company;

class Car
{
    private String name;
    private String color;
    private int number;
    public String get_name()//Getters
    {
        return name;
    }
    public void set_name(String s)//Setters
    {
        name=s;
    }
    public String get_color()//Getters
    {
        return color;
    }
    public void set_color(String clr)//Setters
    {
        color = clr;
    }
    public void set_number(int num)//Setters
    {
        number=num;
    }
    public int get_number()//Getters
    {
        return number;
    }
}
public class a77Getters_And_Setters {
    public static void main(String[] args) {
        Car c1  = new Car();
        c1.set_name("G Wagon");
        c1.set_color("Black");
        c1.set_number(8000);
        System.out.println(c1.get_name());
        System.out.println(c1.get_color());
        System.out.println(c1.get_number());
    }
}
