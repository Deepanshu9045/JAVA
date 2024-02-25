//Constructor Using inheritance
class First
{
    private int a;
    public First()
    {
        a=0;
    }
    public First(int x)
    {
        a=x;
    }
    public void puta()
    {
        System.out.print(a);
    }
}
class Second extends First
{
    private int b;
    public Second(int x,int y)
    {
        super(x);
        b=y;
    }
    public void putab()
    {
        puta();
        System.out.print("\t"+b);
    }
}
public class DemoInheritance5
{
    public static void main(String args[])
    {
        Second obj = new Second(10,20);
        obj.putab();
    }
}