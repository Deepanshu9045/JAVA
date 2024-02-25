import java.util.Scanner;
class Date
{
    private int dd,mm,yy;
    public void getDate(int d,int m,int y)
    {
        dd=d;
        mm=m;
        yy=y;
        
    }
    public void putDate()
    {
        System.out.println(dd+"/"+mm+"/"+yy);
    }
}
class student extends Date
{
    int rollno;
    String name;
    Scanner input=new Scanner(System.in);
    student()
    {
        rollno=0;
        name="";
        
    }
    public void getVal()
    {
        int d,m,y;
        System.out.println("Enter Name:");
        name=input.nextLine();
        System.out.println("Enter Roll No:");
        rollno=input.nextInt();
        System.out.println("Enter DOB:");
        System.out.println("Day:");
        d=input.nextInt();
        System.out.println("Month:");
        m=input.nextInt();
        System.out.println("Year:");
        y=input.nextInt();
        getDate(d,m,y);
    }
    public void putVal()
    {
        System.out.print(rollno+"\t"+name+"\t");
        putDate();
    }
}
public class DemoInheritance2
{
    public static void main(String args[])
    {
        student obj = new student();
        obj.getVal();
        obj.putVal();
    }
}