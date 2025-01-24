// Interface 1
interface InterfaceA {
    void methodA();
}

// Interface 2
interface InterfaceB {
    void methodB();
}

// Interface 3
interface InterfaceC {
    void methodC();
}

// Class implementing multiple interfaces
public class MultipleInheritanceClass implements InterfaceA, InterfaceB, InterfaceC {
    @Override
    public void methodA() {
        System.out.println("Method from InterfaceA");
    }

    @Override
    public void methodB() {
        System.out.println("Method from InterfaceB");
    }

    @Override
    public void methodC() {
        System.out.println("Method from InterfaceC");
    }

    public static void main(String[] args) {
        MultipleInheritanceClass obj = new MultipleInheritanceClass();

        // Call the interface methods
        obj.methodA();
        obj.methodB();
        obj.methodC();

        // Final message
        System.out.println("Priyanshi Agrawal 23SCSE1690056");
    }
}
