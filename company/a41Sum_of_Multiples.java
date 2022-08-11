package com.company;

public class a41Sum_of_Multiples {
    public static void main(String[] args){
        int n = 8, sum=0;
        for(int i=1; i<=10; i++)
        {
            int mul = n*i;
            sum += mul;
            System.out.println(mul);
        }
        System.out.printf("\n");
        System.out.print("Sum = ");
        System.out.println(sum);
    }
}
