import java.util.Scanner;
public class ReverseAndSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a number:");
        int num = scanner.nextInt();
        
        int reversedNumber = 0;
        int sumOfDigits = 0;
        int originalNumber = num;
        
        while (num != 0) {
            int digit = num % 10;
            reversedNumber = reversedNumber * 10 + digit;
            sumOfDigits += digit;
            num /= 10;
        }
        
        System.out.println("Original Number: " + originalNumber);
        System.out.println("Reversed Number: " + reversedNumber);
        System.out.println("Sum of Digits: " + sumOfDigits);
           System.out.println("By PRIYANSHI AGRAWAL 23SCSE1690056");
        scanner.close();
    }
}
