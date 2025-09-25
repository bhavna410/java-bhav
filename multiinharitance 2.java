// First interface
interface A {
    void show();
}

// Second interface
interface B {
    void display();
}

// Child class implements multiple interfaces
class C implements A, B {
    public void show() {
        System.out.println("Show method from Interface A");
    }

    public void display() {
        System.out.println("Display method from Interface B");
    }
}

// Main class
class MultipleInheritanceDemo {
    public static void main(String[] args) {
        C obj = new C();
        obj.show();
        obj.display();
    }
}