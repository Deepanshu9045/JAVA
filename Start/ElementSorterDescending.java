import java.util.Arrays;
import java.util.Scanner;

public class ElementSorterDescending {
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
            System.out.print("Enter element #" + (i + 1) + ": ");
            elements[i] = scanner.nextInt();
        }

        // Sort the array in descending order using a custom comparator
        Arrays.sort(elements);
        for (int i = 0; i < elements.length / 2; i++) {
            int temp = elements[i];
            elements[i] = elements[elements.length - 1 - i];
            elements[elements.length - 1 - i] = temp;
        }

        // Print the sorted elements in descending order
        System.out.println("Sorted elements in descending order:");

        for (int element : elements) {
            System.out.print(element + " ");
        }

        // Close the scanner to prevent resource leak
        scanner.close();
    }
}
