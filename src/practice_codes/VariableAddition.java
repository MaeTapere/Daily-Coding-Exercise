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
public class VariableAddition {
    
    public static void main(String[] args) {
        sumNumbersToN();
    }
    
    static void sumNumbersToN() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Give me a number: ");
        int number = scanner.nextInt();
        
        int sum = 0;
        for (int n = 1; n <= number; n++) {
            sum += n;
        } 
        System.out.println(sum); // This is outside the loop so it doesn't print all the increments

    }
            
}
