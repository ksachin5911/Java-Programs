package com.company;

import java.util.Scanner;

public class a28If_Else_Statements {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the age: ");
        int age = in.nextInt();
        if(age>=18  && age <= 70)
        {
            System.out.println("You can drive!");
        }
        else if(age<18)
        {
            System.out.println("You can't drive!");
        }
        else
        {
            System.out.println("You are too old to drive!");
        }
        in.close();
    }
}
