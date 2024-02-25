public class Student {
    private String name;
    private int age;

    // Default constructor
    public Student() {
        name = "Unknown";
        age = 0;
    }

    // Parameterized constructor
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy constructor
    public Student(Student other) {
        this.name = other.name;
        this.age = other.age;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        // Default Constructor
        Student student1 = new Student();
        System.out.println("Default Constructor Output:");
        student1.displayInfo();
        System.out.println();

        // Parameterized Constructor
        Student student2 = new Student("Alice", 20);
        System.out.println("Parameterized Constructor Output:");
        student2.displayInfo();
        System.out.println();

        // Copy Constructor
        Student student3 = new Student(student2);
        System.out.println("Copy Constructor Output:");
        student3.displayInfo();
    }
}
