package com.company;

import java.util.Scanner;
public class a33Leap_Year {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a year: ");
        long year = in.nextLong();
        if(year%4==0)
        {
            if(year%400==0 || year%100 !=0 )
        {
            System.out.println("It is a Leap Year");
        }
        else{
            System.out.println("It is not a Leap year");
            }
        }
        else
        {
            System.out.println("It is not a Leap Year");
        }
        in.close();
    }
}
