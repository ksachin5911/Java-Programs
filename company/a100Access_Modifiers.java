package com.company;
class C1
{
    public int x = 5;
    protected int y = 4;
    int z = 6;
    private final int a = 2;
    public void method()
    {
        System.out.println(x + y + z + a);
    }
}
class C2 extends C1
{
    void method1()
    {
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        //System.out.println(a);
    }
}
public class a100Access_Modifiers {
    public static void main(String[] args) {

        C1 c = new C1();
        c.method();
        System.out.println(c.x);
        System.out.println(c.y);
        System.out.println(c.z);

        C2 cc = new C2();
        cc.method1();
        //System.out.println(c.a); --> cannot run as a is private

    }
}
