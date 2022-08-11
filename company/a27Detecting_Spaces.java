package com.company;

public class a27Detecting_Spaces {
    public static void main(String[] args){
        String moose = "Tupac  naal  mildi  aa   Raashi  mithiyya";
        System.out.println(moose.indexOf("  "));
        System.out.println(moose.indexOf("   "));
        System.out.println(moose.indexOf("    "));
    }
}
