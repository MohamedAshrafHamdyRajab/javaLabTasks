/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.myonlineshop;

/**
 *
 * @author MOHAMED ASHRAF
 */
public class Book extends Product {
    
    private static double price ;
    private final int discount = 5;

    public Book()
    {
        price = 0;
    }
    public Book(double price)
    {
        this.price = totalPriceCalculate(price);
    }
    
    public void setPrice(double price) {
        this.price = price;
    }

    public static double getPrice() {
        return price;
    }
    
    @Override
    public double totalPriceCalculate(double defaultPrice)
    {
        return defaultPrice - discount;
    }
}