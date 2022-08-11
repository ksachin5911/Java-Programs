package com.company;

class My_Circle
{
    private float radius;
    float pi;
    private float area;
    private float perimeter;
    public void set_radius(float r)
    {
        radius = r;
    }
    public float get_radius()
    {
        return radius;
    }
    public float area_calc()
    {
        return radius*pi*radius;
    }
    public float peri_calc()
    {
        return 2*pi*radius;
    }
    public float get_area()
    {
        return area;
    }
    public void set_area(float d)
    {
        area = d;
    }
    public float get_perimeter()
    {
        return perimeter;
    }
    public void set_perimeter(float i)
    {
        perimeter = i;
    }
}
public class a78Get_and_Set_With_Circle {
    public static void main(String[] args) {
        My_Circle c1 = new My_Circle();
        c1.set_radius(10f);
        c1.pi = 3.14f;
        c1.set_area(314f);
        c1.set_perimeter(62.800003f);
        System.out.println(c1.get_radius());
        System.out.println("Calculated Area: " + c1.area_calc());
        System.out.println("Calculated Perimeter: " + c1.peri_calc());
        if(c1.area_calc() == c1.get_area())
        {
            System.out.println("Given area is correct");
        }
        else if(c1.area_calc() != c1.get_area())
        {
            System.out.println("Warning! Wrong area details");
        }
        if(c1.peri_calc()==c1.get_perimeter())
        {
            System.out.println("Given perimeter is correct");
        }
        else if(c1.peri_calc() != c1.get_perimeter())
        {
            System.out.println("Warning! Wrong perimeter details");
        }
    }
}
