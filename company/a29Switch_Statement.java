package com.company;

import java.util.Scanner;

public class a29Switch_Statement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Area Menu:- \n1. Circle\n2. Triangle\n3. Rectangle");
        System.out.print("Enter your choice: ");
        int choice = input.nextInt();
        switch (choice) {
            case 1:
                float pi = 3.14f;
                System.out.print("Enter radius: ");
                float rad = input.nextFloat();
                float Area = pi * rad * rad;
                System.out.printf("Area = %.2f", Area);
                break;

            case 2:
                float a = 0.5f;
                System.out.print("Enter base:  ");
                float base = input.nextFloat();
                System.out.print("Enter height: ");
                float height = input.nextFloat();
                float Area2 = a * base * height;
                System.out.printf("Area = %.2f", Area2);
                break;

            case 3:
                System.out.print("Enter length: ");
                float len = input.nextFloat();
                System.out.print("Enter breadth: ");
                float br = input.nextFloat();
                float Area3 = len * br;
                System.out.printf("Area = %.2f", Area3);
                break;

            default:
                System.out.println("Invalid Choice!!");
                break;
        }
        input.close();

    }
}
