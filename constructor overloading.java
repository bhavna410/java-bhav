// Java program to demonstrate Constructor Overloading

class Student {
    String name;
    int age;

    // Constructor 1: No arguments
    Student() {
        name = "Unknown";
        age = 0;
    }

    // Constructor 2: One argument
    Student(String n) {
        name = n;
        age = 0;
    }

    // Constructor 3: Two arguments
    Student(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

// Main class
class ConstructorOverloadingDemo {
    public static void main(String[] args) {
        
        // Using different constructors
        Student s1 = new Student();              // No-arg constructor
        Student s2 = new Student("Anamika");     // One-arg constructor
        Student s3 = new Student("Rohit", 21);   // Two-arg constructor

        // Display details
        s1.display();
        s2.display();
        s3.display();
    }
}