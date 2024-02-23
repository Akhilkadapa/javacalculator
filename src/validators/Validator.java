package validators;


import java.util.Scanner;

public class Validator {

    public static double getValidNumber(Scanner scanner, String prompt) {
        while (true) {
            try {
                System.out.print(prompt);
                return scanner.nextDouble();
            } catch (java.util.InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.nextLine();  // Consume the invalid input
            }
        }
    }

    public static String getValidOperator(Scanner scanner, String prompt) {
        while (true) {
            System.out.print(prompt);
            String input = scanner.next();
            if (input.length() == 1 && "+-*/".contains(input)) {
                return input;  // Return the whole String
            } else {
                System.out.println("Invalid input. Please enter a valid operator (+, -, *, /).");
            }
        }
    }



}
