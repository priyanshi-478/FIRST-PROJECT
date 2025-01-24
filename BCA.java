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
public class BCA extends Student {
    public void showAdditionalInfo() {
        System.out.println("BCA Class Accessing Inherited Members:");
        System.out.println("Public Info: " + publicInfo); // Accessible
        System.out.println("Protected Info: " + protectedInfo); // Accessible via inheritance
        // Default and Private Info not accessible here directly
    }

    public static void main(String[] args) {
        // Simple Inheritance Test
        Student student = new Student();
        student.displayInfo();

        // Multilevel Inheritance Test
        BCA bca = new BCA();
        bca.showAdditionalInfo();
        
        // Hierarchical Inheritance Test
        Undergraduate ug = new Undergraduate();
        ug.show();
        
        Postgraduate pg = new Postgraduate();
        pg.show();

        // Final message
        System.out.println("Priyanshi Agrawal 23SCSE1690056");
    }
}


