package com.company;

import java.util.Scanner;
public class a37Multiplication_Table {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter value of n: ");
        int n = s.nextInt();
        for(int i=1; i<=10;i++ )
        {
            int pro = n*i;
            System.out.println(n + "*" + i + "=" + pro);
        }
        s.close();
    }
}
