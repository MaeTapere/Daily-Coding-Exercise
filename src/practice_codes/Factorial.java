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
public class Factorial {
    
    public static void main(String[] args) {
        factorial();
    }
    
    static void factorial() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Give me a number: ");
        int number = scanner.nextInt();
        
        int result = 1;
        if (number < 1 ) {
            // Validation is optional but a good exercise for real world application
            System.out.println("Number must be greater than 0");
        } else {
            for (int n = 1; n <= number; n++) {
            result *= n;
            }
            System.out.println(result);
        }


    }
}
