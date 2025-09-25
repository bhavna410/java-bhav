/ Java program to demonstrate super and final keyword

// ---------------- Super Keyword Example ----------------
class Animal {
    String type = "Animal";

    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    String type = "Dog";

    void showType() {
        // Using super to access parent variable
        System.out.println("Parent type: " + super.type);
        System.out.println("Child type: " + type);
    }

    void sound() {
        // Using super to call parent method
        super.sound();
        System.out.println("Dog barks");
    }
}

// ---------------- Final Keyword Example ----------------
class Example {
    // Final variable (cannot be changed)
    final int value = 100;

    // Final method (cannot be overridden in subclass)
    final void display() {
        System.out.println("This is a final method.");
    }
}

// Subclass trying to override final method
class Test extends Example {
    // ❌ Not allowed: cannot override final method
    // void display() { System.out.println("Overridden"); }
    
    void showValue() {
        // value = 200;  // ❌ Not allowed: cannot change final variable
        System.out.println("Final variable value = " + value);
    }
}

// ---------------- Main Class ----------------
class SuperFinalDemo {
    public static void main(String[] args) {
        
        // Super keyword demo
        Dog d = new Dog();
        d.showType();
        d.sound();

        // Final keyword demo
        Test t = new Test();
        t.showValue();
        t.display();  // Calls final method from parent
    }
}