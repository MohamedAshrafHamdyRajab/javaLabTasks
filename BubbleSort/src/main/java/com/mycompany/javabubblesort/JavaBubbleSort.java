package com.mycompany.javabubblesort;
import java.util.Scanner;

public class JavaBubbleSort {    
//    methode to input the array from the user
    static int[] arrayInput()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter the length of the array you want to sort");
        int length = input.nextInt();
        int array[] = new int[length];
        if(length <= 0)
        {
            System.out.println("please enter a valid length");
        }
        else
        {
            for(int i = 0 ; i < length ; i++)
            {
                System.out.println("enter the element number " + (i+1));
                array[i] = input.nextInt();
            }
        }
        return array;
    }
    
//    methode to sort the input array  
    static int[] arraySort(int array[] , int sort)
    {
        for(int i = 0 ; i < array.length ; i++)
        {
            for(int j = 0 ; j < array.length-1 ; j++)
            {
                switch (sort) 
                {
//                    this case to sort the array by Ascending
                    case 1 -> {
                        if(array[j] > array[j+1])
                        {
                            int temp = array[j];
                            array[j] = array[j+1];
                            array[j+1] = temp;
                        }
                    }
//                    this case to sort the array by descending
                    case 2 -> {
                        if(array[j] < array[j+1])
                        {
                            int temp = array[j];
                            array[j] = array[j+1];
                            array[j+1] = temp;
                        }
                    }
                    default -> System.out.println("please enter valid choice");
                }
            }          
        } 
        return array;
    }
    
//    methode to display the array
    static void arrayDisplay(int array[] , int sort)
    {
//        if the sort = 1 then display the sorted array by ascending
        switch (sort) 
        {
//            this case to display "the sorted array by Ascending :" to the user 
            case 1 ->                 
            {
                String sortOrder = "the sorted array by Ascending :";
                System.out.println(sortOrder);
            }
//            this case to display "the sorted array by Descending :" to the user
            case 2 ->                 
            {
                String sortOrder = "the sorted array by Descending :";
                System.out.println(sortOrder);
            }
//            else then display "the unsorted array"
            default -> System.out.println("the unsorted array :");
        }
//        this loop to display the array that have been inputed in the methode
        for(int k = 0 ; k < array.length ; k++)
        {
            System.out.print(array[k] + " ");
        }
        System.out.println("");
    }
    
//    methode to handle the program
    static void choice()
    {        
        int forever = 1;
        while(forever == 1)
        {
            Scanner input = new Scanner(System.in);
            System.out.println("if you want Ascending sort press : 1 , for Descending sort press : 2");
            int sort = input.nextInt();
//            if the sort is not one of 1 , 2 will display an error message
            if(sort == 1 || sort == 2)
            {
                int array[] = arrayInput();
                arrayDisplay(array,0);
                int sortedArray[] = arraySort(array,sort);            
                arrayDisplay(sortedArray,sort);            
            }
            else
                System.out.println("please enter a valid choice");
        }
    }
    
    public static void main(String[] args) {
        choice();
    }
}