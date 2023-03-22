import banking.account.Account;
import banking.transaction.Transaction;

import java.util.List;

public class BankService implements BankServiceInterface {
    private List<Account> accounts;
    private List<DebitCard> debitCards;
    private List<Transaction> transactions;

    public BankService(List<Account> accounts, List<DebitCard> debitCards, List<Transaction> transactions) {
        this.accounts = accounts;
        this.debitCards = debitCards;
        this.transactions = transactions;
    }

    public void openAccount(Account account) {
        accounts.add(account);
    }
    public void closeAccount(Account account) {
        accounts.remove(account);
    }
    public void issueDebitCard(DebitCard debitCard) {
        debitCards.add(debitCard);
    }
    public void makeTransaction(Transaction transaction) {
        transactions.add(transaction);
    }
    public void viewTransactionHistory(Account account) {
        for (Transaction transaction : transactions) {
            if (transaction.getAccount().equals(account)) {
                System.out.println(transaction);
            }
        }
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }

    public List<DebitCard> getDebitCards() {
        return debitCards;
    }

    public void setDebitCards(List<DebitCard> debitCards) {
        this.debitCards = debitCards;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }
}
