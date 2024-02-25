import java.util.Scanner;

public class NumberPrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10]; // Array to store the entered numbers
        
        System.out.println("Enter 10 numbers:");

        // Loop to input 10 numbers
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Printing the entered numbers
        System.out.println("Entered numbers:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Number " + (i + 1) + ": " + numbers[i]);
        }

        // Close the scanner to release resources
        scanner.close();
    }
}
