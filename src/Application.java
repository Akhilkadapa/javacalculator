import readers.UserInput;
import service.BasicCalculator;

import java.util.List;
import validators.Validator;

import validators.Validator;

public class Application {

    public static void main(String[] args) {

        UserInput userInput = new UserInput();
        Validator validator = new Validator();

        // Validate and get numbers
        List<Double> numbers = validateAndGetNumbers(userInput, validator);

        // Validate and get operator
        String operator = validateAndGetOperation(userInput, validator);

        // Call the calculate method
        String result = calculate(numbers, operator);

        System.out.print(result);

        // Close the scanner
        userInput.closeScanner();
    }

    private static List<Double> validateAndGetNumbers(UserInput userInput, Validator validator) {
        while (true) {
            try {
                System.out.println("Enter number 1:");
                double num1 = validator.getValidNumber(userInput.getStringInput());

                System.out.println("Enter number 2:");
                double num2 = validator.getValidNumber(userInput.getStringInput());

                return List.of(num1, num2);
            } catch (IllegalArgumentException e) {
                // Exception message will be printed automatically
            }
        }
    }

    private static String validateAndGetOperation(UserInput userInput, Validator validator) {
        while (true) {
            try {
                System.out.println("Enter the operation (+, -, *, /):");
                return validator.getValidOperator(userInput.getStringInput());
            } catch (IllegalArgumentException e) {
                // Exception message will be printed automatically
            }
        }
    }

    public static String calculate(List<Double> numbers, String operator) {
        // Perform validation or additional processing if needed

        BasicCalculator calculator = new BasicCalculator();
        double result = calculator.performCalculation(numbers.get(0), numbers.get(1), operator);

        return "Result: " + result;
    }
}

