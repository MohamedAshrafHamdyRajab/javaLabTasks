// this project to get the largest cell in input array , which is can be one dimension or two dimension and the user make this decition
package com.mycompany.javalargestcell;
import java.util.Scanner;

public class JavaLargestCell {
    
//    methode to input the array from the user
    public static int[][] inputArray(int row, int col)
    {
        int array[][] = new int[row][col];
        Scanner input = new Scanner(System.in);
        for(int i = 0 ; i < row ; i++)
        {
            for(int j = 0 ; j < col ; j++)
            {
                System.out.println("please enter the cell [" + i + "]" + "[" + j + "]");
                array[i][j] = input.nextInt();
            }
        }
        return array;
    }
    
//    methode to get the bigest number in the array
    public static int biggestNumber(int arr[][])
    {
        int bigest = 0;
        for(int i = 0 ; i < arr.length ; i++)
        {
            for(int j = 0 ; j < arr[0].length ; j++)
            {
                if(arr[i][j] > bigest)
                    bigest = arr[i][j];
            }
        }
        return bigest;
    } 
    
//    methode to handle the output 
    public static void handle()
    {
        boolean forEver = true;
        while(forEver)
        {
            Scanner input = new Scanner(System.in);
            System.out.println("please enter the rows length of the array");       
            int row = input.nextInt();
            System.out.println("please enter the cols length of the array");
            int col = input.nextInt();
            int bigest = biggestNumber(inputArray(row,col));
            System.out.println("the biggest number in the array is " + bigest);       
        }
    }
    
    public static void main(String[] args) {
        handle();
    }
}
