class Base {
    public int a = 10;
}

public class SUPER extends Base {
    public int a = 20;

    public void display() {
        int a = 30;
        System.out.println(a);         // Local variable a
        System.out.println(this.a);    // Class-level variable a in Demo
        System.out.println(super.a);   // Class-level variable a in Base
    }

    public static void main(String[] args) { // Use the correct main method signature
        SUPER obj = new SUPER();
        obj.display();
    }
}
