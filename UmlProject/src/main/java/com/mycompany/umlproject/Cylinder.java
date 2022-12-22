/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.umlproject;

/**
 *
 * @author MOHAMED ASHRAF
 */
public class Cylinder extends Circle {
    
    private double height = 1.0 ;
    
    public Cylinder(){}
    public Cylinder(double height)
    {
        this.height = height;
    }
    public Cylinder(double height , double radius)
    {
        this.height = height;
        this.radius = radius;
    }
    public Cylinder (double height , double radius , String color)
    {
        this.height = height;
        this.radius = radius;
        this.color = color;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }
    
    @Override
    public String toString()
    {
        return "the height = " + this.height + " and the radius = " + this.radius + " and the color is : " + this.color;
    }
    
    public double getVolume()
    {
        return (3.14*(radius*radius)*height);
    }
}
