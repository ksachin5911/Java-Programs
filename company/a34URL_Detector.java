package com.company;

import java.util.Scanner;
public class a34URL_Detector {
    public static void main(String[] args){
        Scanner S = new Scanner(System.in);
        System.out.print("Enter the url: ");
        String url = S.nextLine();
        if(url.endsWith("com"))
        {
            System.out.println("It is a Commercial Website");
        }
        if(url.endsWith("org"))
        {
            System.out.println("It is an Organizational Website");
        }
        if(url.endsWith("in"))
        {
            System.out.println("It is an Indian Website");
        }
        S.close();
    }
}
