package com.company;

import java.util.Scanner;

class Game
{
    int rand;
    int num;
    Game() //Constructor - it generates a random number
    {
        rand=(int) (Math.random()*100);
    }
    public void get_num()//Method to take user input
    {
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Enter a number between 0 and 100: ");
            num = in.nextInt();
            //in.close();
        }
    }
    public void game_player() //Method to play the game
    {
        int nguesses=1;
        do
        {
            //System.out.println(rand);
            get_num();
            
            if(num>rand)
            {
                System.out.println("Lower number please!");
            }
            else if(num<rand)
            {
                System.out.println("Higher number please!");
            }
            else
            {
                System.out.println("You guessed the number in " + nguesses + " times!");
                break;
            }
            nguesses++;
        }while(nguesses!=num);
    }
}
public class a81Number_Guessing_Game
{
    public static void main(String[] args) {
        Game g1  = new Game();
        g1.game_player();
    }
}