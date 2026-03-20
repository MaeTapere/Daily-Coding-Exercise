package practice_codes;


import java.util.Scanner;

/**
 * This program is to simply get the odd numbers from the user input
 * and list all the odd numbers, print them, add them up, and count how many are there
 * to reach the user input.
 */

public class OddSumAndCount {

    public static void main(String[] args) {
        oddNumbersSumAndCount();
    }

    static void oddNumbersSumAndCount () {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Give me a number: ");
        int number = scanner.nextInt();

        int counter = 0; // initiate the counter for how many odd numbers there are
        int sum = 0; // initiate the sum for all the odd numbers
        for (int n = 1; n <= number; n++) {
            if (n % 2 != 0) {
                System.out.println(n);
                sum += n; // add the odd numbers
                counter++; // add 1 count to the counter variable everytime there's an odd number
            }
        }
        System.out.println("Sum of the odd numbers: " + sum);
        System.out.println("How many odd numbers are there: " + counter);
    }
}

/**
 * 1. Ask the user for a number
 * 2. Store the number in a variable
 * 3. Set sum = 0
 * 4. Set count = 0
 * 5. Start a counter at 1
 * 6. Repeat while counter is <= variable
 * 7. Check if the counter is odd (counter % 2 != 0)
 * 8. If true: print the counter, add the counter to sum, and increase count by 1
 * 9. Increase counter by 1
 * 10. After the loop: print sum and print count
 */