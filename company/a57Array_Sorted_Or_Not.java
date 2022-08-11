package com.company;

public class a57Array_Sorted_Or_Not {
    public static void main(String[] args){
        int [] arr = {34,67,89,99,126,998,99998};
        boolean b = false;
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]> arr[i+1])
            {
                b=true;
            }
        }
        if(b==true)
        {
            System.out.println("Array is not Sorted!");
        }
        else
        {
            System.out.println("Array is Sorted!");
        }    
    }
}
