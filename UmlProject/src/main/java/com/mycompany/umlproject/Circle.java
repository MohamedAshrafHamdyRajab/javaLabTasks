/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.umlproject;

/**
 *
 * @author MOHAMED ASHRAF
 */
public class Circle {
    
    protected double radius = 1.0;
    protected String color = "red";
    
    public Circle(){}
    public Circle(double radius)
    {
        this.radius = radius;
    }
    public Circle(double radius , String color)
    {
        this.radius = radius;
        this.color = color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }
    public String getColor() {
        return color;
    }
    
    @Override
    public String toString()
    {
        return "the radius = " + this.radius + " and the color is : " + this.color;
    }
    
    public double getArea()
    {
        return (3.14*(radius*radius));
    }
}
