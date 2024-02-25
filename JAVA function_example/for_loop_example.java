import java.util.Scanner;
public class for_loop_example {
    public static void main(String[] args) {
       //Simple For Loop
        for(int x=1;x<3;x++)
        System.out.println(x);
        System.out.println("--------------------------");
       //For loop with Break statement
       for(int x=1;x<10;x++){
        System.out.println(x);
        if(x==4) break;
       }
       System.out.println("--------------------------");
       //For loop with continue 
       for(int x=1;x<6;x++){
        if(x==4) continue;
       System.out.println(x);}
    //Factorial
    System.out.println("--------------------------");
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the number: ");
    int lim =sc.nextInt();
    sc.close();
    if(lim==1 && lim==0) System.out.println(1);
    else{
    int fact=1;
    for(int x=1;x<=lim;x++){
    fact*=x;}
    System.out.println("The Factorial of "+ lim + " is " + fact);
    }

    
    }

}
