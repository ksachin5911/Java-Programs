package com.company;

import java.util.Scanner;
public class a46Arrays {
    public static void main(String[] args){
        int [] marks = new int[5];
        Scanner in = new Scanner(System.in);
        for(int i=0; i<5;i++)
        {
            System.out.printf("Enter the element %d: ", i+1);
            marks[i] = in.nextInt();
        }
        for(int i=0; i<5;i++)
        {
            System.out.println(marks[i]);
        }
        in.close();
    }
}
