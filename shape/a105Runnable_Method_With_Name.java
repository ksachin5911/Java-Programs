package com.shape;
class RunThread implements Runnable
{
    public void run()
    {
        int i = 0;
        while (i<5) {
            System.out.println("Thread");
            i++;
        }
    }
}
public class a105Runnable_Method_With_Name{
    public static void main(String[] args) {
        RunThread R = new RunThread();
        Thread t1 = new Thread(R,"Mixsingh");
        RunThread R2 = new RunThread();
        Thread t2 = new Thread(R2,"Byg Byrd");
        t1.start();
        t2.start();
        System.out.println("Name of t1 thread is " + t1.getName());
        System.out.println("ID of t1 thread is " + t1.getId());
        System.out.println("Name of t2 thread is " + t2.getName());
        System.out.println("ID of t2 thread is " + t2.getId());
    }
}