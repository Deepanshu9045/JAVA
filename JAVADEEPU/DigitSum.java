//PROGRAM TO ENTER THREE DIGIT NUMBER AND PRINT THE SUM OF IT'S DIGITS
import java.util.Scanner;
class DigitSum
{
    public static void main(String[] args)
    {
        int n,a,b,c,sum;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the three digit number:");
        n = input.nextInt();
        a=n%10;
        n=n/10;
        b=n%10;
        n=n/10;
        c=n%10;
        sum=a+b+c;
        System.out.print("Sum of it's three digit:" +sum);
        
    }
}