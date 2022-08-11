package com.company;

import java.util.Scanner;
public class a13Comparison_Operator {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer:");
        int num = input.nextInt();
        boolean b = num<50;
        System.out.println(b);
        input.close();
    }
}
