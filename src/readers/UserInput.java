package readers;

import service.BasicCalculator;
import validators.Validator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserInput {

    private Scanner scanner;

    public UserInput() {
        this.scanner = new Scanner(System.in);
    }

    public List<Double> getNumbers() {
        Validator validator = new Validator();
        List<Double> numbers = new ArrayList<>();

        System.out.println("Enter the numbers:");

        for (int i = 0; i < 2; i++) {
            numbers.add(validator.getValidNumber(scanner, "Number " + (i + 1) + ": "));
        }

        return numbers;
    }

    public String getOperation() {
        Validator validator = new Validator();
        return validator.getValidOperator(scanner, "Enter the Operation (+, -, *, /): ");
    }

    public void closeScanner() {
        // Close the scanner
        scanner.close();
    }
}


