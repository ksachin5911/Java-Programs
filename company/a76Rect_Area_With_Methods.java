package com.company;

import java.util.Scanner;
class Rectangle
{
    float length;
    float breadth;
    public float area_rectangle()
    {
        return length*breadth;
    }
    public float perimeter_rectangle()
    {
        return 2*(length+breadth);
    }
    public void print_dim()
    {
        System.out.println("Length and Breadth of rectangle is " + length + " and " + breadth + 
                                    " respectively");
    }
}
public class a76Rect_Area_With_Methods {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter length and breadth: ");
        Rectangle r1 = new Rectangle();
        r1.length = in.nextFloat();
        r1.breadth = in.nextFloat();
        r1.print_dim();
        System.out.println("Area of rectangle = " + r1.area_rectangle());
        System.out.println("Perimeter of rectangle = " + r1.perimeter_rectangle());
        in.close();
    } 
}
