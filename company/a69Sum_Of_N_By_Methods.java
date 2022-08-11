package com.company;

import java.util.Scanner;
public class a69Sum_Of_N_By_Methods {
    static int sum(int n)
    {
        int result=0;
        for(int i=0; i<=n;i++)
        {
            result += i;
        }
        return result;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n= in.nextInt();
        System.out.println("Sum of first "+ n + " natural numbers is " + sum(n));
        in.close();
    }
}
