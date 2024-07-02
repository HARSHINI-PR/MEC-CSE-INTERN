package basics;

public class method1
{
    public void greetUser(String name) {
        System.out.println("Hello, " + name + "!");
        System.out.println("Welcome to our program.");
    }
    public int getYear() {
        System.out.println("Retrieving the current year...");
        return 2023;
    }

    public static void main(String[] args) {
        Methods example = new Methods();
        example.greetUser("Alice");
        int currentYear = example.getYear();
        System.out.println("The current year is: " + currentYear);

        if (currentYear % 4 == 0) {
            System.out.println(currentYear + " is a leap year.");
        } else {
            System.out.println(currentYear + " is not a leap year.");
        }
    }
}