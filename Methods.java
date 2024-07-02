package basics;

public class Methods {
    public void greetUser(String name) {
        System.out.println("Hello, " + name + "!");
        System.out.println("WELCOMEs");
    }

    public int getYear() {
        System.out.println("Retrieving the current year...");
        return 2024;
    }

    public static void main(String[] args) {
        Methods  example = new Methods();
        example.greetUser("HARSHINI");

        int currentYear = example.getYear();
        System.out.println("The current year is: " + currentYear);

        if (currentYear % 4 == 0) {
            System.out.println(currentYear + " is a leap year.");
        } else {
            System.out.println(currentYear + " is not a leap year.");
        }
    }
}

