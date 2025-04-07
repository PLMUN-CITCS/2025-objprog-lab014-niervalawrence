public class MethodReturnTypes {

    // Method to display a welcome message (void return type)
    public static void displayWelcomeMessage() {
        System.out.println("Welcome to our program!");
    }

    // Method to calculate the average of two numbers (returns a double)
    public static double calculateAverage(int num1, int num2) {
        double average = (num1 + num2) / 2.0;
        return average;
    }

    public static void main(String[] args) {
        // Calling the method to display the welcome message
        displayWelcomeMessage();

        // Define two integer values
        int value1 = 20;
        int value2 = 30;

        // Calling the method to calculate the average
        double result = calculateAverage(value1, value2);

        // Printing the calculated average
        System.out.println("The average is: " + result);
    }
}
