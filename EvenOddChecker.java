import java.util.Scanner;
public class EvenOddChecker {    
 public static void main(String[] args) {         
Scanner scanner = new Scanner(System.in);      
   System.out.print("Enter an integer: ");        
 int number = scanner.nextInt();
        if (number % 2 == 0) {
            System.out.println(number + " is even.");
        } else {

            System.out.println(number + " is odd.");
   System.out.println("By PRIYANSHI AGRAWAL 23SCSE1690056");

        }
    }
} 
