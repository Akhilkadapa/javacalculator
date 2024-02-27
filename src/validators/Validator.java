
package validators;

import java.util.InputMismatchException;
import java.util.Scanner;

        public class Validator {

            public double getValidNumber(Scanner scanner, String prompt) {
                while (true) {
                    try {
                        System.out.print(prompt);
                        return Double.parseDouble(scanner.next());
                    } catch (NumberFormatException e) {
                        // Consume invalid input
                        scanner.nextLine();
                    }
                }
            }
            public String getValidOperator(Scanner scanner, String prompt) throws IllegalArgumentException {
                while (true) {
                    try {
                        System.out.print(prompt);
                        String input = scanner.next();
                        if (input.length() == 1 && "+-*/".contains(input)) {
                            return input;  // Return the valid operator
                        } else {
                            throw new IllegalArgumentException("Invalid input. Please enter a valid operator (+, -, *, /).");
                        }
                    } catch (IllegalArgumentException e) {
                        System.out.println("Error: " + e.getMessage());
                        // Consume invalid input
                        scanner.nextLine();
                    }
                }
            }

        }




