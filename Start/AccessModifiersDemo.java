// Class with different access modifiers
public class AccessModifiersDemo {

    // Public field accessible from anywhere
    public int publicField = 10;

    // Protected field accessible within its own package and by subclasses
    protected int protectedField = 20;

    // Default (package-private) field accessible only within its own package
    int defaultField = 30;

    // Private field accessible only within this class
    private int privateField = 40;

    // Public constructor
    public AccessModifiersDemo() {
        System.out.println("This is a public constructor.");
    }

    // Protected method accessible within its own package and by subclasses
    protected void protectedMethod() {
        System.out.println("This is a protected method.");
    }

    // Default (package-private) method accessible only within its own package
    void defaultMethod() {
        System.out.println("This is a default method.");
    }

    // Private method accessible only within this class
    private void privateMethod() {
        System.out.println("This is a private method.");
    }

    // Main method to demonstrate access modifiers
    public static void main(String[] args) {
        AccessModifiersDemo demo = new AccessModifiersDemo();

        System.out.println("Public field: " + demo.publicField);
        System.out.println("Protected field: " + demo.protectedField);
        System.out.println("Default field: " + demo.defaultField);
        System.out.println("Private field: " + demo.privateField);

        demo.publicMethod();
        demo.protectedMethod();
        demo.defaultMethod();
        demo.privateMethod();
    }

    // Public method accessible from anywhere
    public void publicMethod() {
        System.out.println("This is a public method.");
    }
}
