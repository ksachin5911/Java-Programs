package com.company;

interface sample
{
    void meth1();
    void meth2();
}
interface child_sample extends sample
{
    void meth3();
    void meth4();
}
class myclass_sample implements child_sample
{
    public void meth3()
    {
        System.out.println("meth3");
    }
    public void meth4()
    {
        System.out.println("meth4");
    }
    public void meth1()
    {
        System.out.println("meth1");
    }
    public void meth2()
    {
        System.out.println("meth2");
    }
}
public class a94Inheritance_In_Interfaces {
    public static void main(String[] args) {
        myclass_sample cl = new myclass_sample();
        cl.meth1();
        cl.meth2();
        cl.meth3();
        cl.meth4();
    }
}