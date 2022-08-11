package com.company;

public class a55Finding_Max_In_Array {
    public static void main(String[] args){
        int [] arr = {23,67,86,-99,-199,-1222,44};
        int max = Integer.MIN_VALUE;
        for(int e : arr)
        {
            if(e>max)
            {
                max=e;
            }
        }
        System.out.print("Maximum element = ");
        System.out.println(max);
    }
}
