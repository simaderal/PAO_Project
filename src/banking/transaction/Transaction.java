package banking.transaction;

import java.time.LocalDate;

public abstract class Transaction {
    private int transactionId;
    private double amount;
    private LocalDate date;
    private String accountNumber;
    private String description;

//    transaction history
//    get date
//
//    transaction date


    protected Transaction(int transactionId, double amount, LocalDate date, String accountNumber, String description) {
        this.transactionId = transactionId;
        this.amount = amount;
        this.date = date;
        this.accountNumber = accountNumber;
        this.description = description;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public LocalDate getDate() {
        return date;
    }

//return "Transaction #" + id + " of " + amount + " on " + DateUtil.formatDate(date);
    @Override
    public String toString() {
        return super.toString();
    }
    //    public void getTransactionDetails() {
//        System.out.println("Account Number: " + getAccountNumber());
//        System.out.println("Description: " + getDescription());
//    }

}
