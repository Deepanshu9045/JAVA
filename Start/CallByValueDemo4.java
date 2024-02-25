//CALL BY VALUE SWAPING PROGRAM
class math
{
    void swap(int a,int b)
    {
        int t;
        t=a;
        a=b;
        b=t;
        System.out.println(a+"\t"+b);
    }
    
}
public class CallByValueDemo4
{
    public static void main(String args[])
    {
        int a=10,b=20;
        System.out.println(a+"\t"+b);
        math obj = new math();
        obj.swap(a,b);
        System.out.println(a+"\t"+b);
    }
}