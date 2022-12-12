// this project to remove the comas from any text by the user
package com.mycompany.javaremovecomas;
import java.util.Scanner;

public class JavaRemoveComas {
    
//    methode for take the input sentence form user
    public static String inputUserSentence()
    {
        Scanner input = new Scanner(System.in);
        String inputSentence = input.nextLine();
        return inputSentence;
    }
    
//   methode for remove the comas from the sentence 
    public static String removeComas(String sentence)
    {        
        String newSentence = "";
        for(int i = 0 ; i < sentence.length() ; i++)
        {
            char ch = sentence.charAt(i);
            if(ch != ',')               
                newSentence = newSentence + ch;
        }
        return newSentence;
    }
    
//    methode for display the new sentence
    public static void displayNewSentence(String newSentence)
    {
        System.out.println(newSentence);   
    }
    
//    methode to handle the output
    public static void handle()
    {
        boolean forEver = true;
        while(forEver)
        {
            System.out.println("please enter your sentence");
            System.out.println("this sentence without comas");
            displayNewSentence(removeComas(inputUserSentence()));
        }
    }
    
    public static void main(String[] args) {
        handle();
    }
}
