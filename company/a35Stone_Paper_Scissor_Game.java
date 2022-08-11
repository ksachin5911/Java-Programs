package com.company;

import java.util.Scanner;
public class a35Stone_Paper_Scissor_Game {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(true){
            System.out.println("Enter \"y\" to play the game and \"n\" to" + 
                                    " quit the game");
            char ask = in.next().charAt(0);
            if(ask=='n'){
                break;
            }
            else{

            }

            int n = (int)(Math.random()*300);
            System.out.print("Enter your choice from Stone(1), Paper(2) or Scissor(3):  ");
            int choice = in.nextInt();
        
            if(n>=0 && n<100){
                int comp = 1;
                System.out.print("Computer chose: ");
                System.out.println(comp);
                if(choice==comp){
                    System.out.println("Match Tie!!");
                }
                else if(choice ==2)
                {
                    System.out.println("Computer Wins!!");
                }
                else if(choice==3)
                {
                    System.out.println("Computer Wins!!");
                }
            }
            else if(n>=100 && n<200){
                int comp1 = 2;
                System.out.print("Computer chose: ");
                System.out.println(comp1);
                if(choice==comp1){
                    System.out.println("Match Tie!!");
                }
                else if(choice ==1)
                {
                    System.out.println("I Won!!");
                }
                else if(choice==3)
                {
                    System.out.println("I Won!!");
                }
            }
            else if(n>=200 && n<300){
                int comp3 = 3;
                System.out.print("Computer chose: ");
                System.out.println(comp3);
                if(choice==comp3){
                    System.out.println("Match Tie!!");
                }
                else if(choice ==1)
                {
                    System.out.println("I Won!!");
                }
                else if(choice==2)
                {
                    System.out.println("Computer Wins!!");
                }
            }   
            
                 
        }    
        in.close();          
    }
}
