
package validators;
import java.util.InputMismatchException;

import java.util.Scanner;

public class Validator {

    public double getValidNumber(String input) throws IllegalArgumentException {
        try {
            return Double.parseDouble(input);
        } catch (NumberFormatException e) {
            // Consume invalid input
            throw new IllegalArgumentException("Invalid input. Please enter a valid number.");
        }
    }

    public String getValidOperator(String input) throws IllegalArgumentException {
        if (!input.matches("[-+*/]")) {
            throw new IllegalArgumentException("Invalid input. Please enter a valid operator (+, -, *, /).");
        }
        return input;  // Return the valid operator
    }
}