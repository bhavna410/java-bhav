// Java program with multiple catch blocks
class MultipleCatch {
    public static void main(String[] args) {
        try {
            int arr[] = {10, 20, 30};

            // Risky code 1 → Arithmetic Exception
            int result = 10 / 0;  

            // Risky code 2 → ArrayIndexOutOfBoundsException
            System.out.println(arr[5]);  
        }
        catch (ArithmeticException e) {
            System.out.println("Error: Division by zero not allowed!");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid array index!");
        }
        catch (Exception e) {
            System.out.println("General Exception: " + e);
        }

        System.out.println("Program continues after handling exception...");
    }
}
