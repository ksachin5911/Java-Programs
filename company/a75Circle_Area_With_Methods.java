package com.company;

import java.util.Scanner;
class Circle
{
    float radius;
    float pi = 3.14f;
    public float area_circle()
    {
        return pi*radius*radius;
    }
    public float perimeter_circle()
    {
        return 2*pi*radius;
    }
    public void print_radius()
    {
        System.out.println("Radius of circle is "+ radius);
    }
}
public class a75Circle_Area_With_Methods {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Circle c1 = new Circle();
        System.out.print("Enter radius of circle: ");
        c1.radius = in.nextFloat();
        c1.print_radius();
        System.out.println("Area of circle = " + c1.area_circle());
        System.out.println("Perimeter of circle = " + c1.perimeter_circle());
        in.close();
    }
}