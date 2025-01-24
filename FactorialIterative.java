public class FactorialIterative {
    public static void main(String[] args) {
        int num = 6; // You can change this value to test with other numbers
        long factorial = 1;

        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }

        System.out.println("Factorial of " + num + " = " + factorial);
        System.out.println("By PRIYANSHI AGRAWAL 23SCSE1690056");
    }
}
