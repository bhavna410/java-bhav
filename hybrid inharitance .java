// Java program for Hybrid Inheritance using Interface + Classes

// Interface
interface Animal {
    void eat();
}

// Parent class
class Mammal implements Animal {
    public void eat() {
        System.out.println("Mammal can eat.");
    }
    void walk() {
        System.out.println("Mammal can walk.");
    }
}

// Child class
class Dog extends Mammal {
    void bark() {
        System.out.println("Dog can bark.");
    }
}

// Main class
class HybridInheritanceDemo {
    public static void main(String[] args) {
        Dog d = new Dog();
        
        // Methods from child
        d.bark();
        
        // Methods from parent class
        d.walk();
        
        // Method from interface implemented in parent
        d.eat();
    }