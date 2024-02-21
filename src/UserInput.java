
import java.util.Scanner;
import java.util.Scanner;

public class UserInput {

    private Scanner scanner;

    public UserInput() {
        this.scanner = new Scanner(System.in);
    }

    public void getUserInputAndCalculate() {
        // Get user input for two numbers
        double num1 = Validator.getValidNumber(scanner, "Enter the first number: ");
        double num2 = Validator.getValidNumber(scanner, "Enter the second number: ");

        // Get user input for the operation
        char operator = Validator.getValidOperator(scanner, "Enter the operation (+, -, *, /): ");

        // Create a BasicCalculator instance and perform the calculation
        BasicCalculator calculator = new BasicCalculator();
        double result = calculator.performCalculation(num1, num2, operator);

        // Display the result
        System.out.println("Result: " + result);
    }

    public void closeScanner() {
        // Close the scanner
        scanner.close();
    }
}
