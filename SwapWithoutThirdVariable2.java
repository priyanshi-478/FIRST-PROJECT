import java.util.Scanner;

public class SwapWithoutThirdVariable2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user input 
        System.out.print("Enter the first integer: ");
        int firstValue = scanner.nextInt();
        
        System.out.print("Enter the second integer: ");
        int secondValue = scanner.nextInt();
        
        // Display initial values
        System.out.println("Before swapping: firstValue = " + firstValue + ", secondValue = " + secondValue);
        
        // Swap values without a third variable
        firstValue = firstValue + secondValue;
        secondValue = firstValue - secondValue;
        firstValue = firstValue - secondValue;

        // Display final values
        System.out.println("After swapping: firstValue = " + firstValue + ", secondValue = " + secondValue);
        System.out.println("By PRIYANSHI AGRAWAL 23SCSE1690056");
        
        scanner.close();
    }
}

