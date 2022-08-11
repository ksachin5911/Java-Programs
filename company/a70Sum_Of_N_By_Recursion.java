package com.company;

import java.util.Scanner;
public class a70Sum_Of_N_By_Recursion {
    static int sum(int x)
    {
        //Base condition
        if (x==1)
        {
            return 1;
        }
        else
         
        return x + sum(x-1); //Recursion
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = in.nextInt();
        System.out.print("Sum = ");
        System.out.println(sum(n));
        in.close();
    }
}
