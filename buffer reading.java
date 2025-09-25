import java.io.*; // import required classes

class BufferedReaderDemo {
    public static void main(String[] args) {
        try {
            // Create BufferedReader object to read input from console
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            System.out.print("Enter your name: ");
            String name = br.readLine();  // read a line (string)

            System.out.print("Enter your age: ");
            int age = Integer.parseInt(br.readLine()); // read and convert to integer

            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
        } 
        catch (IOException e) {
            System.out.println("Error in input: " + e);
        }
    }