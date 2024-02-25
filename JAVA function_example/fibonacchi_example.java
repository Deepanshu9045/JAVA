import java.util.Scanner;
public class fibonacchi_example {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of fibonacci series: ");
        int n=sc.nextInt();
        sc.close();
        int ft=0,st=1;
        int nxtt;
        System.out.print("Fibonacci series till "+ n +" terms:");
        for(int i=1;i<=n;i++){
            System.out.print(ft+",");
            nxtt=ft+st;
            ft=st;
            st=nxtt;
        }
    }
}
 