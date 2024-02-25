import java.util.Scanner ;
//import java.util.logging.Level;
import java.util.Date;
public class reverse_str_example {
    public static void main(String[] args)throws InterruptedException {
       String revstr="";
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter the String--> ");
       String str=sc.nextLine();
       sc.close();
       for(int i=0;i<str.length();i++){
       revstr=str.charAt(i)+revstr;
       }
       System.out.println("Reversed string is: "+ revstr);
       try{
       System.out.println("Now we will check for palindrome");
       System.out.println("Current date "+new Date());
       Thread.sleep(3000);
       if(revstr.equals(str)) {System.out.println("String is palindrome");}
       else System.out.println("String is not palindrome");
       System.out.println("Current date now: "+ new Date());
       }
       catch(Exception e){
        System.out.println(e);
       }
    }
}
