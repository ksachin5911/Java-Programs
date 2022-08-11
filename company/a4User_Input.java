package com.company;

import java.util.Scanner;

public class a4User_Input {
    public static void main(String[] args)
    {
        System.out.println("Taking input from User!!");
        Scanner Sc = new Scanner(System.in);
            System.out.println("Enter a number");
            int a = Sc.nextInt();
            System.out.println("Enter another number");
            int b = Sc.nextInt();
            int mul = a*b;
            System.out.print("The product of the numbers is: ");
            System.out.println(mul);
            Sc.close();
    }
}
