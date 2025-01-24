abstract class Shape {
    abstract void printArea();
}

class Rectangle extends Shape {
    int length;
    int width;

    Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    @Override
    void printArea() {
        int area = length * width;
        System.out.println("Area of Rectangle: " + area);
    }
}

class Triangle extends Shape {
    int base;
    int height;

    Triangle(int base, int height) {
        this.base = base;
        this.height = height;
    }

    @Override
    void printArea() {
        double area = 0.5 * base * height;
        System.out.println("Area of Triangle: " + area);
    }
}

class Circle extends Shape {
    int radius;

    Circle(int radius) {
        this.radius = radius;
    }

    @Override
    void printArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + area);
    }
}

public class Main3 {
    public static void main(String[] args) {
        // Creating instances of each shape
        Rectangle rectangle = new Rectangle(10, 5);
        rectangle.printArea();

        Triangle triangle = new Triangle(10, 5);
        triangle.printArea();

        Circle circle = new Circle(7);
        circle.printArea();

        // Final message
        System.out.println("Priyanshi Agrawal 23SCSE1690056");
    }
}
