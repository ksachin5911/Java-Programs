package com.company;

import java.util.Scanner;

public class a5Percentage {
    public static void main(String[] args){
        Scanner S = new Scanner(System.in);
            System.out.println("Enter marks: ");
            float maths = S.nextFloat();
            float phy = S.nextFloat();
            float eng = S.nextFloat();
            float oops = S.nextFloat();
            float chem = S.nextFloat();
            float percentage = ((maths+phy+eng+oops+chem)/500)*100;
            System.out.print("Percentage = ");
            System.out.println(percentage);
            S.close();//It closes the scanner class
    }
}
