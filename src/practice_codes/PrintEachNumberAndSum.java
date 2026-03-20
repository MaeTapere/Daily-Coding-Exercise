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
