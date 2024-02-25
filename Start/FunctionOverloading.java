//function overloading
class Math
{
    public void area(int l,int b)
    {
        int a;
        a=l*b;
        System.out.println("Area of Rectangle = " + a);
    }
    public void area(int s)
    {
        int a;
        a=s*s;
        System.out.println("Area of Square = "+a);
    }
    public void area(double r)
    {
        double a;
        a=3.14*r*r;
        System.out.println("Area of Circle = "+a);
    }
}
public class FunctionOverloading
{
    public static void main(String args[])
    {
        Math obj = new Math();
        obj.area(10,20);
        obj.area(40);
        obj.area(10.4);
    }
}