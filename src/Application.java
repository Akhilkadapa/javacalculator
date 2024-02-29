import readers.UserInput;
import service.BasicCalculator;

import java.util.List;
import validators.Validator;


public class Application {

    public static void main(String[] args) {

        UserInput userInput = new UserInput();
        Validator validator = new Validator();



        // Get inputs
        List<String> inputs = userInput.getInputs();

        // Validate and get numbers
        double num1 = validator.getValidNumber(inputs.get(0));
        double num2 = validator.getValidNumber(inputs.get(1));

        // Validate and get operator
        String operator = validator.getValidOperator(inputs.get(2));

        // Call the calculate method
        BasicCalculator calculator = new BasicCalculator();
        double result = calculator.performCalculation(num1, num2, operator);

        System.out.print("Result: " + result);

        // Close the scanner
        userInput.closeScanner();
    }
}