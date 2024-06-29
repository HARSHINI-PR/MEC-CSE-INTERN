package basics;
class SIPCalculator {
    static double expectedReturnsInPer = 8.0;
    double monthlyInvestment;
    int periodInYears;
    public SIPCalculator(double monthlyInvestment, int periodInYears) {
        this.monthlyInvestment = monthlyInvestment;
        this.periodInYears = periodInYears;
    }
    public SIPDetails calculateSIPDetails() {
        double principalAmount = monthlyInvestment * 12 * periodInYears;
        double estimatedReturns = principalAmount * (expectedReturnsInPer / 100);
        double totalAmount = principalAmount + estimatedReturns;
        return new SIPDetails(principalAmount, estimatedReturns, totalAmount);
    }
    static class SIPDetails {
        double principalAmount;
        double estimatedReturns;
        double totalAmount;
        public SIPDetails(double principalAmount, double estimatedReturns, double totalAmount) {
            this.principalAmount = principalAmount;
            this.estimatedReturns = estimatedReturns;
            this.totalAmount = totalAmount;
        }
    }

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter monthly investment amount: ");
        double monthlyInvestment = scanner.nextDouble();
        System.out.print("Enter expected returns percentage per annum: ");
        double expectedReturns = scanner.nextDouble();
        expectedReturnsInPer = expectedReturns; // Update static variable
        System.out.print("Enter investment period in years: ");
        int periodInYears = scanner.nextInt();
        SIPCalculator calculator = new SIPCalculator(monthlyInvestment, periodInYears);
        SIPDetails sipDetails = calculator.calculateSIPDetails();
        System.out.println("Principal Amount: " + sipDetails.principalAmount);
        System.out.println("Estimated Returns: " + sipDetails.estimatedReturns);
        System.out.println("Total Amount: " + sipDetails.totalAmount);
        scanner.close();
    }
}

