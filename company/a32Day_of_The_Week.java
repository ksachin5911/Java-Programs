package com.company;

import java.util.Scanner;
public class a32Day_of_The_Week {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number from 1 to 7: ");
        int day = in.nextInt();
        if(day==1)
        {
            System.out.println("Today is Sunday!");
        }
        if(day==2)
        {
            System.out.println("Today is Monday!");
        }
        if(day==3)
        {
            System.out.println("Today is Tuesday!");
        }if(day==4)
        {
            System.out.println("Today is Wednesday!");
        }if(day==5)
        {
            System.out.println("Today is Thursday!");
        }if(day==6)
        {
            System.out.println("Today is Friday!");
        }if(day==7)
        {
            System.out.println("Today is Saturday!");
        }
        in.close();
    }
}
