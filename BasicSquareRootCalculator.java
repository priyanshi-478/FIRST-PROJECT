import java.util.Scanner;
public class BasicSquareRootCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        
        // Calculate the square root
        double squareRoot = Math.sqrt(number);
        
        // Print the result
        System.out.println("The square root of " + number + " is: " + squareRoot);
           System.out.println("By PRIYANSHI AGRAWAL 23SCSE1690056");

        scanner.close();
   }
}