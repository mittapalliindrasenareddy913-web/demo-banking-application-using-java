import java.util.Scanner;

public class Bank {
    int accountNumber;
    String name;
    double balance;

    Bank(int accountNumber, String name, double balance) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
    }

    void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Amount deposited successfully.");
        } else {
            System.out.println("Invalid amount.");
        }
    }

    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance = balance - amount;
            System.out.println("Amount withdrawn successfully.");
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    void checkBalance() {
        System.out.println("Current Balance: " + balance);
    }

    void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Customer Name: " + name);
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Account Number: ");
        int acc = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter Customer Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Initial Balance: ");
        double balance = sc.nextDouble();

        Bank customer = new Bank(acc, name, balance);

        int choice;

        do {
            System.out.println("--- BANK ACCOUNT MANAGEMENT ---");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Display Account Details");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    customer.deposit(sc.nextDouble());
                    break;

                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    customer.withdraw(sc.nextDouble());
                    break;

                case 3:
                    customer.checkBalance();
                    break;

                case 4:
                    customer.displayDetails();
                    break;

                case 5:
                    System.out.println("Thank you for using Bank Account Management System");
                    break;

                default:
                            
                    System.out.println("Invalid choice.");
            }

        } while (choice != 5);

        sc.close();
    }
}