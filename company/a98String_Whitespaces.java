package com.company;

import java.util.Scanner;

public class a98String_Whitespaces {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String s1=sc.next();
        int x=sc.nextInt();
        String s2=sc.next();
        int y=sc.nextInt();
        String s3=sc.next();
        int z=sc.nextInt();
        String st1 = String.format("%03d", x);
        String st2 = String.format("%03d", y);
        String st3 = String.format("%03d", z);


        System.out.println("================================");
        System.out.printf("%-15s %s\n", s1, st1);
        System.out.printf("%-15s %s\n", s2, st2);
        System.out.printf("%-15s %s\n", s3, st3);
        System.out.println("================================");

    }
}

