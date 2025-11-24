// Classes & Objects - Question 3: Student Class
// Author: S08-8511-2024
// Date: Nov 24, 2025

public class Student {
    // Attributes
    String name;
    double marks;

    // Constructor
    public Student(String name, double marks) {
        this.name = name;
        this.marks = marks;
    }

    // Method to display student details
    public void displayDetails() {
        System.out.println("Student Name: " + name + ", Marks: " + marks);
    }
}
