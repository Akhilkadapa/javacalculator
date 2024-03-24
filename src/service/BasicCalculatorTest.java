
package service;

import org.junit.Test;
import static org.junit.Assert.*;

    public class BasicCalculatorTest {

        @Test
        public void testAddition() {
            BasicCalculator calculator = new BasicCalculator();
            double result = calculator.performCalculation(5, 3, "+");
            assertEquals(8, result, 0); // Expected result: 8
        }

        @Test
        public void testSubtraction() {
            BasicCalculator calculator = new BasicCalculator();
            double result = calculator.performCalculation(5, 3, "-");
            assertEquals(2, result, 0); // Expected result: 2
        }

        @Test
        public void testMultiplication() {
            BasicCalculator calculator = new BasicCalculator();
            double result = calculator.performCalculation(5, 3, "*");
            assertEquals(15, result, 0); // Expected result: 15
        }

        @Test
        public void testDivision() {
            BasicCalculator calculator = new BasicCalculator();
            double result = calculator.performCalculation(10, 2, "/");
            assertEquals(5, result, 0); // Expected result: 5
        }

        @Test(expected = ArithmeticException.class)
        public void testDivisionByZero() {
            BasicCalculator calculator = new BasicCalculator();
            calculator.performCalculation(10, 0, "/");
        }

        @Test(expected = IllegalArgumentException.class)
        public void testInvalidOperator() {
            BasicCalculator calculator = new BasicCalculator();
            calculator.performCalculation(10, 2, "%"); // '%' is an invalid operator
        }
    }


