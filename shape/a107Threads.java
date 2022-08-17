package com.shape;
class Threading extends Thread
{
    public void run()
    {
        while(true)
        {
            System.out.println("Good Morning");
        }
    }
}
class Threading2 extends Thread
{
    public void run()
    {
        while(true)
        {
            System.out.println("Welcome");
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
public class a107Threads {
    public static void main(String[] args) {
        Threading t1 = new Threading();
        Threading2 t2 = new Threading2();
        t1.start();
        t2.start();
    }
}
