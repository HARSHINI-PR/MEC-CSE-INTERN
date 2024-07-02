package basics;
public class Conditional {
    public static void main(String[] args) {
            java.util.Scanner scanner = new java.util.Scanner(System.in);
            System.out.print("Enter your age: ");
            int age = scanner.nextInt();
            System.out.print("Enter your caste (General/SC/ST/OBC): ");
            String caste = scanner.next();
            System.out.print("Enter your location (Urban/Rural): ");
            String location = scanner.next();
            if (age >= 18 && age <= 35) {
                System.out.println("You are eligible based on age.");
            } else {
                System.out.println("You are not eligible based on age.");
            }
            int applicationAmount;
            switch (caste.toUpperCase()) {
                case "SC":
                case "ST":
                    applicationAmount = 50;
                    break;
                case "OBC":
                    applicationAmount = 100;
                    break;
                case "GENERAL":
                    applicationAmount = 150;
                    break;
                default:
                    applicationAmount = 200;
                    System.out.println("Invalid caste entered, applying default charges.");
                    break;
            }
            if (location.equalsIgnoreCase("Rural")) {
                applicationAmount -= 20;
                if (applicationAmount < 50) {
                    applicationAmount = 50;
                }
            }
            System.out.println("Your application amount is: " + applicationAmount);
        }
    }
