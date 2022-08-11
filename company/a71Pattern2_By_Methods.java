package com.company;

import java.util.Scanner;
public class a71Pattern2_By_Methods {
    static void pattern(int x)
    {
        for(int i=x; i>0; i--)
        {
            for(int j=0; j<i; j++)
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int num = in.nextInt();
        pattern(num);
        in.close();
    }
}
