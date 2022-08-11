package com.shape;
class thread1 extends Thread
{
    @Override
    public void run()
    {
        int i=0;
        while(i<10000)
        {
            System.out.println("Cooking..");
            System.out.println("Chatting");
            i++;
        }
    }
}
class thread2 extends Thread
{
    @Override
    public void run()
    {
        int i=0;
        while(i<10000)
        {
            System.out.println("Playing");
            System.out.println("Singing");
            i++;
        }
    }
}
public class a102Multithreading {
    public static void main(String[] args) {
        thread1 t = new thread1();
        thread2 tt = new thread2();
        t.start();
        tt.start();
    }
}
