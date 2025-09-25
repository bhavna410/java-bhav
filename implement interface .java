// Interface definition
interface Shape {
    void draw();  // abstract method (no body)
    double area();  // abstract method
}

// Class implementing interface
class Circle implements Shape {
    double radius;

    // Constructor
    Circle(double r) {
        radius = r;
    }

    // Must implement methods of interface
    public void draw() {
        System.out.println("Drawing Circle");
    }

    public double area() {
        return 3.14 * radius * radius;
    }
}

class Rectangle implements Shape {
    double length, breadth;

    Rectangle(double l, double b) {
        length = l;
        breadth = b;
    }

    public void draw() {
        System.out.println("Drawing Rectangle");
    }

    public double area() {
        return length * breadth;
    }
}

// Main class
class InterfaceDemo {
    public static void main(String[] args) {
        Shape s1 = new Circle(5);      // Using interface reference
        s1.draw();
        System.out.println("Area of Circle: " + s1.area());

        Shape s2 = new Rectangle(4, 6);
        s2.draw();
        System.out.println("Area of Rectangle: " + s2.area());
    }
}