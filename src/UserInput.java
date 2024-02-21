
import java.util.Scanner;
public class UserInput {

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Get user input for two numbers
        double num1 = Validator.getValidNumber(scanner, "Enter the first number: ");
        double num2 = Validator.getValidNumber(scanner, "Enter the second number: ");

        // Get user input for the operation
        char operator = Validator.getValidOperator(scanner, "Enter the operation (+, -, *, /): ");

        // Perform the calculation based on the operator
        double result = BasicCalculator.performCalculation(num1, num2, operator);

        // Display the result
        System.out.println("Result: " + result);

        // Close the scanner
        scanner.close();
    }
}

