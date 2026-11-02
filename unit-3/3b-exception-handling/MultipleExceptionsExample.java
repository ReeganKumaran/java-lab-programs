public class MultipleExceptionsExample {
    public static void main(String[] args) {
        // 1. Handling ArithmeticException
        try {
            int numerator = 10;
            int denominator = 0;
            int result = numerator / denominator; // throws ArithmeticException
            System.out.println("Result of division: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        }

        // 2. Handling ArrayIndexOutOfBoundsException
        try {
            int[] numbers = {1, 2, 3};
            System.out.println("Accessing fourth element: " + numbers[3]); // throws ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        }

        // 3. Handling NullPointerException
        try {
            String text = null;
            System.out.println("Text length: " + text.length()); // throws NullPointerException
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        }

        System.out.println("Program continues after handling the exceptions.");
    }
}
