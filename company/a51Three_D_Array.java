package com.company;

import java.util.Scanner;
public class a51Three_D_Array {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int [][][] dim = new int [3][2][2];
        System.out.println("Enter elements of dim:-");
        for(int i=0; i<dim.length;i++)
        {
            for(int j=0; j<dim[i].length; j++)
            {
                for(int k=0; k<dim[i][j].length;k++)
                {
                    System.out.printf("Enter elements [%d][%d][%d]: ", i,j,k);
                    //System.out.print("Enter element " + dim[i][j][k] + ": " );
                    dim[i][j][k] = in.nextInt();
                }
            }
        }
        System.out.println("Three D Array:-");
        for(int i=0; i<dim.length;i++)
        {
            for(int j=0; j<dim[i].length; j++)
            {
                for(int k=0; k<dim[i][j].length;k++)
                {
                    
                    System.out.print(dim[i][j][k]);
                    System.out.print(" ");
                }
                System.out.print("\n");
            }
            System.out.print("\n");
        }
        in.close();
    }
}
