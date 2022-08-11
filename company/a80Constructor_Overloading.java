package com.company;

class Our_Employee
{
    private final String name;
    private final int id;
    private final int salary;
    public Our_Employee(String n, int i, int sl)
    {
        name = n;
        id=i;
        salary=sl;
    }
    public Our_Employee()
    {
        name = "Shashi";
        id= 45;
        salary = 340000;
    }
    public Our_Employee(int s)
    {
        name = "hina";
        id=55;
        salary = s;
    }

    public String get_name()
    {
        return name;

    }
    public int get_id()
    {
        return id;
    }
    public int get_salary()
    {
        return salary;
    }
}
public class a80Constructor_Overloading {
    public static void main(String[] args) {
        Our_Employee e1 = new Our_Employee("Guggu", 456, 67999);
        System.out.println(e1.get_id());
        System.out.println(e1.get_salary());
        System.out.println(e1.get_name());
    }
}
