// Java program to demonstrate finally, throw, and throws
class ExceptionDemo {

    // Method with throws (it declares that it may throw an exception)
    static void checkAge(int age) throws ArithmeticException {
        if (age < 18) {
            // Manually throwing an exception
            throw new ArithmeticException("Age must be 18 or above!");
        } else {
            System.out.println("Welcome, you are eligible to vote.");
        }
    }

    public static void main(String[] args) {
        try {
            checkAge(15);   // risky call (age < 18, will throw exception)
        }
        catch (ArithmeticException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
        finally {
            System.out.println("Finally block always executes (closing resources, cleanup etc.)");
        }

        System.out.println("Program continues after exception handling...");
    }
}