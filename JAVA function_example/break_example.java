import java.util.Scanner;
public class break_example {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int sum=0;
        while(true){
            int num=sc.nextInt();
            //sc.close();
            if(num>0){
                sum+=num;
            }
            else break;
        }
        sc.close();
        System.out.println(sum);
    }
}
