import java.util.Scanner;

public class BasicCalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Get user input for two numbers
        double num1 = Validation.getValidNumber(scanner, "Enter the first number: ");
        double num2 = Validation.getValidNumber(scanner, "Enter the second number: ");

        // Get user input for the operation
        char operator = Validation.getValidOperator(scanner, "Enter the operation (+, -, *, /): ");

        // Perform the calculation based on the operator
        double result = performCalculation(num1, num2, operator);

        // Display the result
        System.out.println("Result: " + result);

        // Close the scanner
        scanner.close();
    }

    private static double performCalculation(double num1, double num2, char operator) {
        switch (operator) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                if (num2 != 0) {
                    return num1 / num2;
                } else {
                    System.out.println("Error: Cannot divide by zero.");
                    System.exit(1);  // Exit the program
                }
            default:
                System.out.println("Error: Invalid operator.");
                System.exit(1);  // Exit the program
        }
        return 0;  // This should not be reached
    }
}

class Validation {

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

    public static char getValidOperator(Scanner scanner, String prompt) {
        while (true) {
            System.out.print(prompt);
            String input = scanner.next();
            if (input.length() == 1 && "+-*/".contains(input)) {
                return input.charAt(0);
            } else {
                System.out.println("Invalid input. Please enter a valid operator (+, -, *, /).");
            }
        }
    }
}

