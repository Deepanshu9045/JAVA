import java.util.Scanner;
public class ap_example {
    static void ap(int a,int d,int n){
        int curr;
        curr=a;
        for(int i=1;i<=n;i++){
            System.out.print(curr+" ");
            curr+=d;
        }
    }

    public static void main(String[] args) {
        
    Scanner sc =new Scanner(System.in);
    System.out.print("Enter first term: ");
    int x=sc.nextInt();
    System.out.print("Enter common difference: ");
    int y=sc.nextInt();
    System.out.print("Enter nth term: ");
    int z=sc.nextInt();
    sc.close();
    ap(x,y,z);

        
    }
}
