package com.company;

interface Basic_Animal
{
    void eat();
    void sleep();
}
class Monkey
{
    public void jump()
    {
        System.out.println("Jump");
    }
    public void bite()
    {
        System.out.println("Bite");
    }
}
class human extends Monkey implements Basic_Animal
{
    void speak()
    {
        System.out.println("Speaking");
    }
    @Override
    public void eat()
    {
        System.out.println("Eating");
    }
    @Override
    public void sleep()
    {
        System.out.println("Sleeping");
    }
}
public class a97Inheritance2 {
    public static void main(String[] args) {
        human h = new human();
        Monkey m = new human();
        Basic_Animal lion = new human();
        h.jump();
        h.bite();
        h.eat();
        m.bite();
        h.sleep();
        h.speak();
        lion.eat();
        lion.sleep();
    }
}
