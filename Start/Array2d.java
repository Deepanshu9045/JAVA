//PROGRAM TO ENTERING ELEMENTS FOR 3X3 MATRIX..
import java.util.Scanner;
class Array2d
{
    public static void main(String args[])
    {
        Scanner Scanner=new Scanner(System.in);
        int matrix[][]=new int[3][3];
        int i,j;
        
        System.out.println("Enter the elements");
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                System.out.println("Enter Values("+i+","+j+")");
                matrix [i][j]=Scanner.nextInt();
            }
        }
        
        System.out.println("Entered Matrix");
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        
    }
}