package com.shape;
class Threading1 extends Thread
{
    @Override
    public void run()
    {
        int i=0;
        while(i<100)
        {
            System.out.println("Threading in java");
            i++;
        }
    }
}
class Threading3 extends Thread
{
    @Override
    public void run()
    {
        int i=0;
        while(i<100)
        {
            System.out.println("Sachin");
            i++;
        }
    }
}
public class a108Join_Method {
    public static void main(String[] args) throws InterruptedException {
        Threading1 tt = new Threading1();
        Threading3 ttt = new Threading3();
        tt.start();
        try
        {
            tt.join();//join method runs a particular thread fully and then starts another
                        //thread.
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        ttt.start();

    }
}
