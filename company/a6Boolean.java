package com.company;

import java.util.Scanner;
public class a6Boolean {
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        boolean b1 = in.hasNextInt();
        System.out.println(b1);
        in.close();   
    }
}
