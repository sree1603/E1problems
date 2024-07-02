abstract class BankAccount {
    protected double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);

    public double getBalance() {
        return balance;
    }
}

class SavingsAccount extends BankAccount {
    public SavingsAccount(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount + " into Savings Account. Current balance: " + balance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew " + amount + " from Savings Account. Current balance: " + balance);
        } else {
            System.out.println("Insufficient funds in Savings Account to withdraw " + amount);
        }
    }
}

class CurrentAccount extends BankAccount {
    public CurrentAccount(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount + " into Current Account. Current balance: " + balance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew " + amount + " from Current Account. Current balance: " + balance);
        } else {
            System.out.println("Insufficient funds in Current Account to withdraw " + amount);
        }
    }
}

public class abs3 {
    public static void main(String[] args) {
        BankAccount savings = new SavingsAccount(1000.00);
        savings.deposit(500.00);
        savings.withdraw(200.00);

        BankAccount current = new CurrentAccount(2000.00);
        current.deposit(1000.00);
        current.withdraw(1500.00);
    }
}
