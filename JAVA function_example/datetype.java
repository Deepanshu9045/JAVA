import java.time.LocalDateTime;
public class datetype {
    public static void main(String[] args) {
        long st=System.nanoTime();
       LocalDateTime ldt = LocalDateTime.now();
       System.out.println(ldt);
       System.out.println(ldt.getHour());
       System.out.println(ldt.getSecond());
       long ft=System.nanoTime();
       long et=ft-st;
       double seconds=(double) et/1000000000.0; //Narrowing Casting or Explicit :Conversion of larger datatype into smaller datatype
       System.out.println("Running time: "+ seconds +" seconds");
    }
}
