package com.company;

import java.util.Scanner;
public class a31Income_tax {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the income of employee: ");
        float income = in.nextFloat();
        if(income>=250000 && income<500000)
        {
            
            float tax = ((0.05f)*income);
            
            System.out.print("Income Tax to be paid is ");
            System.out.println(tax);
        }
        else if(income>=500000 && income<1000000)
        {
            System.out.print("Income Tax to be paid is ");
             float tax1 = (0.2f)*income;
            System.out.println(tax1);
        }
        else if(income>=1000000)
        {
            System.out.print("Income Tax to be paid is ");
             float tax2 = (0.3f)*income;
            System.out.println(tax2);
        }
        else if(income<250000)
        {
            System.out.println("No Income Tax for You!!");
        }
        in.close();
    }
    
}
