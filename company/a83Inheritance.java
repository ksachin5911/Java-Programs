package com.company;

class base
{
    int x;
    public int getX()
    {
        return x;
    }
    public void setX(int i)
    {
        this.x = i;
    }
    public void print()
    {
        System.out.println("Im performing inheritance!");
    }
}
class derived extends base //use extend keyword to declare subclass from super class
{
    int y;
    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
public class a83Inheritance {
    public static void main(String[] args) {
        base b = new base();
        b.setX(78);
        b.print();
        System.out.println(b.getX());

        derived d = new derived();
        d.setY(99);
        d.setX(33);
        System.out.println(d.getX());
        System.out.println(d.getY());
    }
}
