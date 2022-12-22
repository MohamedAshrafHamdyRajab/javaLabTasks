/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.myonlineshop_2;

/**
 *
 * @author MOHAMED ASHRAF
 */
public class ChildrenBook extends Book {
 
    private static double price;
    private final int discount = 15;
    
    public ChildrenBook()
    {
        price = 0;
    }
    public ChildrenBook(double price)
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