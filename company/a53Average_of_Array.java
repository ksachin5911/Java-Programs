package com.company;

import java.util.Scanner;
public class a53Average_of_Array {
    public static void main(String[] args){
        Scanner S = new Scanner(System.in);
        float [] marks = new float [5];
        System.out.println("Enter the marks of students: ");
        for(int i=0; i<marks.length; i++)
        {
            
            System.out.print("Student " + (i+1) + ": ");
            marks[i] = S.nextInt();
            
        }
        float sum = 0;
        for(float element : marks)
        {
            System.out.println(element);
            sum += element;
            
        }
        System.out.print("Average Marks = ");
        System.out.println((sum/(marks.length)));
        S.close();
    }
}
    
