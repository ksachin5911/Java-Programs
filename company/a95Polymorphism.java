package com.company;

interface camera2
{
    void take_snap();
    void record_Video();
    private void greet()
    {
        System.out.println("Good Morning");
    }
    default void record_4k_video()
    {
        greet();
        System.out.println("Recording 4k video");
    }
}
interface wifi2
{
    void get_network();
    void connect_to_network(String network);
}
class MyCellPhone2
{
    //int number;
    void call_number(int n)
    {
        System.out.println("Calling..." + n);
    }
    void pick_call()
    {
        System.out.println("Connecting...");
    }
}
class MySmartPhone3 extends MyCellPhone2 implements wifi2,camera2
{
    @Override
    public void take_snap()
    {
        System.out.println("Taking Snap");
    }
    @Override
    public void record_Video()
    {
        System.out.println("Recording Video");
    }
    @Override
    public void get_network()
    {
        System.out.println("Getting list of Networks:");
        //return new String[]{"Iphone", "POCO X2", "Realme", "5911"};
    }
    @Override
    public void connect_to_network(String network) {
        System.out.println("Connecting to " + network);
    }
}
public class a95Polymorphism {
    public static void main(String[] args) {
        camera2 cm = new MySmartPhone3();
        MySmartPhone3 my = new MySmartPhone3();
        my.call_number(9876);
        my.pick_call();
        my.get_network();
        my.connect_to_network("Realme");
        cm.record_4k_video();
        cm.take_snap();
        cm.record_Video();
    }
}
