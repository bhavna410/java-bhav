// Java program to demonstrate Single Inheritance

// Parent class (also called Superclass / Base class)
class Animal {
    
    // method of parent class
    void eat() {
        System.out.println("Animal can eat.");
    }
}

// Child class (also called Subclass / Derived class)
// It inherits from Animal
class Dog extends Animal {
    
    // method of child class
    void bark() {
        System.out.println("Dog can bark.");
    }
}

// Main class to run the program
class SingleInheritanceDemo {
    public static void main(String[] args) {
        
        // Creating object of child class
        Dog d = new Dog();
        
        // Child can use its own method
        d.bark();
        
        // Child can also use Parent's method (because of inheritance)
        d.eat();
    }
}