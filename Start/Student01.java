public class Student01 {
    private int roll;    // Private variable to store roll number
    private String name; // Private variable to store student name

    // Accessor method to get the roll number
    public int getroll() {
        return roll;
    }

    // Mutator method to set the roll number
    public void setroll(int roll) {
        this.roll = roll;
    }

    // Accessor method to get the student name
    public String getname() {
        return name;
    }

    // Mutator method to set the student name
    public void setname(String name) {
        this.name = name;
    }

    // Method to display student information
    public void display() {
        System.out.println("Roll number: " + roll);
        System.out.println("Student Name: " + name);
    }
}
