      import java.util.Scanner;
public class SwapWithoutThirdVariables {     public static void main(String[] args) {         Scanner scanner = new Scanner(System.in); System.out.print("Enter the first integer: ");         int firstValue = scanner.nextInt();
System.out.print("Enter the second integer: ");         int secondValue = scanner.nextInt();
System.out.println("Before swapping: firstValue = " + firstValue + ", secondValue = " + secondValue); firstValue = firstValue + secondValue;         secondValue = firstValue - secondValue;         firstValue = firstValue - secondValue;
System.out.println("After swapping: firstValue = " + firstValue + ", secondValue = " + secondValue);
    }
}
