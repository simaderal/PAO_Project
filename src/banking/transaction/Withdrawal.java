package banking.transaction;

public class Withdrawal extends Transaction{
    private double amount;

    public Withdrawal(String accountNumber, double amount) {
        super(transactionId, amount, date, accountNumber, description);
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Withdrawal of: " + getAmount();
    }
}
