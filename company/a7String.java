package com.company;

import java.util.Scanner;
public class a7String {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String str1 = s.next(); // Prints only the first word of the line
        String str2 = s.nextLine(); //Prints whole line
        System.out.println(str1);
        System.out.println(str2);
        s.close(); 
    }
}
