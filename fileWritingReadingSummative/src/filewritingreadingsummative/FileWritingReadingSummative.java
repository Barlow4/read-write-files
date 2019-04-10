/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package filewritingreadingsummative;

/**
 *
 * @author thbar7035
 */
import java.io.*;
import java.util.Scanner;

public class FileWritingReadingSummative {
    

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        Scanner keyedInput = new Scanner(System.in);
        //set variables
        int markNumber;
        
        //open the file
        PrintWriter fileOut = new PrintWriter(new FileWriter(
      "marks.txt"));
        
        
        //ask for 10 marks, put each input into the file
        System.out.println("Please enter 10 marks");
        for (int i = 1; i <=10; i++){
            markNumber = keyedInput.nextInt();
            
            fileOut.println(markNumber);
        }
        
        //close file
        fileOut.close();
        
        
        
       //open the file
         BufferedReader readFile = new BufferedReader(
       new FileReader("marks.txt"));
        
         int readMark [] = new int[10];
         String output;
         int total = 0;
         int rng;
         double average;
         
         rng = (int)Math.round(Math.random()*9+1);
         
         for (int i = 0; i < 10; i++){
             output = readFile.readLine();
             System.out.println(output);
             readMark[i] = Integer.parseInt(output);
             total = total + readMark[i];
         }
        
        average = total/10;
        
        System.out.println("The average of the numbers is " + (Math.round(average)));
        System.out.println("The total of the numbers is " + total);
        System.out.println("A random number from the list: " + readMark[rng]);
        
        
        
    }
    
}
