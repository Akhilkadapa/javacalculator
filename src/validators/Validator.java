
package validators;
public class Validator {


        public double getValidNumber(String input) throws IllegalArgumentException {
            try {
                validateIsNumber(input);
                return Double.parseDouble(input);
            } catch (NumberFormatException e) {
                throw new IllegalArgumentException("Invalid input. Please enter a valid number.");
            }
        }

        public String getValidOperator(String input) throws IllegalArgumentException {
            if (!input.matches("[-+*/]")) {
                throw new IllegalArgumentException("Invalid input. Please enter a valid operator (+, -, *, /).");
            }
            return input;  // Return the valid operator
        }

        private void validateIsNumber(String input) throws IllegalArgumentException {
            if (!input.matches("-?\\d+(\\.\\d+)?")) {
                throw new IllegalArgumentException("Invalid input. Please enter a valid number.");
            }
        }
    }
