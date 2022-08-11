package com.company;

public class a15Printing_in_Java {
    public static void main(String[] args){
        System.out.println("I m Sachin");//Prints a new line too
        System.out.print("Hello ");//Doesn't print a new line
        System.out.println("I m Good");

        int a = 5;
        float f = 7.835f;
        char ch = 't';
        //Method used in C language
        System.out.printf("Value of a, b and c is %d, %.2f and %c respectively", a,f,ch);
        //printf and format both can be used
        // %c, %d, etc. are called format specifiers
    }
}
