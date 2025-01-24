class OverloadDemo {
    // Method to add two integers
    void add(int a, int b) {
        int result = a + b;
        System.out.println("Adding two integers: " + result);
    }

    // Method to add three integers
    void add(int a, int b, int c) {
        int result = a + b + c;
        System.out.println("Adding three integers: " + result);
    }

    // Method to add two doubles
    void add(double a, double b) {
        double result = a + b;
        System.out.println("Adding two doubles: " + result);
    }

    public static void main(String[] args) {
        OverloadDemo overloadDemo = new OverloadDemo();

        // Calling the methods
        overloadDemo.add(10, 20);          // Two integers
        overloadDemo.add(10, 20, 30);      // Three integers
        overloadDemo.add(10.5, 20.5);      // Two doubles

        // Output only once at the end
        System.out.println("Priyanshi Agrawal 23SCSE1690056");
    }
}
