class number
{
    public int a,b;
}
class math
{
    public void swap(number objx)
    {
        int t;
        t=objx.a; 
        objx.a=objx.b;
        objx.b=t;
        System.out.println(objx.a+"\t"+objx.b);
    }
}
public class CallByReferenceDemo5
{
    public static void main(String args[])
    {
        number obj = new number();
        obj.a=10;
        obj.b=20;
        System.out.println(obj.a+"\t"+obj.b);
        math m = new math();
        m.swap(obj);
        System.out.println(obj.a+"\t"+obj.b);
    }
}