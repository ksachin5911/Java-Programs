package com.company;

public class a64Variable_Arguments {
    static int sum(int x, int ...arr)
    {
        int result = x;
        for(int e:arr)
        {
            result += e;
        }
        return result;
    }
    public static void main(String[] args){
        System.out.println("Variable Arguments!!");
        System.out.println("Sum of 3 is: " + sum(3));
        System.out.println("Sum of 5 and 7 is " + sum(5,7));
        System.out.println("Sum of 2, 5 and 11 is " + sum(2,5,11));
        System.out.println("Sum of 6, 8, 9, and 45 is "+ sum(6,8,9,45));
        System.out.println("Sum of 23, 6, 10, 0 and 4 is "+  sum(23,6,10,0,4));

    }
}
