import java.util.Scanner;
public class prime_example {
    public static void main(String[] args) {
      int count=0;
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter the no: ");
      int num=sc.nextInt();
      sc.close();
      if(num<=1) {System.out.println("prime no is above and equals to 2 so 1 is not a prime"); return; }
      for(int i=2;i<=num;i++){
        if(num%i==0){
            count++;
        }
    }
    if(count>1) System.out.println("Not a prime no");
    else System.out.println("Prime no");
    } 
}
/*
 num=int(input("Enter the number:  "))
prime=True

for i in range(2,num):
      if(num%i==0):
          prime=False
          break
if prime:
    print("This number is Prime")
else:
    print('This number is not prime')
 */
