import readers.UserInput;
import service.BasicCalculator;

import java.util.List;
public class Application {

    public static void main(String[] args) {
        // Create a UserInput instance
        UserInput userInput = new UserInput();
        List<Double> numbers = userInput.getNumbers();
        String operator = userInput.getOperation();

        // Call the calculate method
        String result = calculate(numbers, operator);

        System.out.print(result);

        // Close the scanner
        userInput.closeScanner();
    }

    public static String calculate(List<Double> numbers, String operator) {

        BasicCalculator calculator = new BasicCalculator();

        double result = calculator.performCalculation(numbers.get(0), numbers.get(1), operator);

        return "Result: " + result;
    }
}
