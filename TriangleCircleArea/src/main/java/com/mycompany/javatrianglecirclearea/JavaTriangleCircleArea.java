// this project to get the area of the triangle or the circle and the user make the decision 
package com.mycompany.javatrianglecirclearea;
import java.util.Scanner;

public class JavaTriangleCircleArea {
    
//    methode to compute circumference of triangle
    public static double triangleCircumference()
    {
        int userLength1 , userLength2 , userLength3;
        Scanner input = new Scanner(System.in);
        System.out.println("please enter the first length of the triangle");
        userLength1 = input.nextInt();
        System.out.println("please enter the second length of the triangle");
        userLength2 = input.nextInt();
        System.out.println("please enter the third length of the triangle");
        userLength3 = input.nextInt();
        Triangle triangle = new Triangle();
        double circumference = triangle.getTriangleCircumference(userLength1,userLength2,userLength3);
        return circumference;
    }
    
//    methode to compute area of triangle
    public static double triangleArea()
    {
        int baseLength , height;
        Scanner input = new Scanner(System.in);
        System.out.println("please enter the base length of the triangle");
        baseLength = input.nextInt();
        System.out.println("please enter the height of the triangle");
        height = input.nextInt();
        Triangle triangle = new Triangle();
        double area = triangle.getTriangleArea(baseLength, height);
        return area;
    }
    
//    methode to compute circumference of circle
    public static double circleCircumference()
    {
        int radius;
        Scanner input = new Scanner(System.in);
        System.out.println("please enter the radius of the circle");
        radius = input.nextInt();
        Circle circle = new Circle();
        double circumference = circle.getCircleCircumference(radius);
        return circumference;
    }
    
//    methode to compute area of circle
    public static double circleArea()
    {
        int radius;
        Scanner input = new Scanner(System.in);
        System.out.println("please enter the radius of the circle");
        radius = input.nextInt();
        Circle circle = new Circle();
        double area = circle.getCircleArea(radius);
        return area;
    }
    
//    methode to handle the output 
    public static void Choice()
    {
        int i = 0 , choice1 , choice2 ;
        while(i < 1)
        {
            System.out.println("for triangle press 1 , for circle press 2");
            Scanner input = new Scanner(System.in);
            choice1 = input.nextInt();
            switch(choice1)
            {
//                this case to calculate all about the triangle
                case 1 ->
                {
                    System.out.println("for triangle circumference press 1 , for triangle area press 2");
                    choice2 = input.nextInt();
//                    this case to calculate circumference of the triangle
                    if(choice2 == 1)
                        System.out.println("the circumference of the triangle = " + triangleCircumference());
                    else if(choice2 == 2)
//                    this case to calculate the area of the triangel
                        System.out.println("the area of the triangle = " + triangleArea());
                    break;
                }
//                this case to calculate all about the circle
                case 2 ->
                {
                    System.out.println("for circle circumference press 1 , for circle area press 2");
                    choice2 = input.nextInt();
//                    this case to calculate circumference of the circle
                    if(choice2 == 1)
                        System.out.println("the circumference of the circle = " + circleCircumference());
//                    this case to calculate the area of the circle 
                    else if(choice2 == 2)
                        System.out.println("the area of the circle = " + circleArea());
                    break;
                }                    
            }
        }
    }
    
    public static void main(String[] args) 
    {
        Choice();
    }
}
