package com.company;

import java.util.Scanner;
public class a60Average_Using_Methods {
    float avg(float x, float y, float z)//Another way of defining a method
    {
        float sum  = x+y+z;
        float result;
        result = sum/3;
        return result;

    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the marks of three students: ");
        float a = in.nextFloat();
        float b = in.nextFloat();
        float c = in.nextFloat(); 
        a60Average_Using_Methods obj = new a60Average_Using_Methods();//creating object of class
        System.out.println("Average marks = " + obj.avg(a,b,c));
        in.close();
    }
}
