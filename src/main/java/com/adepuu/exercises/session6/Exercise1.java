package com.adepuu.exercises.session6;
/**
 * Write a Java Program to Enter numbers to calculate average and enter 'q' to finish.
 *
 * Input: 1, 2, 3, 4, 5, q
 * Output: 3
 *
 * Input: 1, 2, 3, a, b, 4, 5, q
 * Output: 3
 *
 * Explanation: print “Invalid input. Please enter a valid number or 'q' to finish.” if user not inserting the expected number or character.
 */

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();
        boolean isQuit = false;

        //loop input
        while (!isQuit) {
            try {
                System.out.println("Enter a number or 'q' to quit and show the result: ");
                String input = scanner.nextLine();

                //Output when tap q or Q
                if (input.equalsIgnoreCase("q")) {
                    isQuit = true;
                    if (!numbers.isEmpty()) {
                        System.out.println("Total numbers entered: " + numbers.size());
                        System.out.println("Numbers entered: " + numbers);
                        double average = calculateAverage(numbers);
                        System.out.println("Average of all numbers: " + average);
                    } else {
                        System.out.println("No numbers entered.");
                    }
                } else { //input int(string) convert to integer save
                    int number = Integer.parseInt(input);
                    numbers.add(number);
                }
            } catch (NumberFormatException e) {
                System.err.println("Error: Invalid input. Please enter a valid number or 'q' to quit and show the result.");
            } catch (InputMismatchException e) {
                System.err.println("Error: Input must be a number or 'q' to quit and show the result.");
                scanner.nextLine(); // Clear the invalid input from the scanner buffer
            } catch (Exception e) {
                System.err.println("Error: An unexpected error occurred.");
            }
        }

        scanner.close();
    }

    public static double calculateAverage(List<Integer> numbers) { //average calculator
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return (double) sum / numbers.size();
    }
}