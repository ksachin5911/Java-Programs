package com.shape;
import java.util.Scanner;
class MyException extends Exception
{
    @Override
    public String toString()
    {
        return "Im toString";
    }
    @Override
    public String getMessage()
    {
        return "I am getMessage";
    }
}
public class a114Exception_Class {
    public static void main(String[] args) {
        int a;
        Scanner in = new Scanner(System.in);
        a = in.nextInt();
        if(a<99)
        {
            try
            {
                throw new MyException();
            }
            catch (Exception e)
            {
                System.out.println(e.getMessage());
                System.out.println(e);//it prints to string method.
                e.printStackTrace();
                System.out.println("It Worked");
            }
        }
        else {
            System.out.println(a + " is greater than 99");
        }
    }
}
