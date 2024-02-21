import java.util.Scanner;
public class BasicCalculator {
     public static double performCalculation(double num1, double num2, char operator) {
            switch (operator) {
                case '+':
                    return num1 + num2;
                case '-':
                    return num1 - num2;
                case '*':
                    return num1 * num2;
                case '/':
                    if (num2 != 0) {
                        return num1 / num2;
                    } else {
                        System.out.println("Error: Cannot divide by zero.");
                        System.exit(1);  // Exit the program
                    }
                default:
                    System.out.println("Error: Invalid operator.");
                    System.exit(1);  // Exit the program
            }
            return 0;
        }
    }
