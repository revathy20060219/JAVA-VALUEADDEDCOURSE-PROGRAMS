import java.util.*;
import java.util.stream.*;

class Account {
    private int accountNumber;
    private String holderName;
    private double balance;

    public Account(int accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public double getBalance() {
        return balance;
    }

    // Deposit method (updates balance)
    public void deposit(double amount) {
        this.balance += amount;
    }

    @Override
    public String toString() {
        return "Account{" +
                "AccNo=" + accountNumber +
                ", Name='" + holderName + '\'' +
                ", Balance=" + balance +
                '}';
    }
}

public class BankStreamDemo {
    public static void main(String[] args) {
        // Create some accounts
        List<Account> accounts = Arrays.asList(
                new Account(101, "Alice", 5000),
                new Account(102, "Bob", 3000),
                new Account(103, "Charlie", 7000),
                new Account(104, "Diana", 2000)
        );

        System.out.println("Initial Accounts:");
        accounts.forEach(System.out::println);

        // Deposit 1000 into each account using Streams
        accounts.stream().forEach(acc -> acc.deposit(1000));

        System.out.println("\nAfter Depositing 1000 into Each Account:");
        accounts.forEach(System.out::println);

        // Find accounts with balance more than 6000
        System.out.println("\nAccounts with balance > 6000:");
        accounts.stream()
                .filter(acc -> acc.getBalance() > 6000)
                .forEach(System.out::println);

        // Calculate total balance using Stream
        double totalBalance = accounts.stream()
                .map(Account::getBalance)
                .reduce(0.0, Double::sum);

        System.out.println("\nTotal Balance in Bank: " + totalBalance);
    }
}
