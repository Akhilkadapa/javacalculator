import readers.UserInput;
import service.BasicCalculator;
import validators.Validator;

public class Application {

    public static void main(String[] args) {

        UserInput userInput = new UserInput();
        Validator validator = new Validator();

        try {
            // Get numbers
            double num1 = Double.parseDouble(validator.getNumber(userInput.getNumber1()));
            double num2 = Double.parseDouble(validator.getNumber(userInput.getNumber2()));

            // Get operator
            String operator = validator.getOperator(userInput.getValidOperator());

            // Call the calculate method
            BasicCalculator calculator = new BasicCalculator();
            double result = calculator.performCalculation(num1, num2, operator);

            System.out.print("Result: " + result);
        } catch (ArithmeticException | IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        } finally {
            // Close the scanner
            userInput.closeScanner();
        }
    }
}