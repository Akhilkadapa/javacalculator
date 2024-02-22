import readers.UserInput;
import validators.Validator;
import service.BasicCalculator;


import java.util.List;

public class Application {


    public static void main(String[] args) {
        // Create a readers.UserInput instance
        UserInput userInput = new UserInput();
        List<Integer> numbers =userInput.getNumbers();
        String Operator = userInput.getOperation();

        Validator validator = new Validator();
        validator.getValidNumber();
        validator.getValidOpertor();

        String result = Application.calculate(numbers,Operator);

        system.out.print(result);

        // create a userInput instance
        UserInput userInput = new UserInput();

        userInput.getuserInput = new UserInput();


        // Close the scanner
        userInput.closeScanner();
    }
}
