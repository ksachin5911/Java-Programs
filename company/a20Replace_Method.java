package com.company;

public class a20Replace_Method {
    public static void main(String[] args){
        String s = "Possessive";
        System.out.println(s);
        //Replacing only one character
        System.out.println(s.replace('s', 'i'));
        System.out.println(s);
        //Replacing a piece of string
        System.out.println(s.replace("ive", "ion"));
    }
}
