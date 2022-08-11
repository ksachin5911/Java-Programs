package com.company;

import java.util.Scanner;
public class a10Greet {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String Str = in.next();
        System.out.print("Hello " + Str + ", have a good day!!");
        in.close();
    }
}
