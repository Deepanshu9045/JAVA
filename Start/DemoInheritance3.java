class First
{
    public int a;
}
class Second extends First
{
    public int b;
}
class Third extends First
{
    public int c;
}
public class DemoInheritance3
{
    public static void main(String args[])
    {
        Second obj1 = new Second();
        Third obj2 = new Third();
        obj1.a=10;
        obj1.b=20;
        obj2.a=30;
        obj2.c=40;
        System.out.println(obj1.a+"\t"+obj1.b);
        System.out.println(obj2.a+"\t"+obj2.c);
    }
}