package practice_codes;

import javax.xml.transform.Source;
import java.sql.SQLOutput;
import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
        primeNumber();
    }

    static void primeNumber () {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Give me a number: ");
        int number = scanner.nextInt();

        boolean isPrime = true;
        if (number <= 1) {
            isPrime = false;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println(number + " is Prime");
        } else {
            System.out.println(number + " is Not Prime");
        }
    }
}

/**
 * BEFORE LOOP:
 * 1. Get input
 * 2. Store input in N
 * 3. Create isPrime and set it to true
 * 4. Create an if statement to capture inputs that are <= 1, and set isPrime to false
 *
 * INSIDE THE LOOP:
 * 5. Start counter at 2
 * 6. Continue loop until counter is less than N
 * 7. Check if number % counter == 0, set isPrime to False and stop the loop
 *
 * AFTER LOOP:
 * 8. if N isPrime, print "Prime'
 * 9. else, print "Not Prime'
 */