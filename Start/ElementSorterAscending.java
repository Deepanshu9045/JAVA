import java.util.Arrays;
import java.util.Scanner;

public class ElementSorterAscending {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the number of elements
        System.out.print("Enter the number of elements: ");
        int numElements = scanner.nextInt();

        // Create an array to store the elements
        int[] elements = new int[numElements];

        // Prompt the user to enter each element
        for (int i = 0; i < numElements; i++) {
            System.out.print("Enter element :" + (i + 1) + ": ");
            elements[i] = scanner.nextInt();
        }

        // Sort the array
        Arrays.sort(elements);

        // Print the sorted elements
        System.out.println("Sorted elements:");

        for (int element : elements) {
            System.out.print(element + " ");
        }

        // Close the scanner to prevent resource leak
        scanner.close();
    }
}
