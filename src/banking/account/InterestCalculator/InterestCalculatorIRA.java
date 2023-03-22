package banking.account.InterestCalculator;

//Decorator Pattern
public class InterestCalculatorIRA extends InterestCalculatorInterface {
    public double calculateInterest(double balance) {
        return balance * 0.05;
    }
}
}
