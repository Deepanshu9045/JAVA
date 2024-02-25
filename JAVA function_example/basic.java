// Simple Math operations and Value printing
import java.lang.Math;
import java.util.Scanner;

//import java.util.jar.Attributes.Name;
public class basic{
    public static void main(String[] args) {
        //System.out.println("Hello java");
        int a=20;
        int n=1267;
        String strv="Hello Java";
        //Simple Variable value Printing
        System.out.println(strv);
        //Simple addition
        System.out.println(a+n);
        //Simple subtraction
        System.out.println(n-a);
        //Simple multiplication
        System.out.println(a*n);
        //Simple Division
        System.out.println(n/a);
        // % is modulo operator
        System.out.println(n%a);
        int b=12, c=3;
        System.out.println(Math.pow(b,c));
        //Taking User input 
        Scanner sc = new Scanner(System.in);
        String name=sc.nextLine();
        sc.close();
        System.out.println("Hello"+" " +name);
        //String g="abcdef",d="ghijkl";
        //System.out.println(g+d);
 
    }
}