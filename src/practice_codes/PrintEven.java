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
public class PrintEven {
    
    public static void main(String[] args) {
        printEvenNumber();
    }

    static void printEvenNumber() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Give me a number: ");
        int input = scanner.nextInt();
        
        for (int n = 1; n <= input; n++) {
            if (input % 2 == 0) {
                System.out.println(input);
            }
        }
    }
}
