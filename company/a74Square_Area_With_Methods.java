package com.company;

import java.util.Scanner;
class Square
{
    float side;
    public void get_side()
    {
        System.out.println("Side of square is " + side);
    }
    public float area()
    {
       return side*side;
    }
    public float Perimeter()
    {
        return 4*side;
    }
}

public class a74Square_Area_With_Methods {
    public static void main(String[] args) {
        Square s1 = new Square();
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the side: ");
        s1.side = in.nextFloat();
        s1.get_side();
        System.out.println("Area of square is " + s1.area());
        System.out.println("Perimeter of square is " + s1.Perimeter());
        in.close();

    }
}
