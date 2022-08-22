package com.shape;

import java.util.Scanner;

public class a112Nested_Try_Catch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [] marks = new int[3];
        marks[0] = 9;
        marks[1] = 25;
        marks[2] = 34;
        System.out.print("Enter the index: ");
        int index = in.nextInt();
        try {
            System.out.println(marks[2]);
            try {
                System.out.println(marks[index]);
            }
            catch(ArrayIndexOutOfBoundsException e)
            {
                System.out.println("Index does not exist");
                System.out.println("Exception in level 2");
            }
        }
        catch(Exception e)
        {
            System.out.println("Exception in Level 1");
        }
    }
}
