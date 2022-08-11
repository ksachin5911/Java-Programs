package com.company;

import java.util.Scanner;
public class a38Reverse_Table {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = in.nextInt();
        int i=10;
        while(i>=1)
        {
            System.out.println(n+"*"+i+"="+n*i);
            i--;
        }
        in.close();
    }
}
