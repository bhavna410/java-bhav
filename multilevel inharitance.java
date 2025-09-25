// Java program for Multi-Level Inheritance

// Grandparent / Base class
class Animal {
    void eat() {
        System.out.println("Animal can eat.");
    }
}

// Parent / Child class
class Mammal extends Animal {
    void walk() {
        System.out.println("Mammal can walk.");
    }
}

// Child / Grandchild class
class Dog extends Mammal {
    void bark() {
        System.out.println("Dog can bark.");
    }
}

// Main class
class MultiLevelInheritanceDemo {
    public static void main(String[] args) {
        Dog d = new Dog();
        
        // Dog can use its own method
        d.bark();
        
        // Dog can use parent method
        d.walk();
        
        // Dog can use grandparent method
        d.eat();
    }
}