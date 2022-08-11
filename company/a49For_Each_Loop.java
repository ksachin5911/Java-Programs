package com.company;

public class a49For_Each_Loop {
    public static void main(String[] args){
        int [] marks = new int[7];
        marks[0] = 4;
        marks[1]= 5;
        marks[2]=67;
        marks[3]=44;
        marks[4]=78;
        marks[5]=23;
        marks[6]=6222;
        for(int element: marks)
        {
            System.out.println(element);
        } 
    }  
}
