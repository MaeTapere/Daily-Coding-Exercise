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
public class checkAgeRange {
    
    public static void main(String[] args) {
        checkAgeRange();
        
        
    }    
    
    static void checkAgeRange() {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("How old are you? ");
        int age = scan.nextInt();
        
        if (age < 0) System.out.println("Invalid age");
        else if (age <= 12 ) System.out.println("Child");
        else if (age <= 19) System.out.println("Teen");
        else System.out.println("Adult");
        
    }
    
}
    // IMPROVEMENTS: The class should start with a Capital Letter
    // naming the scanner variable "scanner" is more clear than "scan"
    // name the mtehod to be more ACTION-BASED like classifyAge();

 /** Breaking down of steps
  * 1. Ask the user for age
  * 2. Store the age
  * 3. Check if age is less than 0 → print "Invalid age"
  * 4. Else if age ≤ 12 → print "Child"
  * 5. Else if age ≤ 19 → print "Teen"
  * 6. Else → print "Adult"
  **/