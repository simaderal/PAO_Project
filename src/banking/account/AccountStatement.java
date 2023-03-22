package banking.account;

import banking.transaction.Transaction;

import java.util.List;

public class AccountStatement {
    private List<Transaction> transactions;

    public AccountStatement(List<Transaction> transactions) {
        this.transactions = transactions;
    }

    public String generateStatement() {
        StringBuilder statement = new StringBuilder();
        statement.append("Date\t\tDescription\t\tAmount\n");
        for (Transaction transaction : transactions) {
            statement.append(transaction.getDate())
                    .append("\t")
                    .append(transaction.getDescription())
                    .append("\t\t")
                    .append(transaction.getAmount())
                    .append("\n");
        }
        return statement.toString();
    }
}

