package com.company;

import java.util.Scanner;

public class a67Table_By_Methods {
    static void table(int n)
    {
        for(int i=1; i<=10; i++) {
            System.out.println(n +  " * " + i + " = "+ n*i);
        }
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = in.nextInt();
        System.out.println("Table of " + num + ":");
        table(num);
        in.close();
    }
}
