// this project to get the transpose of the array from the input array by user
package com.mycompany.javaarraytranspose;
import java.util.Scanner;

public class JavaArrayTranspose {
    
//    methode to get the array from the user
    public static int[][] inputArray(int rows, int cols)
    {
        Scanner input = new Scanner(System.in);
        int array[][] = new int[rows][cols];
        for(int i = 0 ; i < rows ; i++)
        {
            for(int j = 0 ; j < cols ; j++)
            {
                System.out.println("please enter the cell [" + i + "]" + "[" + j + "]");
                array[i][j] = input.nextInt();
            }
        }
        return array;
    }
    
//    methode to transpose the array
    public static int[][] transposeArray(int[][] array , int rows , int cols)
    {
        int transpose[][] = new int[cols][rows];
        for(int i = 0 ; i < rows ; i++)
        {
            for(int j = 0 ; j < cols ; j++)
                transpose[j][i] = array[i][j];
        }
        return transpose;
    }
    
//    methode to display the transposed array
    public static void displayTransposeArray(int trans[][] , int rows , int cols)
    {
        for(int i = 0 ; i < cols ; i++)
        {
            for(int j = 0 ; j < rows ; j++)
                System.out.print(trans[i][j] + "  ");
            System.out.println(" ");
        }
    } 
    
//    methode to display the user array
    public static void displayUserArray(int array[][] , int rows , int cols)
    {
        for(int i = 0 ; i < rows ; i++)
        {
            for(int j = 0 ; j < cols ; j++)
                System.out.print(array[i][j] + "  ");
            System.out.println(" ");
        }        
    }
    
//    methode to handle all the methodes
    public static void handle()
    {
        boolean forEver = true;
        while(forEver)
        {
            Scanner input = new Scanner(System.in);
            System.out.println("please enter the rows length of the array");
            int rows = input.nextInt();
            System.out.println("please enter the cols length of the array");
            int cols = input.nextInt();
            int array[][] = inputArray(rows,cols);
            int transpose[][] = transposeArray(array,rows,cols);
            System.out.println("your array");
            displayUserArray(array,rows,cols);
            System.out.println("###########");
            System.out.println("the transpose array");
            displayTransposeArray(transpose,rows,cols);           
        }
    }
    
    public static void main(String[] args) {
        handle();
    }
}
