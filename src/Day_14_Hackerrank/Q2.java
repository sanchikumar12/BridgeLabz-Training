package Day_14_Hackerrank;

class BankAccount {
    protected String accountHolder;
    protected double balance;

    public BankAccount() {
        this("Default User", 0.0);
    }

    public BankAccount(String accountHolder) {
        this(accountHolder, 0.0);
    }

    public BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public void displayAccount() {
        System.out.println("Account Holder: " + accountHolder + " | Balance: $" + balance);
    }
}

class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String accountHolder, double balance, double interestRate) {
        super(accountHolder, balance);
        this.interestRate = interestRate;
    }

    @Override
    public void displayAccount() {
        super.displayAccount();
        System.out.println("Interest Rate : " + interestRate + "%");
    }
}

public class Q2 {
    public static void main(String[] args) {
        System.out.println("=== Bank Account Constructor Chaining ===");
        BankAccount acc1 = new BankAccount();
        BankAccount acc2 = new BankAccount("Alice");
        BankAccount acc3 = new BankAccount("Bob", 5000.0);

        acc1.displayAccount();
        acc2.displayAccount();
        acc3.displayAccount();

        System.out.println("\n=== Savings Account (Child Class with super()) ===");
        SavingsAccount savAcc = new SavingsAccount("Charlie", 12000.0, 4.5);
        savAcc.displayAccount();
    }
}
