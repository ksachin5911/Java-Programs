package com.company;

abstract class Pen
{
    abstract public void write();
    abstract public void refill();
}
class dot_pen extends Pen
{
    @Override
    public void write() {
        System.out.println("Writing...");
    }
    @Override
    public void refill() {
        System.out.println("Refilling...");
    }
    void change_nib()
    {
        System.out.println("Changing nib...");
    }
}
public class a96Abstract_Class_Pen {
    public static void main(String[] args) {
        dot_pen d1 = new dot_pen();
        d1.write();
        d1.refill();
        d1.change_nib();
    }
}
