package Day12_Hackerrank;



public class Q3 {

    private double balance;

    protected String accountType;

    String branchCode;

    public Q3(double balance, String accountType, String branchCode) {
        if (balance < 0) {
            this.balance = 0;
        } else {
            this.balance = balance;
        }

        this.accountType = accountType;
        this.branchCode = branchCode;
    }

   
    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive.");
        } else if (amount > balance) {
            System.out.println("Withdrawal rejected: insufficient balance.");
        } else {
            balance -= amount;
        }
    }
}