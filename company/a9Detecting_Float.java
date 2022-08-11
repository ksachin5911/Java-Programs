package com.company;//Program to detect whether entered number is floating point number or not
import java.util.Scanner;
public class a9Detecting_Float {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Enter a number");
        boolean b1 = a.hasNextFloat();
        System.out.println(b1);
        a.close();
    }
}
