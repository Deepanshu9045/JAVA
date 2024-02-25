import java.util.Scanner;
class date
{
    private int dd,mm,yy;
    date()
    {
        dd=1;
        mm=1;
        yy=1900;
    }
    public void getDate(int d,int m,int y)
    {
        dd=d;
        mm=m;
        yy=y;
    }
    public void putDate()
    {
        System.out.print(dd+"/"+mm+"/"+yy);
    }
}
class Student 
{
    int rollno;
    String name;
    date dob;
    Student()
    {
        rollno=0;
        name="";
        dob=new date();
    }
    public void getVal()
    {
        int d,m,y;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter name :");
        name=input.nextLine();
        System.out.println("Enter rollno :");
        rollno=input.nextInt();
        System.out.println("Enter Date of Birth :");
        System.out.print("Day :");
        d=input.nextInt();
        System.out.print("Month :");
        m=input.nextInt();
        System.out.print("Year :");
        y=input.nextInt();
        dob.getDate(d,m,y);
    }
    public void putVal()
    {
        System.out.print(rollno + "\t" + name + "\t");
        dob.putDate();
    }
}
public class DemoContainer
{
    public static void main(String args[])
    {
        Student obj = new Student();
        obj.getVal();
        obj.putVal();
    }
}