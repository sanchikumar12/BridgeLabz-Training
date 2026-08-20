package Day_14_Hackerrank;

class Account {

    private double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    protected double getBalance() {
        return balance;
    }
}

class CurrentAccount extends Account {

    public CurrentAccount(double balance) {
        super(balance);
    }

    public void showAccountBalance() {

        System.out.println("Account Balance via protected getBalance(): $" + getBalance());
    }
}

public class Q5 {
    public static void main(String[] args) {
        System.out.println("=== Access Modifier Practice ===");
        CurrentAccount currentAcc = new CurrentAccount(75000.50);
        currentAcc.showAccountBalance();
    }
}
