package com.company;

interface camera
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
interface wifi
{
    String[] get_network();
    void connect_to_network(String network);
}
class MyCellPhone
{
    //int number;
    void call_number()
    {
        System.out.println("Calling...");
    }
    void pick_call()
    {
        System.out.println("Connecting...");
    }
}
class MySmartPhone extends MyCellPhone implements wifi,camera
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
    public String[] get_network()
    {
        System.out.println("Getting list of Networks:");
        return new String[]{"Iphone", "POCO X2", "Realme", "5911"};
    }
    @Override
    public void connect_to_network(String network) {
        System.out.println("Connecting to " + network);
    }
}
public class a93Default_Methods {
    public static void main(String[] args) {
        MySmartPhone phone = new MySmartPhone();
        phone.pick_call();
        phone.call_number();
        phone.take_snap();
        phone.record_Video();
        phone.record_4k_video();
        phone.connect_to_network("POCO X2");
        String [] st = phone.get_network();
        for(String i : st)
        {
            System.out.println(i);
        }
    }
}
