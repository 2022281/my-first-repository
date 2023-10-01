/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package randomnumber;

import java.util.Random;
import java.util.Scanner;


/**
 *
 * @author aldol
 */
public class RandomNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Create Scanner to obtain input from command window
        Scanner input = new Scanner(System.in); 
        Random rand = new Random();
        
        int number = rand.nextInt(100); // Generate a random number between 0 and 100 and storre it in the "number" variable
        int guessCount = 0; // Initialize # of numbers so entered so far
        
        // Prompt for input and read the numbers from user
        System.out.println("Enter a number less than 100. you have 10 guesses!!");
        
       // process 10 numbers using counter-controlled loop
        while (guessCount < 10){ 
            System.out.println("Guess: " + (guessCount+1));
            int guess = input.nextInt();
            
            if(guess == number){ // If user entered the right number
                System.out.println("You win!!");
                
            } else { // No number was guessed , so output appropriate message
                System.out.println("Hard luck!!");
                
            }
            
            guessCount++;
        }
        
        System.out.println("The number was: " + number);
        
    }
    
}
