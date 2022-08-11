package com.company;

import java.util.Scanner;
public class a59Sum_Using_Methods
{
    static int Sum(int a, int b, int c){
        return a+b+c;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the values of x,y and z: ");
        System.out.print("x: ");
        int x = in.nextInt();
        System.out.print("y: ");
        int y = in.nextInt();
        System.out.print("z: ");
        int z = in.nextInt();
        System.out.println("Sum of x, y and z is " + Sum(x,y,z));
        in.close();
    }
}