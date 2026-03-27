class Person {
    String name = "Alex";

    void showPerson() {
        System.out.println("Name: " + name);
    }
}

class Student extends Person {
    int rollNo = 101;

    void showStudent() {
        System.out.println("Roll No: " + rollNo);
    }
}

class GraduateStudent extends Student {
    String specialization = "Computer Science";

    void showGraduate() {
        System.out.println("Specialization: " + specialization);
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        GraduateStudent g = new GraduateStudent();

        g.showPerson();     // from Person
        g.showStudent();    // from Student
        g.showGraduate();   // own method
    }
} 
