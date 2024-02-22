package Application;
import validators.Validator;



import java.util.List;
import java.util.Scanner;
public class CalApplication {


    public static void main(String[] args) {
        // Create a UserInput instance
        UserInput userInput = new UserInput();
        List<Integer> numbers =userInput.getNumbers();
        String Operator = userInput.getoperation();

        Validator validator = new Validator();
        validator.getValidNumbers();
        validator.getValidopertor();

        String result = CalApplication.calculate(numbers,operator);

        sys.out.print(result);

        // create a userInput instance
        UserInput userInput = new UserInput();

        userInput.getuserInput = new UserInput();


        // Close the scanner
        userInput.closeScanner();
    }
}
