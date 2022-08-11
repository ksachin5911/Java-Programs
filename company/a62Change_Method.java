package com.company;

public class a62Change_Method {
    static void change(int [] ar)
    {
        ar[2] = 786;
        ar[4] = 100;
    }
    public static void main(String[] args){
        int [] arr = {45,76,23,67,89,188};
        change(arr);
        for(int e:arr)
        {
            System.out.println(e);
        }
    }
}
