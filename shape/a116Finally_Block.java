package com.shape;
public class a116Finally_Block {
    public static int greet()
    {
        int a = 4;
        int b = 2;
        try {
            return a/b;
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        finally {
            System.out.println("End of function");
        }
        return -1;
    }
    public static void main(String[] args) {
        System.out.println(greet());
        int x = 10;
        int y = 8;
        while(true)
        {
            try{
                System.out.println(x/y);
            }
            catch(Exception e)
            {
                System.out.println(e);
                break;
            }
            finally
            {
                System.out.println("I am Finally for y = " + y);
            }
            y--;
        }
    }
}
