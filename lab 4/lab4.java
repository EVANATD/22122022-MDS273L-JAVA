import java.util.Scanner;

public class BankAccount {
    
    static int accountNumber;
    static String accountHolderName;
    static double accountBalance;
    static String transactions = "";
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter account number: ");
        accountNumber = scanner.nextInt();
        scanner.nextLine(); // to clear the buffer
        System.out.print("Enter account holder name: ");
        accountHolderName = scanner.nextLine();
        System.out.print("Enter account balance: ");
        accountBalance = scanner.nextDouble();
        
        int choice;
        do {
            System.out.println("\nMenu");
            System.out.println("1. Deposit money");
            System.out.println("2. Withdraw money");
            System.out.println("3. Print transactions");
            System.out.println("4. Print account summary");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    depositMoney();
                    break;
                case 2:
                    withdrawMoney();
                    break;
                case 3:
                    printTransactions();
                    break;
                case 4:
                    printAccountSummary();
                    break;
                case 5:
                    System.out.println("Exiting the program...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);
        
        scanner.close();
    }
    
    public static void initializeCustomer(int accNumber, String accHolderName, double accBalance) {
        accountNumber = accNumber;
        accountHolderName = accHolderName;
        accountBalance = accBalance;
    }
    
    public static void depositMoney() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter amount to deposit: ");
        double amount = scanner.nextDouble();
        if (amount <= 0) {
            System.out.println("Invalid amount. Please try again.");
        } else {
            accountBalance += amount;
            transactions += "Deposited: " + amount + "\n";
            System.out.println("Deposit successful.");
        }
    }
    
    public static void withdrawMoney() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter amount to withdraw: ");
        double amount = scanner.nextDouble();
        if (amount <= 0 || amount > accountBalance) {
            System.out.println("Invalid amount. Please try again.");
        } else {
            accountBalance -= amount;
            transactions += "Withdrawn: " + amount + "\n";
            System.out.println("Withdrawal successful.");
        }
    }
    
    public static void printTransactions() {
        System.out.println("Transactions:\n" + transactions);
    }
    
    public static void printAccountSummary() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Account Balance: " + accountBalance);
    }
}
