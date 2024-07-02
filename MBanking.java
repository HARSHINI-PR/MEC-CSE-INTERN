package basics;
class Account {
    String accountNumber;
    String accountBalance;
    String accountHolder;
    public Account(String accountNumber, String accountBalance, String accountHolder) {
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.accountHolder = accountHolder;
    }
    public void withdraw(String amount) {
        double balance = Double.parseDouble(accountBalance);
        double withdrawAmount = Double.parseDouble(amount);
        if (withdrawAmount <= balance) {
            System.out.println("Withdrawal approved.");
            balance -= withdrawAmount;
            accountBalance = Double.toString(balance);
        } else {
            System.out.println("Insufficient balance.");
        }
    }
}
class DebitCard extends Account {
    String cardNumber;
    String cardPin;
    public DebitCard(String accountNumber, String accountBalance, String accountHolder, String cardNumber, String cardPin) {
        super(accountNumber, accountBalance, accountHolder);
        this.cardNumber = cardNumber;
        this.cardPin = cardPin;
    }
    public void validateAndWithdraw(String amount, String enteredPin) {
        if (enteredPin.equals(cardPin)) {
            withdraw(amount);
        } else {
            System.out.println("Invalid PIN.");
        }
    }
}
class GPay extends Account {
    String upiPin;
    String username;
    public GPay(String accountNumber, String accountBalance, String accountHolder, String upiPin, String username) {
        super(accountNumber, accountBalance, accountHolder);
        this.upiPin = upiPin;
        this.username = username;
    }
    public void validateAndPayBill(String billerName, String billedAmount, String enteredUpiPin) {
        if (enteredUpiPin.equals(upiPin)) {
            withdraw(billedAmount);
            System.out.println("Payment approved to " + billerName + " of amount $" + billedAmount);
        } else {
            System.out.println("Invalid UPI PIN.");
        }
    }
}
public class MBanking {
    public static void main(String[] args) {
        DebitCard debitCard = new DebitCard("123456789", "1000.0", "John Doe", "1234 5678 9101 1121", "1234");
        debitCard.validateAndWithdraw("50.0", "1234");
        debitCard.validateAndWithdraw("50.0", "1111");
        GPay gpay = new GPay("123456789", "1000.0", "John Doe", "123456", "johndoe@gmail.com");
        gpay.validateAndPayBill("Utility Company", "50.0", "123456");
        gpay.validateAndPayBill("Internet Provider", "80.0", "654321");
    }
}
