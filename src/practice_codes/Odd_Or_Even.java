/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practice_codes;

import java.util.Scanner;
/**
 *
 * @author Elle
 */
public class Odd_Or_Even {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        output();
        
        
    }
    
    // Method name should describe what the method does Exactly; like "checkEvenOdd"
    static void output() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Give me a number: ");
        int userInput = scanner.nextInt();
        scanner.close();
        
        if (userInput % 2 == 0) {
            System.out.println("Even number.");
            
        }else {
            System.out.println("Odd number.");
                    
        }
    }
    
}
 /** Breaking down of steps
  * 1. Get Input
  * 2. Store Input
  * 3. Check if input is divisible by 2
  * 4. If so, print "Even number" 
  * 5. If not, print "Odd number"
  **/