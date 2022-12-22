/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.myonlineshop;

/**
 *
 * @author MOHAMED ASHRAF
 */
public class CartoonBook extends Book {
    
    private static double price;
    private final int discount = 10;
    
    public CartoonBook()
    {
        price = 0;
    }
    public CartoonBook(double price)
    {
        this.price = totalPriceCalculate(price);
    }
    
    public static double getPrice()
    {
        return price;
    }
            
    @Override
    public double totalPriceCalculate(double defaultPrice)
    {
        return defaultPrice - discount;
    }
}