package practice_codes;

import java.util.Scanner;

/**
 * This is to test my understanding of printing output and using basic control structures like
 * for loop and if statement
 */

public class LoopSumEven {

    public static void main(String[] args) {
        printCounterAndEvenSum();
    }

    static void printCounterAndEvenSum () {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Give me a number now: ");
        int number = scanner.nextInt();

        int sum = 0;
        System.out.print("Numbers: ");
        for (int n = 1; n <= number; n++) {
            System.out.print(n + ", ");
        }
        System.out.print("\nEven Numbers are: ");
        for (int n=1; n<=number; n++) {
            if (n % 2 == 0) {
                System.out.print(n + ", ");
                sum += n;
            }
        }
        System.out.print("\nTotal of even numbers: " + sum);
    }
}

