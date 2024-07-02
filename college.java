
package basics;
class Course {
    public void student() {
        String name = "HARSHINI";
        System.out.println("dept name");
    }
}

class Name extends Course {
    public void staff() {
        String name = "ABI";
        System.out.println("obj");
    }
}

class RollNo extends Name {
    public void teacher() {
        String name = "ANU";
        System.out.println("class");
    }
}

public class college
{
    public static void main(String[] args) {
        RollNo c1 = new RollNo();
        c1.student();
        c1.staff();
        c1.teacher();
    }


    protected void student() {
    }

    }





