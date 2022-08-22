package com.shape;

public class a110Try_Catch {
    public static void main(String[] args) {
        int a=6000;
        int b = 0;
        try {
            int c = a / b;
            System.out.println(c);
        }
        catch(Exception e)
        {
            System.out.println("Failed");
            System.out.println("Reason: " + e);
        }
        System.out.println("End of Program");
    }
}
