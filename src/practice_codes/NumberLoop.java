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
public class NumberLoop {
    
    public static void main(String[] args) {
       checkNumber();
        
    }
    
    static void checkNumber() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Give me a number: ");
        int number = scanner.nextInt();
        
        for (int n = 1; n <= number; n++){
            System.out.println(n);
        }
        
        if (number < 1){
            System.out.println("Number must be greater than 0");
        }
    }
}

// IMPROVEMENTS: 
// Validation SHOULD happen before the LOOP. In this code, if the user enters -3, the loop runs 0 times, then the message prints. Better to stop early.
// Better wording for error handling: Number must be greater than 0
// Method Naming: the method actually prints the numbers, not check them. It can be printNumbers().
// the code should look like this:
// if (number < 1) {
//    System.out.println("Number must be greater than 0");
// }else {
//    for (int n=1; n <= number; n++) {
//      System.out.println(n);  
//    }
//}

/** Breaking down of steps
 * 1. Ask the user for a number
 * 2. Store the number in variable N
 * 3. Start a counter at 1
 * 4. Repeat while the counter is less than or equal to N
 * 5. Print the counter
 * 6. Increase the counter by 1
 */