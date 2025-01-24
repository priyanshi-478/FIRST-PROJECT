interface Interface1 {
 void method1();
}
// Interface2 declaration
interface Interface2 {
 void method2();
}
// Interface3 declaration
interface Interface3 {
 void method3();
}
// Base class declaration
class BaseClass {
 public void baseMethod() {
 System.out.println("This is a method in the BaseClass.");
 }
}
// Derived class implementing three interfaces and extending one base class
class DerivedClass extends BaseClass implements Interface1, Interface2, Interface3 {
 // Implementing method from Interface1
 public void method1() {
 System.out.println("Implementation of method1 from Interface1.");
 }
 // Implementing method from Interface2
 public void method2() {
 System.out.println("Implementation of method2 from Interface2.");
 }
// Implementing method from Interface3
public void method3() {
 System.out.println("Implementation of method3 from Interface3.");
 }
 // Additional method in DerivedClass
 public void derivedMethod() {
 System.out.println("This is a method in the DerivedClass.");
 }
}
// Main class to test the implementation
public class main {
 public static void main(String[] args) {
 // Creating an instance of DerivedClass
 DerivedClass obj = new DerivedClass();
 // Calling methods from BaseClass
 obj.baseMethod(); // Method from BaseClass
 // Calling methods from interfaces
 obj.method1(); // Method from Interface1
 obj.method2(); // Method from Interface2
 obj.method3(); // Method from Interface3
 // Calling method from DerivedClass
 obj.derivedMethod(); // Method from DerivedClass
 // Author info
 System.out.println("By Priyanshi Agrawal 23SCSE1690056");
 }
}
