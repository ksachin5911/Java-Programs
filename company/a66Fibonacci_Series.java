package com.company;

import java.util.Scanner;
public class a66Fibonacci_Series {
    static int  fib(int n)
    {
        if(n==1)
        {
            return 0;
        }
        else if(n == 2)
        {
            return 1;
        }
        else
            return fib(n - 1) + fib( n- 2);
    }
    public static void main(String [] args){
        System.out.print("Enter the value of n: ");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        for(int i=1; i<=num;i++)
        {
            System.out.print(fib(i) + " ");
        }
        in.close();
    }
}
