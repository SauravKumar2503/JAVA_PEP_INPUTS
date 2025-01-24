//Create a BankAccount class:
// ○ Private fields: accountNumber, balance.
// ○ Public methods: deposit(double), withdraw(double), and
// getBalance().
// ○ Write code that tests your BankAccount class to ensure correct behavior.

import java.util.Scanner;

class BankAccount {
    private int accountNumber;
    private double balance;

    
    BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    
    public int getAccountNumber() {
        return accountNumber;
    }

    
    public double getBalance() {
        return balance;
    }

    
    public void deposit(double amount) {
        balance += amount;
    }

    
    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance");
        } else {
            balance -= amount;
        }
    }
}

class Bank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.println("Enter the number of accounts: ");
        int n = sc.nextInt();
        BankAccount[] accounts = new BankAccount[n];

        
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the account number for account " + (i + 1) + ": ");
            int accountNumber = sc.nextInt();
            System.out.println("Enter the initial balance for account " + (i + 1) + ": ");
            double balance = sc.nextDouble();
            accounts[i] = new BankAccount(accountNumber, balance);
        }

        
        for (int i = 0; i < n; i++) {
            System.out.println("\nAccount number: " + accounts[i].getAccountNumber());
            System.out.println("Initial Balance: " + accounts[i].getBalance());
            
            
            accounts[i].deposit(1000);
            System.out.println("Balance after deposit of 1000: " + accounts[i].getBalance());
            
            
            accounts[i].withdraw(500);
            System.out.println("Balance after withdrawal of 500: " + accounts[i].getBalance());
        }

        sc.close(); 
    }
}
