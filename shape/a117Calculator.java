package com.shape;

import java.util.Scanner;
class firstexp extends Exception//cannot divide by zero exception
{
    @Override
    public String toString()
    {
        return "Error: Cannot divide by Zero";
    }
}
class secondexp extends Exception//Input cannot be greater than 100000
{
    @Override
    public String toString()
    {
        return "Error: Input cannot be greater than 100000";
    }
}
class thirdexp extends Exception//Multiplier cannot exceed 7000
{
    @Override
    public String toString()
    {
        return "Error: Multiplier cannot exceed 7000";
    }
}
class fourthexp extends Exception//Invalid Input
{
    @Override
    public String toString()
    {
        return "Error: Invalid Input";
    }
}
public class a117Calculator {
    public static double add(double a, double b) throws secondexp, fourthexp
    {
        if(a ==8 || b==9)
        {
            throw new fourthexp();
        }
        if(a >100000 || b>100000)
        {
            throw new secondexp();
        }
        return a+b;
    }
    public static double subtract(double a, double b) throws secondexp, fourthexp
    {
        if(a ==8 || b==9)
        {
            throw new fourthexp();
        }
        if(a >100000 || b>100000)
        {
            throw new secondexp();
        }
        return a-b;
    }
    public static double multiply(double a, double b) throws thirdexp, fourthexp
    {
        if(a ==8 || b==9)
        {
            throw new fourthexp();
        }
        if(a >7000 || b>7000)
        {
            throw new thirdexp();
        }
        return a*b;
    }
    public static double divide(double a, double b) throws firstexp, secondexp, fourthexp
    {
        if(a ==8 || b==9)
        {
            throw new fourthexp();
        }
        if(b==0)
        {
            throw new firstexp();
        }
        if(a >100000 || b>100000)
        {
            throw new secondexp();
        }
        return a/b;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Operations:- ");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.print("Which option you will choose: ");
        int c = in.nextInt();
        try {
            System.out.print("Enter the value of a: ");
            double a = in.nextDouble();
            System.out.print("Enter the value of b: ");
            double b = in.nextDouble();
            switch (c)
            {
                case 1 -> System.out.println("Sum = " + add(a, b));
                case 2 -> System.out.println("Difference = " + subtract(a, b));
                case 3 -> System.out.println("Product = " + multiply(a, b));
                case 4 -> System.out.println("Division = " + divide(a, b));
                default -> System.out.println("Invalid choice");
            }
        }
        catch(Exception e)
        {
            System.out.println(e.toString());
        }
    }
}