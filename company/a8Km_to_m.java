package com.company;

import java.util.Scanner;
public class a8Km_to_m {
    public static void main(String[] args)
    {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter the value in kilometres: ");
        float value = Sc.nextFloat();
        float cnvrt = value*1000;
        System.out.print("The value in metres is ");
        System.out.println(cnvrt);
        Sc.close();
    }
}
