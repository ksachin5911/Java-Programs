package com.company;

import java.util.Scanner;
public class a39Factorial {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = in.nextInt();
        int factorial = 1;
        for(int i = n; i>=1; i--)
        {
            factorial *= i;
        }
        System.out.printf("The factorial of %d is %d", n, factorial);
        in.close();
    }
}
