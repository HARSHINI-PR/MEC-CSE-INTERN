package basics;

class StudentProfile {
    public void addDetail(String name) {
        System.out.println("Student Name: " + name);
    }
    public void addDetail(int age) {
        System.out.println("Student Age: " + age);
    }
    public void addDetail(double gpa) {
        System.out.println("Student GPA: " + gpa);
    }
    public void addDetail(boolean isEnrolled) {
        System.out.println("Student Enrollment Status: " + (isEnrolled ? "Enrolled" : "Not Enrolled"));
    }
}

public class overloading_polymophism {
    public static void main(String[] args) {
        StudentProfile student = new StudentProfile();
        student.addDetail("Alice Johnson");
        student.addDetail(20);
        student.addDetail(3.9);
        student.addDetail(true);
    }
}
