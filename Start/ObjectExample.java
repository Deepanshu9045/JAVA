class Number {
    public int a;
    public int b;
    public static int c; // Static variable shared among all instances
}

public class ObjectExample {
    public static void main(String args[]) {
        Number obj1, obj2, obj3;

        obj1 = new Number();
        obj1.a = 10;
        obj1.b = 20;
        obj1.c = 30;

        obj2 = new Number();
        obj2.a = 100;
        obj2.b = 200;
        obj2.c = 300;

        obj3 = new Number();
        obj3.a = 1000;
        obj3.b = 2000;
        obj3.c = 3000;

        // Display values for obj1
        System.out.println(obj1.a + "\t" + obj1.b + "\t" + Number.c);
        // Display values for obj2
        System.out.println(obj2.a + "\t" + obj2.b + "\t" + Number.c);
        // Display values for obj3
        System.out.println(obj3.a + "\t" + obj3.b + "\t" + Number.c);
    }
}
