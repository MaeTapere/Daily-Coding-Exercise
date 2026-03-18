/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practice_codes;

import java.util.Scanner;
/**
 *
 * @author Elle
 */
public class CheckPositiveOrNegativeOrNot {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Give me a number: ");
        int number = scanner.nextInt();
        
        // Scanner is optional. Use closer if a scanner is scanning from a FILE.
        // scanner.close();
        
        if (number > 0) System.out.println("Positive");
        else if (number == 0 ) System.out.println("Zero");
        else System.out.println("Negative");
        
    }
}

    // ALWAYS use braces even for one-line conditions. It prevents future bugs.
    // Class name is very long. Shorter is better like "NumberSign" or "CheckNumberSign"

 /** Breaking down of steps
  * 1. Ask the user for a number
  * 2. Store the number
  * 3. Check if the number > 0
  * 4. If true → print "Positive"
  * 5. Else if the number == 0 → print "Zero"
  * 6. Else → print "Negative"
  **/