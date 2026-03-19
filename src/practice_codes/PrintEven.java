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
public class PrintEven {
    
    public static void main(String[] args) {
        printEvenNumber();
    }

    static void printEvenNumber() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Give me a number: ");
        int number = scanner.nextInt();
        
            //Validate the input first before starting the loop
            if (number < 1) {
                System.out.println("Number must be above 0");
            } else {
                for (int n = 1; n <= number; n++)
                    System.out.println(n);
        }
    }
}
    
/**
 * 1. Ask the user a number
 * 2. Store the number in N
 * 3. Start at counter 1
 * 4. Repeat while counter is less or equal to N
 * 5. Check if the counter is even (using %)
 * 6. If true, print the number
 * 7. Increase counter by 1
 */
