package com.company;

//An abstract class contains atleast one abstract method but in interfaces every method
// is abstract.
interface bicycle
{
    final int i = 6;
    void apply_brake(int decrement);//interface is a group of methods with empty bodies
    void speed_up(int increment);
    //both methods need to be implemented in the class bmx
}
interface horn_bicycle
{
    void blowHornPoo();
    void blowHornPurr();
}
class bmx implements bicycle, horn_bicycle
{
    public void apply_brake(int decrement)
    {
        System.out.println("Applying brakes!");
    }
    public void speed_up(int increment)
    {
        System.out.println("Speeding up!");
    }
    public void blowHornPoo()
    {
        System.out.println("Blow poo pee poo");
    }
    public void blowHornPurr()
    {
        System.out.println("Blow horn purr purr");
    }
}
public class a92Interfaces
{
    public static void main(String[] args) {
        bmx b = new bmx();
        b.apply_brake(4);
        b.speed_up(10);
        System.out.println(b.i);
        b.blowHornPoo();
        b.blowHornPurr();
    }
}