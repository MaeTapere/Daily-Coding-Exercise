package practice_codes;

import java.util.Scanner;

public class PrintEachNumberAndSum {

    public static void main(String[] args) {
        printEachNumberAndAdd();
    }

    static void printEachNumberAndAdd () {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Give me a number: ");
        int number = scanner.nextInt();

        int sum = 0;
        for (int n = 1; n <= number; n++) {
            System.out.println(n);
            sum += n;
        }

        System.out.println(sum);
    }
}

/*
 * BEFORE LOOP:
 * 1. Ask user number
 * 2. Store number in N
 * 3. Set sum = 0
 * 4. Start counter at 1
 *
 * INSIDE LOOP:
 * 5. Print the counter
 *
 * ONLY IF EVEN:
 *. 6. Print the counter (for even section)
 *. 7. Add the counter to sum
 * 8. Increase counter by 1
 *
 * AFTER LOOP:
 * 9. Print sum
 */