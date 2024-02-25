import java.util.Scanner;

public class NumberPrint {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[10];
        int i;// Array to store the entered numbers
        
        System.out.println("Enter 10 numbers:");

        // Loop to input 10 numbers
        for (i = 0; i < arr.length; i++) 
        {
            arr[i]=input.nextInt();
        }

        // Printing the entered numbers
        System.out.println("Entered numbers:");
        for (i = 0; i < arr.length; i++) {
            System.out.println( arr[i]);
        }int a=arr.length;

    ;
    }
}
