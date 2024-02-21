public class CalApplication {


    public static void main(String[] args) {
        // Create a UserInput instance
        UserInput userInput = new UserInput();

        // Get user input and perform calculation
        userInput.getUserInputAndCalculate();

        // Close the scanner
        userInput.closeScanner();
    }
}
