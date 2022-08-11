package com.company;//OBJECT ORIENTED PROGRAMMING
import java.util.Scanner;
class Employee
{
    int id;
    String name;
    int salary;
    //String st;
    public String get_name()
    {
        return name;
    }
    public int get_salary()
    {
        return salary;
    }
    public int get_id()
    {
        return id;
    }
    public void set_name(String st)
    {
        name = st;
    }
}
public class a73CustomClass {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("This is our Custom Class!");
        Employee e1 = new Employee(); //Instantiating a new employee object
        Employee e2 = new Employee();
        //setting attributes
        e1. id = 56292;
        e1.salary = 34000;
        e2.id = 56286;
        e2.salary = 56000;
        e1.set_name("Sachin");
        e2.set_name("Sidhu");
        System.out.println("Details of Employee 1:");
        System.out.println("Name = " + e1.get_name());
        System.out.println("Salary = " + e1.get_salary());
        System.out.println("ID = " + e1.get_id());
        System.out.println("Details of Employee 2:");
        System.out.println("Name = " + e2.get_name());
        System.out.println("Salary = " + e2.get_salary());
        System.out.println("ID = " + e2.get_id());
        in.close();
    }
}
