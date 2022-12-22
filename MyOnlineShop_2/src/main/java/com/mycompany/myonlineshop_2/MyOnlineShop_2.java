/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.myonlineshop_2;

import java.util.Scanner;

/**
 *
 * @author MOHAMED ASHRAF
 */
public class MyOnlineShop_2 {
    public static void totalPriceCalculation()
    {
        Scanner input = new Scanner(System.in);        
        boolean forEver = true;
        while(forEver)
        {
            System.out.println("\nplease enter the number of the books you want to buy");
            int booksNumber = input.nextInt();
            Product product[] = new Product[booksNumber];
            double totalPrice = 0;
            for(int i = 0 ; i < booksNumber ; i++)
            {
                System.out.println("please if the type of the book is normal book press : 1 , for cartoon book press : 2 , for children book press : 3");
                int bookType = input.nextInt();
                System.out.println("please enter the price of the book to calculate the total price with the discount");
                double bookPrice = input.nextDouble();
                switch(bookType)
                {
                    case 1:
                       product[i] = new Book(bookPrice);
                       totalPrice += Book.getPrice(); 
                       break;
                    case 2:
                        product[i] = new CartoonBook(bookPrice);
                        totalPrice += CartoonBook.getPrice();
                        break;
                    case 3:
                        product[i] = new ChildrenBook(bookPrice);
                        totalPrice += ChildrenBook.getPrice();
                        break;
                    default:
                        System.out.println("please enter a valid choice");
                }
            }
            System.out.println("the total price for all books = " + totalPrice);
        }
    }
    
    public static void main(String[] args) {
        totalPriceCalculation();
    }
}