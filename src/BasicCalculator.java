import java.util.Scanner;



    public class BasicCalculator {
        public static void main(String[] args) {
            // Create a Scanner object for user input
            Scanner scanner = new Scanner(System.in);

            // Get user input for two numbers
            double num1 = getValidNumber("Enter the first number: ");
            double num2 = getValidNumber("Enter the second number: ");

            // Get user input for the operation
            char operator = getValidOperator("Enter the operation (+, -, *, /): ");

            // Perform the calculation based on the operator
            double result = performCalculation(num1, num2, operator);

            // Display the result
            System.out.println("Result: " + result);
        }

        // Function to get a valid numeric input from the user
        private static double getValidNumber(String prompt) {
            Scanner scanner = new Scanner(System.in);
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

        // Function to get a valid operator input from the user
        private static char getValidOperator(String prompt) {
            Scanner scanner = new Scanner(System.in);
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

        // Function to perform the calculation based on user inputs
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


