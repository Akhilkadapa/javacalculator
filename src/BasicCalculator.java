import java.util.Scanner;
public class BasicCalculator {

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Get user input for two numbers
        double num1 = Validator.getValidNumber(scanner, "Enter the first number: ");
        double num2 = Validator.getValidNumber(scanner, "Enter the second number: ");

        // Get user input for the operation
        char operator = Validator.getValidOperator(scanner, "Enter the operation (+, -, *, /): ");

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
