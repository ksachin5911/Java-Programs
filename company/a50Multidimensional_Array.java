package com.company;

public class a50Multidimensional_Array {
    public static void main(String[] args){
        int [][] multi;
        multi = new int [2][3];
        multi [0][0] = 12;
        multi [0][1] = 15;
        multi [0][2] = 17;
        multi [1][0] = 69;
        multi [1][1] = 77;
        multi [1][2] = 100;

        for(int i=0; i<multi.length; i++)
        {
            for(int j=0; j<multi[i].length; j++)
            {
                System.out.print(multi[i][j]);
                System.out.print(" ");
            }
            System.out.println("\n");
        }
    }
}
