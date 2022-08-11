package com.shape;
import java.util.*;
class rectangle
{
    float l;
    float b;
    public float getL()
    {
        return l;
    }
    public void setL(float l)
    {
        this.l = l;
    }
    public float getB()
    {
        return b;
    }
    public void setB(float b)
    {
        this.b = b;
    }
    public float area()
    {
        return l*b;
    }
    public float perimeter()
    {
        return 2*(l+b);
    }
}
class square
{
    float side;
    public float area(float side)
    {
        this.side = side;
        return side*side;
    }
    public float perimeter()
    {
        return 4*side;
    }
    public float getSide()
    {
        return side;
    }
}
class circle
{
    float radius;
    public float getRadius()
    {
        return radius;
    }
    public float area()
    {
        return (float)Math.PI*radius*radius;
    }
    public float circumference()
    {
        return (float)(2*Math.PI*radius);
    }
}
class sphere extends circle
{
    public float getRadius(float R)
    {
        this.radius = R;
        return radius;
    }
    @Override
    public float area()
    {
        return (float) (4* Math.PI*radius*radius);
    }
    @Override
    public float circumference() {
        return super.circumference()*radius;
    }
}
public class a101Packages {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        rectangle r = new rectangle();
        square s = new square();
        circle c = new circle();
        sphere p = new sphere();
        System.out.print("Enter length of rectangle: ");
        r.l = in.nextFloat();
        r.setL(r.l);
        System.out.print("Enter breadth of rectangle: ");
        r.b = in.nextFloat();
        r.setB(r.b);
        System.out.println("Dimensions of rectangle: ");
        System.out.println("Length: " + r.getL());
        System.out.println("Breadth: " + r.getB());
        System.out.println("Area = " + r.area());
        System.out.println("Perimeter = " + r.perimeter());
        System.out.print("Enter side of square: ");
        s.side = in.nextFloat();
        System.out.println("Dimensions of square: ");
        System.out.println("Side: " + s.getSide());
        System.out.println("Area = " + s.area(s.side));
        System.out.println("Perimeter = " + s.perimeter());
        System.out.print("Enter radius of circle: ");
        c.radius = in.nextFloat();
        System.out.println("Dimensions of circle: ");
        System.out.println("Radius: " + c.getRadius());
        System.out.println("Area = " + c.area());
        System.out.println("Circumference = " + c.circumference());
        System.out.print("Enter radius of sphere: ");
        p.radius = in.nextFloat();
        System.out.println("Dimensions of sphere: ");
        System.out.println("Radius: " + p.getRadius(p.radius));
        System.out.println("Area = " + p.area());
        System.out.println("Circumference = " + p.circumference());
        in.close();
    }
}
