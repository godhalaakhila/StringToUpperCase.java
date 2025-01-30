import java.util.Scanner;

public class StringToUpperCase {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user for input string
        System.out.println("Enter a string: ");
        String input = scanner.nextLine();

        // Convert the string to uppercase
        String uppercaseString = input.toUpperCase();

        // Display the uppercase string
        System.out.println("Uppercase string: " + uppercaseString);

        // Close the scanner to avoid resource leak
        scanner.close();
    }
}
 
    

