import java.util.Scanner;
public class SumOfSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
                System.out.print("Enter the value of x: ");
        int x = scanner.nextInt();
          System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
         int sum = 1; // Start with the first term which is 1
        int term = 1; // This will hold the value of x^i
        for (int i = 1; i <= n; i++) {
            term *= x; // Calculate x^i
            sum += term; // Add x^i to the sum
        }
        System.out.println("Sum of the series is: " + sum);
  scanner.close();
   System.out.println("By PRIYANSHI AGRAWAL 23SCSE1690056");
    }
}
