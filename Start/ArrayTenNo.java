//PROGRAM TO ENTER 10 NUMBER AND PRINT IT..
import java.util.Scanner;
class ArrayTenNo
{
    public static void main(String args[])
    {
        Scanner Scanner = new Scanner(System.in);
        int number[] =new int [10];
        int i;
        System.out.println("Enter Ten Numbers");
        for(i=0;i<10;i++)
        {
            System.out.println("Number"+(i+1)+":");
            number[i]=Scanner.nextInt();
        }
        
        
        System.out.println("Entered Numbers are");
        for(i=0;i<10;i++)
        {
           System.out.println("Number"+(i+1)+":"+number[i]);
        }
    }
    
}