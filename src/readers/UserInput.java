package readers;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class UserInput {

    private Scanner scanner;

    public UserInput() {
        this.scanner = new Scanner(System.in);
    }

    public List<String> getInputs() {
        List<String> inputs = new ArrayList<>();

        System.out.print("Enter number 1: ");
        inputs.add(scanner.next());

        System.out.print("Enter number 2: ");
        inputs.add(scanner.next());

        System.out.print("Enter the operation (+, -, *, /): ");
        inputs.add(scanner.next());

        return inputs;
    }

    public void closeScanner() {
        scanner.close();
    }
}