package basics;

class Student {
    public void displayDetails() {
        System.out.println("Student details:");
    }
}
class UndergraduateStudent extends Student {
    @Override
    public void displayDetails() {
        System.out.println("Undergraduate Student details: Name: John Doe, Age: 20, Major: Computer Science");
    }
}
class GraduateStudent extends Student {
    @Override
    public void displayDetails() {
        System.out.println("Graduate Student details: Name: Jane Smith, Age: 25, Research Area: Artificial Intelligence");
    }
}
public class overriding_poly {
    public static void main(String[] args) {
        Student undergrad = new UndergraduateStudent();
        Student grad = new GraduateStudent();
        undergrad.displayDetails();
        grad.displayDetails();
    }
}

