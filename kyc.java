package basics;
public class kyc
{
    static KYC customer;
    static class KYC {
         String name;
         String dob;
         String contact;
         String email;
         String aadhaar;
         String pan;
        public KYC(String name, String dob, String contact, String email, String aadhaar, String pan) {
            this.name = name;
            this.dob = dob;
            this.contact = contact;
            this.email = email;
            this.aadhaar = aadhaar;
            this.pan = pan;
        }
        public String getName() {
            return name;
        }
    }
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter your date of birth (dd-mm-yyyy): ");
        String dob = scanner.nextLine();
        System.out.print("Enter your contact number: ");
        String contact = scanner.nextLine();
        System.out.print("Enter your email: ");
        String email = scanner.nextLine();
        System.out.print("Enter your Aadhaar number: ");
        String aadhaar = scanner.nextLine();
        System.out.print("Enter your PAN number: ");
        String pan = scanner.nextLine();
        customer = new KYC(name, dob, contact, email, aadhaar, pan);
        System.out.println("Application submitted successfully for " + customer.getName() + ".");
        scanner.close();
    }
}

