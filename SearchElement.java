import java.util.Scanner;
public class SearchElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Input the array size
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        
        // Declare the array
        int[] array = new int[size];
        
        // Input the elements of the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        
        // Input the element to search for
        System.out.print("Enter the element to search for: ");
        int searchElement = scanner.nextInt();
        
        // Search for the element in the array
        boolean found = false;
        for (int i = 0; i < size; i++) {
            if (array[i] == searchElement) {
                System.out.println("Element " + searchElement + " found at index " + i);
                found = true;
                break;
            }
        }
        
        if (!found) {
            System.out.println("Element " + searchElement + " not found in the array.");
        }
        
        scanner.close();
   System.out.println("By PRIYANSHI AGRAWAL 23SCSE1690056");
    }
}
