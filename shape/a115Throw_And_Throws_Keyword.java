package com.shape;
class NegException extends Exception
{
    @Override
    public String toString()
    {
        return "Radius cannot be negative";
    }
}
public class a115Throw_And_Throws_Keyword {
    static int divide(int a, int b) throws ArithmeticException
    {
        return a/b;
    }
    public static double area(int r) throws NegException
    {
        if(r<0)
        {
            throw new NegException();
        }
        return Math.PI*r*r;
    }
    public static void main(String[] args) {
        try {
            int c = divide(4,0);
            System.out.println(c);
        }
        catch(Exception e)
        {
            System.out.println("Exception: " + e);
        }
        try {
            double res = area(5);
            System.out.println(res);
        }
        catch(Exception e2)
        {
            System.out.println("Exception: " + e2);
        }
    }
}
