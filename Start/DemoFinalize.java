class Complex
{
    private int real,imag;
    public Complex()
    {
        real=10;
        imag=20;
    }
    protected void finalize()
    {
        System.out.println(real + "\t" + imag);
    }
}
public class DemoFinalize
{
    public static void display()
    {
        Complex obj=new Complex();
    }
    public static void main(String args[])
    {
        display();
        System.gc();
    }
}