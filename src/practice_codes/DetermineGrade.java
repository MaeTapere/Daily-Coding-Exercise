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
public class DetermineGrade {
    
    public static void main(String[] args) {
        grade();
            
    }

    static void grade() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Give me your grade: ");
        int grade = scanner.nextInt();
        
        if (grade >= 90) System.out.println("A");
        else if (grade >= 80) System.out.println("B");
        else if (grade >= 70) System.out.println("C");
        else System.out.println("F");
    }
}
    // THE CODE ABOVE IS CORRECT BUT IT NEEDS TO HANDLE INVALID DATA
    // if (grade < 0 || grade > 100) System.out.println("Invalid grade");


 /** Breaking down of steps
  * Step 1: Ask the user for a score
  * Step 2: Store the score
  * Step 3: Check if the score is between 90 and 100
  * Step 4: If true, print "A"
  * Step 5: Otherwise check if the score is between 80 and 89
  * Step 6: If true, print "B"
  * Step 7: Otherwise check if the score is between 70 and 79
  * Step 8: If true, print "C"
  * Step 9: Otherwise print "F"
  **/