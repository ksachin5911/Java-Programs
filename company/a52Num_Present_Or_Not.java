package com.company;

import java.util.Scanner;
public class a52Num_Present_Or_Not {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int [] arr = {2,4,7,8,1,9};
        System.out.print("Enter the number to be checked: ");
        int n = in.nextInt();
        boolean present = false;
        for(int element : arr)
        {
            if(n==element)
            {
                present = true;
                break;
            }
        }
        if(present == true)
        {
            System.out.println("It is Present");
        }
        else
        {
            System.out.println("Not Present");
        }
        in.close();
    }
}
