package com.company;

public class a54Reversing_An_Array {
    public static void main(String[] args){
        int [] array = {45,34,88,99,100};
        for(int i=0; i<array.length/2; i++)
        {
            int temp;    
            temp = array[i]; 
            array[i] = array[array.length-i-1];
            array[array.length-i-1] = temp;
        }
        for(int element : array)
        {
            System.out.print(element + "\t");
        }   
    }
}