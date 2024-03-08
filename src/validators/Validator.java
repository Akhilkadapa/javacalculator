package validators;

public class Validator {

    public String getNumber(String input) throws IllegalArgumentException {
        validateIsNumber(input);
        return String.valueOf(Double.parseDouble(input));
    }

    public String getOperator(String input) throws IllegalArgumentException {
        validateIsOperator(input);
        return input;
    }

    private void validateIsNumber(String input) throws IllegalArgumentException {
        if (!input.matches("-?\\d+(\\.\\d+)?")) {
            throw new IllegalArgumentException("Invalid input. Please enter a valid number.");
        }
    }

    private void validateIsOperator(String input) throws IllegalArgumentException {
        if (!input.matches("[-+*/]")) {
            throw new IllegalArgumentException("Invalid input. Please enter a valid operator (+, -, *, /).");
        }
    }
}
