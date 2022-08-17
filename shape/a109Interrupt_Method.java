package com.shape;
class NewThread extends Thread
{
    @Override
    public void run() {
        int i = 0;
        while (i<1000)
        {
            System.out.println("Coding");
            /*
                //try {
                    Thread.sleep(10);
                }
                catch (InterruptedException e) {
                e.printStackTrace();
                }
             */
            i++;
        }
    }
}
class NewThread2 extends Thread
{
    @Override
    public void run() {
        int i=0;
        while(i<1000)
        {
            System.out.println("Programmer");
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            i++;
        }
    }
}
public class a109Interrupt_Method {
    public static void main(String[] args) {
        NewThread n = new NewThread();
        NewThread2 nn = new NewThread2();
        System.out.println(Thread.currentThread().getState());
        n.start();
        System.out.println(n.getState());//This method gives the state of the thread, whether it
                                    //is running,new, waiting or anything else
        System.out.println(nn.getState());
        //nn.start();


    }
}
