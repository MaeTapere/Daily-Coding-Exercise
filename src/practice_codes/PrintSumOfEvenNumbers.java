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
public class PrintSumOfEvenNumbers {
    
    public static void main(String[] args) {
        sumOfAllEven();
    }

    static void sumOfAllEven () {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Give me a number: ");
        int number = scanner.nextInt();
        
        int sum = 0;
        for (int n = 1; n <= number; n++) {
            if (n % 2 == 0) {
                sum += n;
            }
        }
        // This line is outside the for loop so it just prints the total, not every even sum
        System.out.println(sum);

    }
}


/**
 * 1. Ask the user a number
 * 2. Store the number in N
 * 3. Set sum = 0
 * 4. Start a counter at 1
 * 5. Repeat while counter is less than or equal to N
 * 6. Check if the counter is even (%)
 * 7. If true > add the counter to sum
 * 8. Increase counter by 1
 * 9. After the loop, print sum
 */
