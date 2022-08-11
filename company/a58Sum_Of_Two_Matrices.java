package com.company;

public class a58Sum_Of_Two_Matrices {
    public static void main(String[] args){
        int [][] op1 = {{2,5,7},
                        {6,8,5}};
        int [][] op2 = {{3,7,2},
                        {6,9,2}};
        int[][] add = {{0,0,0},{0,0,0}};

        for(int i = 0; i<op1.length;i++)
        {
            for(int j=0; j<op1[i].length;j++)
            {
                add[i][j] = op1[i][j] + op2[i][j];
            }
        }
        for(int i = 0; i<op1.length;i++)
        {
            for(int j=0; j<op1[i].length;j++)
            {
                add[i][j] = op1[i][j] + op2[i][j];
                System.out.print(add[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}
