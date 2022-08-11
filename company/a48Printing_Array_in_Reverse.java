package com.company;

public class a48Printing_Array_in_Reverse {
    public static void main(String[] args){
        int [] num = {3,5,6,22,56,77,567,4};
        for(int i=num.length; i>0; i--)
        {
            System.out.println(num[i-1]);
        }
    }
}
