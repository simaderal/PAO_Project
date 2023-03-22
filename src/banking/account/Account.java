package banking.account;

import banking.client.Client;
import banking.transaction.Transaction;

import java.util.ArrayList;
import java.util.List;

public abstract class Account {
    //    fields: int id, String name, double balance
    private String accountNumber;
    private double balance;
    private Client client;
    private String type;
    private List<Transaction> transactions;

    public Account(String accountNumber, double balance, Client client, String type, List<Transaction> transactions) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.client = client;
        this.type = type;
        this.transactions = transactions;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }
    // Constructor, getters, and setters omitted for brevity

    public double getBalance() {
        return balance;
    }

    protected void setBalance(double balance) {
        this.balance = balance;
    }

    public List<String> getAccountStatement() {
        List<String> statement = new ArrayList<>();
        statement.add("Banking.Account Statement for Banking.Account Number: " + this.accountNumber);
        statement.add("Date\t\tDescription\t\tAmount");

        for (Transaction transaction : transactionHistory) {
            String transactionDate = transaction.getDate().toString();
            String transactionDescription = "";
            double transactionAmount = transaction.getAmount();

            // Determine the transaction description based on the transaction type
            switch (transaction.getType()) {
                case "Deposit":
                    transactionDescription = "Deposit into Banking.Account";
                    break;
                case "Withdrawal":
                    transactionDescription = "Withdrawal from Banking.Account";
                    break;
                case "Transfer":
                    transactionDescription = "Transfer to Banking.Account Number: " + transaction.getToAccount().getAccountNumber();
                    break;
                default:
                    transactionDescription = "Unknown Transaction Type";
                    break;
            }

            statement.add(transactionDate + "\t" + transactionDescription + "\t" + transactionAmount);
        }

        return statement;
    }

}
