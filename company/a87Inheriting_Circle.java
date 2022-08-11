package com.company;

class circle3
{
    public float radius;
    public float get_rad()
    {
        return radius;
    }
    public void set_rad(float radius)
    {
        this.radius = radius;
    }
}
class cylinder2 extends circle3
{
    float height;
    public float vol_calc()
    {
        return (float) Math.PI*radius*radius*height;
    }
    public float getHeight()
    {
        return height;
    }
    public void setHeight(float height)
    {
        this.height = height;
    }
}
public class a87Inheriting_Circle {
    public static void main(String[] args) {
        //circle3 c = new circle3();
        cylinder2 cy = new cylinder2();
        cy.set_rad(6.5f);
        cy.setHeight(10f);
        System.out.println(cy.get_rad());
        System.out.println(cy.getHeight());
        System.out.println(cy.vol_calc());
    }
}
