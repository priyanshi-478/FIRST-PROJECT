import java.util.Scanner;
public class KeyboardInput {  
   public static void main(String[] args) {       
  Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name:");         
String name = scanner.nextLine();
        System.out.println("Enter your age:");       
  int age = scanner.nextInt();
        System.out.println("Enter your height in cm:");      
   double height = scanner.nextDouble();
        System.out.println("Name: " + name);
System.out.println("Age: " + age);        
 System.out.println("Height: " + height + " cm");
        scanner.close();
   System.out.println("By PRIYANSHI AGRAWAL 23SCSE1690056");
    }
}
