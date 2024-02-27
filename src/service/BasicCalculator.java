package service;

import java.util.Scanner;
public class BasicCalculator {


    public double performCalculation(double num1, double num2, String operator) throws ArithmeticException, IllegalArgumentException {
        switch (operator) {
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "*":
                return num1 * num2;
            case "/":
                if (num2 != 0) {
                    return num1 / num2;
                } else {
                    throw new ArithmeticException("Cannot divide by zero.");
                }
            default:
                throw new IllegalArgumentException("Invalid operator.");
        }
    }
}