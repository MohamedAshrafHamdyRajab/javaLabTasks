// this project to get the nPr and nCr and the user make the decision 
package com.mycompany.javacombinationpermutationproject;
import java.util.Scanner;

public class JavaCombinationPermutationProject {
    
//    methode to handle the output
    public static void handle()
    {
        boolean forEver = true;
        while(forEver)
        {
            System.out.println("if you want permutation press 1 , combination press 2");
            Scanner input = new Scanner(System.in);
            int np , rp , nc , rc , nsum = 1 , rsum = 1 , sum = 1 , p , c ;
            int choice = input.nextInt();
//            this case to calculate the permutation
            if(choice == 1)
            {
                System.out.println("enter n value");
                np = input.nextInt();
                System.out.println("enter r value");
                rp = input.nextInt();            
                for(int i = 1 ; i<=np ; i++)
                    nsum = nsum * i;
                for(int i = 1 ; i<=(np-rp) ; i++)
                    rsum = rsum * i;
                p = nsum/rsum;
            System.out.println("the permutation formula is n!/(n-r)!");
            System.out.println("the value of " + np +"P" + rp + " = " + p);
            }
//            this case to calculate the combination
            else if(choice == 2)
            {
                System.out.println("please enter n value");
                nc = input.nextInt();
                System.out.println("please enter r value");
                rc = input.nextInt();
                for(int i = 1 ; i<=nc ; i++)
                    nsum = nsum * i;
                for(int i = 1 ; i<=rc ; i++)
                    rsum = rsum * i;
                for(int i = 1 ; i<=(nc-rc) ; i++)
                    sum = sum * i;
                c = nsum/(rsum * sum);
                System.out.println("the combination formula is n!/r!(n-r)!");
                System.out.println("the value of " + nc + "C" + rc + " = " + c);
            }
        }
    }
    
    public static void main(String[] args) {
        handle();
    }
}
