public interface BankServiceInterface {
    void addClient(Client client);
    void openAccount(Client client, String accountType);
    void closeAccount(String accountNumber);
    void deposit(String accountNumber, double amount);
    void withdraw(String accountNumber, double amount);
    void transfer(String fromAccountNumber, String toAccountNumber, double amount);
    List<String> getAccountStatement(String accountNumber);
}
