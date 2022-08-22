package com.shape;

import java.util.Scanner;

public class a111Specific_Exception {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [] marks = new int[3];
        marks[0] = 3;
        marks[1] = 33;
        marks[2] = 23;
        System.out.print("Enter array index: ");
        int d = in.nextInt();
        System.out.print("From which number to be divided: ");
        int n = in.nextInt();
        try {
            System.out.println("Value at array index entered is: " + marks[d]);
            System.out.println("Result of division is: " + marks[d]/n);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Arithmetic exception occured");
            System.out.println(e);
        }
        catch(ArrayIndexOutOfBoundsException e1)
        {
            System.out.println("Array index out of bound");
            System.out.println(e1);
        }
        catch(Exception e2)
        {
            System.out.println("Some other exception");
            System.out.println(e2);
        }
    }
}
