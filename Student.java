class Student {
    // Instance variables
    String name;
    int roll_no;
    int marks;
    
    // Constructor to initialize instance variables
    Student(String n, int r, int m) {
        name = n;
        roll_no = r;
        marks = m;
    }
    
    // Method to set instance variables
    void setDetails(String n, int r, int m) {
        name = n;
        roll_no = r;
        marks = m;
    }
    
    // Method to display student's details along with additional specified output
    void show() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + roll_no);
        System.out.println("Marks: " + marks);
        System.out.println("Priyanshi Agrawal 23SCSE1690056");  // Specified output
    }

    public static void main(String[] args) {
        // Initialize using constructor
        Student student1 = new Student("Alice", 101, 90);
        
        // Initialize using method
        Student student2 = new Student("", 0, 0);
        student2.setDetails("Bob", 102, 85);
        
        // Initialize using reference
        Student student3 = new Student("", 0, 0);
        student3.name = "Charlie";
        student3.roll_no = 103;
        student3.marks = 88;
        
        // Display details
        student1.show();
        System.out.println();
        student2.show();
        System.out.println();
        student3.show();
    }
}
