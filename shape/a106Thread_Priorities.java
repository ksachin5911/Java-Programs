package com.shape;
class MyThread2 extends Thread
{
    MyThread2(String name)
    {
        super(name);
    }
    public void run()
    {
        int i=0;
        while(i<100)
        {
            System.out.println(this.getName());//this.getname() gives the name of the
            // corresponding thread
            i++;
        }
    }
}
public class a106Thread_Priorities {
    public static void main(String[] args) {
        MyThread2 t1 = new MyThread2("Sachin1 " + "Highest");
        MyThread2 t2 = new MyThread2("Sachin2");
        MyThread2 t3 = new MyThread2("Sachin3");
        MyThread2 t4 = new MyThread2("Sachin4");
        MyThread2 t5 = new MyThread2("Sachin5");
        t1.setPriority(Thread.MAX_PRIORITY);//Max priority is 10
        t2.setPriority(Thread.MIN_PRIORITY);//Min priority is 1
        t3.setPriority(Thread.MIN_PRIORITY);
        t4.setPriority(Thread.NORM_PRIORITY);//Normal priority is 5
        t5.setPriority(Thread.NORM_PRIORITY);
        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());
        System.out.println(t3.getPriority());
        System.out.println(t4.getPriority());
        System.out.println(t5.getPriority());
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
