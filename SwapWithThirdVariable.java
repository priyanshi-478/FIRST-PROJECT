import java.util.Scanner;
public class SwapWithThirdVariable {  
   public static void main(String[] args) {     
    Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first integer: ");    
     int firstValue = scanner.nextInt();
System.out.print("Enter the second integer: ");    
     int secondValue = scanner.nextInt();
System.out.println("Before swapping: firstValue = " + firstValue + ", secondValue = " + secondValue);
int temp = firstValue;         firstValue = secondValue;         secondValue = temp;
System.out.println("After swapping: firstValue = " + firstValue + ", secondValue = " + secondValue);
   System.out.println("By PRIYANSHI AGRAWAL 23SCSE1690056");

    }
}
