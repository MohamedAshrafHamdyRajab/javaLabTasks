// this project to get the ASCII code for characters or to get the character from the ASCII code and the user make the decition
package com.mycompany.javaasciiproject;
import java.util.Scanner;

public class JavaASCIIProject {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Scanner input = new Scanner(System.in);       
        int work = 1;
        do
        {
            System.out.println("Are you want to know ASCII enter 1 , want to know Character enter 2");
            int choice = input.nextInt();
            switch (choice) {
//                this case to get the ASCII code 
                case 1 -> 
                {
                    System.out.println("please enter a character");
                    char character1 = input.next().charAt(0);
                    int ASCII1 = (int) character1;
                    System.out.println("the ASCII code of " + character1 + " is " + ASCII1);
                    System.out.println("#########################");
                }
//                this case to get the Character
                case 2 -> 
                {
                    System.out.println("please enter the ASCII code");
                    int ASCII2 = input.nextInt();
                    char character2 = (char) ASCII2;
                    System.out.println("the character of " + ASCII2 + " is " + character2);
                    System.out.println("#########################");
                }
                default -> System.out.println("please enter a valid value, 1 or 2");
            }
        }while(work == 1);
    }
}
