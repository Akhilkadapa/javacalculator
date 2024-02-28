package readers;

import service.BasicCalculator;
import validators.Validator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class UserInput {

    private Scanner scanner;
    private Validator validator;

    public UserInput() {
        this.scanner = new Scanner(System.in);
        this.validator = new Validator();
    }

    public List<Double> getNumbers() throws IllegalArgumentException {
        try {
            System.out.println("Enter number 1:");
            double num1 = validator.getValidNumber(scanner.next());

            System.out.println("Enter number 2:");
            double num2 = validator.getValidNumber(scanner.next());

            return List.of(num1, num2);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("Error: " + e.getMessage());
        }
    }

    public String getOperation() throws IllegalArgumentException {
        try {
            System.out.println("Enter the operation (+, -, *, /):");
            return validator.getValidOperator(scanner.next());
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("Error: " + e.getMessage());
        }
    }

    public void closeScanner() {
        // Close the scanner
        scanner.close();
    }
}



