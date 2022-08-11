package com.company;

public class a56Finding_Min_In_Array {
    public static void main(String[] args){
        int [] arr = {23,67,86,99,-199,1222,44};
        // int max=Integer.MIN_VALUE;
        // for(int e : arr)
        // {
        //     if(e>max)
        //     {
        //         max=e;
        //     }
        // }
        int min = Integer.MAX_VALUE;
        for(int element : arr)
        {
            if(element<min)
            {
                min=element;
            }
        }
        System.out.print("Mininum element: ");
        System.out.println(min);
    }
}
