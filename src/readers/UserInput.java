package readers;

import service.BasicCalculator;
import validators.Validator;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

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
        String operator = Validator.getValidOperator(scanner, "Enter the operation (+, -, *, /): ");

        // Create a service.BasicCalculator instance and perform the calculation
        BasicCalculator calculator = new BasicCalculator();
        double result = calculator.performCalculation(num1, num2, operator);

        // Display the result
        System.out.println("Result: " + result);
    }
    public List<Integer> getNumbers() {

        Validator validator = new Validator();

            List<Integer> numbers = new ArrayList<>();

            System.out.println("Enter the numbers:");

            for (int i = 0; i < 2; i++) {
                System.out.print("Number " + (i + 1) + ": ");
            }


            return numbers;
        }

    public String getOperation() {
        Validator validator = new Validator();

        System.out.print("Enter the operation (+, -, *, /): ");


    }
}

public void closeScanner() {
        // Close the scanner
        scanner.close();
    }
}
