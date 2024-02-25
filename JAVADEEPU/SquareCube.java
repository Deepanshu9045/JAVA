//PROGRAM TO ENTER NUMBER AND PRINT IT'S SQUARE AND CUBE
import java.util.Scanner;
public class SquareCube
{
    public static void main(String[] args)
    {
        int a,square,cube;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number:");
        a=input.nextInt();
        square=a*a;
        System.out.println("Square of a entered number is=" +square);
        cube=a*a*a;
        System.out.print("Cube of a entered number is=" +cube);
    }
}