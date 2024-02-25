//PROGRAM TO ENTER TWO NUBER AND PRINT IT'S SUM
import java.util.Scanner;
public class TwoSum
{
    public static void main(String[] args)
    {
        int a,b,sum;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first Number:");
        a = input.nextInt();
        System.out.print("Enter Second Number:");
        b =input.nextInt();
        sum=a+b;
        System.out.print("Sum of two Numbers=");
        System.out.print(sum);
    }
}