package com.company;

import java.util.Scanner;
public class a72Cel_To_Fah {
    float cel_to_fah(float cel)
    {
        float fah;
        fah = ((1.8f)*cel)+32;
        return fah;
    }
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter value in Celsius: ");
        float c = in.nextFloat();
        a72Cel_To_Fah temp = new a72Cel_To_Fah();
        System.out.print("Temperature in Fahrenheit is: " + temp.cel_to_fah(c));
        in.close();
    }
}