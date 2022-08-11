package com.company;

import java.util.Scanner;
public class a36Sum_of_First_n_Num {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int num = in.nextInt();
        int sum=0;
        for(int i=1; i<=num ;i++)
        {
            sum +=i;
        }
        System.out.printf("The sum of first %d natural numbers is %d",num, sum);
        in.close();
    }
}
