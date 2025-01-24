public class Factorial {
    public static void main(String[] args) {
        int num = 6;
        long factorial = calculateFactorial(num);
        System.out.println("Factorial of " + num + " = " + factorial);
        // Display name and student ID
        System.out.println("By PRIYANSHI AGRAWAL 23SCSE1690056");
    }

    public static long calculateFactorial(int num) {
        if (num >= 1) {
            return num * calculateFactorial(num - 1);
        } else {
            return 1;
        }
    }
}


