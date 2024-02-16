import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input for two numbers
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        // Get user input for the operation
        System.out.print("Enter the operation (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        // Perform the calculation based on the operator
        double result = 0.0;
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Cannot divide by zero.");
                    return; // Exit the program
                }
                break;
            default:
                System.out.println("Error: Invalid operator.");
                return; // Exit the program
        }

        // Display the result
        System.out.println("Result: " + result);
    }
}
