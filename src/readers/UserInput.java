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
        List<Double> numbers = new ArrayList<>();

        try {
            System.out.print("Enter number 1: ");
            numbers.add(validator.getValidNumber(getStringInput()));

            System.out.print("Enter number 2: ");
            numbers.add(validator.getValidNumber(getStringInput()));

            return numbers;
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("Invalid input for numbers. " + e.getMessage());
        }
    }

    public String getOperation() throws IllegalArgumentException {
        try {
            System.out.print("Enter the operation (+, -, *, /): ");
            return validator.getValidOperator(getStringInput());
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("Invalid input for operation. " + e.getMessage());
        }
    }

    public String getStringInput() {
        return scanner.next();
    }

    public void closeScanner() {
        scanner.close();
    }
}