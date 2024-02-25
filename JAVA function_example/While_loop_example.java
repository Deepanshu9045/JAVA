import java.util.Scanner;
public class While_loop_example {
    public static void main(String[] args) {
        //  Basic Example
        int x=1;
        --x;
        while(x<=2){
            System.out.println(x);
            x=x+2;}

    //Sum of n numbers
      Scanner sc =new Scanner(System.in);
      int till=sc.nextInt();
      sc.close();
        int num=0,sum=0;
        while(num<=till){
            sum=sum+num;
            num++;}
        System.out.println(sum);
            


    }
}
