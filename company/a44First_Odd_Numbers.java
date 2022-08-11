package com.company;

import java.util.Scanner;
public class a44First_Odd_Numbers {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n  = in.nextInt();
        for(int i = 1; i<=n;i++)
        {
            System.out.println(2*i-1);
        }
        in.close();
    }
}
