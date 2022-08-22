package com.shape;
import java.util.Scanner;
public class a113Try_Catch_In_Array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [] marks = new int[3];
        marks[0] = 9;
        marks[1] = 25;
        marks[2] = 34;
        int i= 1;
        while(i<=5)
        {
            System.out.print("Enter the index: ");
            int index = in.nextInt();
            try
            {
                System.out.println(marks[index]);
                break;
            }
            catch(ArrayIndexOutOfBoundsException e)
            {
                System.out.println("Index does not exist");
                System.out.println(e);
            }
            i++;
        }
        if(i>5)
        {
            System.out.println("Error");
        }
    }
}
