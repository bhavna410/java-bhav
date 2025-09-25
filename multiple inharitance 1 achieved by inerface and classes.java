// First parent class
class A {
    void show() {
        System.out.println("Class A show() method");
    }
}

// Second parent class
class B {
    void show() {
        System.out.println("Class B show() method");
    }
}

// Child class trying to inherit from both A and B
class C extends A, B {   // ❌ ERROR
    public static void main(String[] args) {
        C obj = new C();
        obj.show();
    }
}