// Java program to perform concatenation of substrings
// and demonstrate StringTokenizer

import java.util.StringTokenizer;

class StringOperations {
    public static void main(String[] args) {
        
        // --- Concatenation Part ---
        String str1 = "Hello";
        String str2 = "World";

        // Concatenate full strings
        String full = str1 + " " + str2; 
        System.out.println("Concatenated String: " + full);

        // Concatenate substrings (taking parts using substring method)
        String part1 = str1.substring(0, 3); // Hel
        String part2 = str2.substring(0, 3); // Wor
        String subConcat = part1 + part2; 
        System.out.println("Concatenated Substrings: " + subConcat);

        // --- StringTokenizer Part ---
        String text = "Java is simple and powerful";
        System.out.println("\nStringTokenizer Output:");

        StringTokenizer st = new StringTokenizer(text, " ");
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }

        // --- Extra Prints at the End ---
        System.out.println("\n--- Extra Prints ---");
        System.out.println("Direct Print str1: " + str1);
        System.out.println("Direct Print str2: " + str2);
        System.out.println("Final Concatenated: " + full);
        System.out.println("Final Substring Concatenated: " + subConcat);
    }