public class ExceptionExample {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;

            int result = a / b;  // This will cause ArithmeticException
            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero!");

        } finally {
            System.out.println("Execution completed.");
        }
    }
}