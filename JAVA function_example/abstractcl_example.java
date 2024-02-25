public class abstractcl_example {
    public static void main(String[] args) {
        child c=new child();
        c.greet();
    }
}
abstract class Base{
    public Base(){
        System.out.println("Constructor of base class");
    }
    public void sayHello(){
        System.out.println("Hello");
    }
    abstract public void greet();
}

class child extends Base{
    public void greet(){
        System.out.println("Good Morning");
    }
}