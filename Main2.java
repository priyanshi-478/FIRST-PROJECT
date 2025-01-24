abstract class Shape {
    int length;
    int width;

    Shape(int length, int width) {
        this.length = length;
        this.width = width;
    }

    // Abstract method to be implemented by subclasses
    abstract void printArea();
}

class Rectangle extends Shape {
    Rectangle(int length, int width) {
        super(length, width);
    }

    @Override
    void printArea() {
        int area = length * width;
        System.out.println("Area of Rectangle: " + area);
    }
}

class Main2 {
    public static void main(String[] args) {
        // Creating an instance of Rectangle
        Rectangle rectangle = new Rectangle(10, 5);
        rectangle.printArea();

        // Final message
        System.out.println("Priyanshi Agrawal 23SCSE1690056");
    }
}
