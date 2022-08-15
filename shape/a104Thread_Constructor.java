package com.shape;
class MyThread extends Thread
{
    MyThread(String name)
    {
        super(name);
    }
    public void run()
    {
        int i = 0;
        while (i<5)
        {
            System.out.println("Thread");
            i++;
        }
    }
}
public class a104Thread_Constructor {
    public static void main(String[] args) {
        MyThread th = new MyThread("Sachin");
        MyThread th2 = new MyThread("Killer");
        th.start();
        th2.start();
        System.out.println("ID of this thread is " + th.getId());
        System.out.println("Name of this thread is " + th.getName());
        System.out.println("ID of this thread is " + th2.getId());
        System.out.println("Name of this thread is " + th2.getName());
    }
}
