package MyPackage;

public class Student2 {
    public String publicInfo = "Public Info"; // Public access
    protected String protectedInfo = "Protected Info"; // Protected access
    String defaultInfo = "Default Info"; // Default access
    private String privateInfo = "Private Info"; // Private access

    public void displayInfo() {
        System.out.println("Public: " + publicInfo);
        System.out.println("Protected: " + protectedInfo);
        System.out.println("Default: " + defaultInfo);
        System.out.println("Private: " + privateInfo);
    }

    void inheritedMethod() {
        System.out.println("Inherited Method from Student");
    }
}

// Hierarchical Inheritance Example
class Undergraduate extends Student {
    public void show() {
        System.out.println("Undergraduate Class");
        inheritedMethod();
    }
}

class Postgraduate extends Student {
    public void show() {
        System.out.println("Postgraduate Class");
        inheritedMethod();
    }
}


