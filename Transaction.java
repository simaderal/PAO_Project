public abstract class Transaction {
    private double amount;
    private String description;

    public Transaction(double amount, String description) {
        this.amount = amount;
        this.description = description;
    }

    public double getAmount() {
        return amount;
    }

    public String getDescription() {
        return description;
    }

    public abstract void execute(Account account);

    public void transfer(Account fromAccount, Account toAccount) {
        Withdrawal withdrawal = new Withdrawal(amount, description);
        Deposit deposit = new Deposit(amount, description);
        withdrawal.execute(fromAccount);
        deposit.execute(toAccount);
    }
}

public class Deposit extends Transaction {
    public Deposit(double amount, String description) {
        super(amount, description);
    }

    @Override
    public void execute(Account account) {
        account.deposit(getAmount());
    }
}

public class Withdrawal extends Transaction {
    public Withdrawal(double amount, String description) {
        super(amount, description);
    }

    @Override
    public void execute(Account account) {
        account.withdraw(getAmount());
    }
}
