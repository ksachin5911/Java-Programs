package com.company;

import java.util.Scanner;
public class a42Sum_of_Array {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int [] marks = new int [5];
        int sum=0;
        System.out.println("Enter the elements of array: ");
        for(int i=0; i<5; i++)
        {
            System.out.print("Enter element " + (i+1) +  ": " );
            marks[i] = in.nextInt();
            sum += marks[i];
        }
        System.out.print("Sum of elements is ");
        System.out.println(sum);
        in.close();
    }
}
