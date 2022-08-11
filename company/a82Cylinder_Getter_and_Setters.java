package com.company;

class cylinder
{
    private float radius;
    private float height;
    cylinder(float rad,  float h)
    {
        this.radius=rad;
        this.height = h;
    }
    public float getRadius()
    {
        return radius;
    }
    public void setRadius(float r)
    {
        radius=r;
    }
    public float getHeight()
    {
        return height;
    }
    public void setHeight(float h)
    {
        height = h;
    }
    public float area()
    {
        //float pi = 3.14f;
        return (float) (2 * Math.PI * radius*(radius + height));
    }
    public float volume()
    {
        return (float) Math.PI*radius*radius*height;
    }
}
public class a82Cylinder_Getter_and_Setters {
    public static void main(String[] args) {
        cylinder cy = new cylinder(45.34f, 23.78f);
        /*
        //cy.setHeight(89.4f);
        //cy.setRadius(10.5f);
        */
        System.out.println(cy.getRadius());
        System.out.println(cy.getHeight());
        System.out.println(cy.area());
        System.out.println(cy.volume());
    }
}
