package readers;
import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInput {

    private Scanner scanner;

    public UserInput() {
        this.scanner = new Scanner(System.in);
    }

    public double getNumber1() {
        return getNumber("Enter number 1: ");
    }

    public double getNumber2() {
        return getNumber("Enter number 2: ");
    }

    public String getValidOperator() {
        return getOperator("Enter the operation (+, -, *, /): ");
    }

    private double getNumber(String prompt) {
        while (true) {
            try {
                System.out.print(prompt);
                return scanner.nextDouble();
            } catch (InputMismatchException e) {
                System.err.println("Invalid input. Please enter a valid number.");
                scanner.next(); // Clear the buffer
            }
        }
    }

    private String getOperator(String prompt) {
        while (true) {
            System.out.print(prompt);
            String operator = scanner.next();
            if (operator.matches("[-+*/]")) {
                return operator;
            } else {
                System.err.println("Invalid input. Please enter a valid operator (+, -, *, /).");
            }
        }
    }

    public void closeScanner() {
        scanner.close();
    }
}
