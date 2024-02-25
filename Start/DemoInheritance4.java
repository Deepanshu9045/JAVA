class Base
{
    public Base()
    {
        System.out.println("\nConstructor of the Base Class");
    }
}
class Derived extends Base
{
    public Derived()
    {
        System.out.println("\nConstructor of the Drived Class");
    }
}
public class DemoInheritance4
{
    public static void main(String args[])
    {
        Derived obj = new Derived();
    }
}