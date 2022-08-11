package com.company;

import java.util.Scanner;
public class a65Recursion {
    static int factorial(int n)
    {
        int fact;
        if(n==1 || n==0)
        {
            return 1;
        }
        else {
            fact = n*factorial(n-1);
            return fact;
        }
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = in.nextInt();
        System.out.println("The factorial of " + num + " is " + factorial(num));
        in.close();
    }
}
