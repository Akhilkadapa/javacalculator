package readers;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;


public class UserInput {

    private Scanner scanner;


        public UserInput() {
            this.scanner = new Scanner(System.in);
        }

        public List<String> getInputs() {
            List<String> inputs = new ArrayList<>();

            try {
                System.out.print("Enter number 1: ");
                inputs.add(scanner.next());
            } catch (InputMismatchException e) {
                System.err.println("Invalid input for number 1. Please enter a valid number.");
                scanner.next();
                return getInputs(); // Retry the entire input process
            }

            try {
                System.out.print("Enter number 2: ");
                inputs.add(scanner.next());
            } catch (InputMismatchException e) {
                System.err.println("Invalid input for number 2. Please enter a valid number.");
                scanner.next(); //
                return getInputs(); // Retry the entire input process
            }

            try {
                System.out.print("Enter the operation (+, -, *, /): ");
                inputs.add(scanner.next());
            } catch (InputMismatchException e) {
                System.err.println("Invalid input for the operation. Please enter a valid operator (+, -, *, /).");
                scanner.next(); //
                return getInputs(); // Retry the entire input process
            }

            return inputs;
        }

        public void closeScanner() {
            scanner.close();
        }


        }
