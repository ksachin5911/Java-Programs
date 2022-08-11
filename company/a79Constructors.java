package com.company;

class Details
{
    private String name;
    private int id;
    public Details(String S, int i)
    {
        name = S;
        id = i;
    }
    public void set_name(String s)
    {
        name =s;

    }
    public int get_id()
    {
        return id;
    }
    public void set_id(int i)
    {
        id=i;
    }
    public String get_name()
    {
        return name;
    }
}
public class a79Constructors {
    public static void main(String[] args) {
        Details d1 = new Details("Sachin", 798);
        System.out.println(d1.get_name());
        System.out.println(d1.get_id());
    }
}
