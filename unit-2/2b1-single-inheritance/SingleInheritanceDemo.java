class Person {
    String name;
    int age;

    void displayPersonInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Derived class
class Student extends Person {
    String college;

    void displayStudentInfo() {
        displayPersonInfo(); // calling superclass method
        System.out.println("College: " + college);
    }
}

// Main class to run the program
public class SingleInheritanceDemo {
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "Anitha";
        s.age = 20;
        s.college = "SIST";
        s.displayStudentInfo();
    }
} // Fixed: closing brace was missing in the manual
