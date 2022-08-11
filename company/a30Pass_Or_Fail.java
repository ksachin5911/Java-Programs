package com.company;

import java.util.Scanner;
public class a30Pass_Or_Fail {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        {
            System.out.print("Enter marks of Maths: ");
            float maths = in.nextFloat();
            System.out.print("Enter marks of OOPS: ");
            float oops = in.nextFloat();
            System.out.print("Enter marks of Discrete: ");
            float discrete = in.nextFloat();
            float percentage = ((maths+oops+discrete)/300)*100;
            System.out.print("Your percentage is ");
            System.out.println((percentage));
            if(maths<33 || oops<33|| discrete<33 ||percentage<40)
            {
                System.out.println("You are Fail...Essential Repeat!");
            }
            else 
            {
                System.out.println("You are Pass...Good Luck For Future");
            }
            in.close();
        }
    }
}
