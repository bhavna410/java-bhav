// Java program using single try-catch block
class SingleTryCatch {
    public static void main(String[] args) {
        try {
            // Risky code
            int a = 10, b = 0;
            int result = a / b;  // Division by zero → exception
            System.out.println("Result: " + result);
        }
        catch (ArithmeticException e) {
            // Handling exception
            System.out.println("Error: Division by zero is not allowed!");
        }

        System.out.println("Program continues after handling exception...");
    }
}