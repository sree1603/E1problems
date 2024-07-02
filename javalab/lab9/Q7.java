class BankAccount {
    private double balance;
    private final double minimumBalance;

    public BankAccount(double initialBalance, double minimumBalance) {
        this.balance = initialBalance;
        this.minimumBalance = minimumBalance;
    }

    public synchronized void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(Thread.currentThread().getName() + " deposited: " + amount + ", New Balance: " + balance);
            notifyAll();  // Notify waiting threads that balance has changed
        }
    }

    public synchronized void withdraw(double amount) {
        while (balance - amount < minimumBalance) {
            try {
                System.out.println(Thread.currentThread().getName() + " waiting to withdraw: " + amount + ", Current Balance: " + balance);
                wait();  // Wait until sufficient balance is available
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Thread interrupted");
            }
        }
        balance -= amount;
        System.out.println(Thread.currentThread().getName() + " withdrew: " + amount + ", New Balance: " + balance);
    }

    public double getBalance() {
        return balance;
    }
}

class DepositThread extends Thread {
    private final BankAccount account;
    private final double amount;

    public DepositThread(BankAccount account, double amount) {
        this.account = account;
        this.amount = amount;
    }

    @Override
    public void run() {
        account.deposit(amount);
    }
}

class WithdrawThread extends Thread {
    private final BankAccount account;
    private final double amount;

    public WithdrawThread(BankAccount account, double amount) {
        this.account = account;
        this.amount = amount;
    }

    @Override
    public void run() {
        account.withdraw(amount);
    }
}

public class Q7 {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000.0, 100.0);

        // Create deposit threads
        Thread depositThread1 = new DepositThread(account, 200.0);
        Thread depositThread2 = new DepositThread(account, 300.0);

        // Create withdrawal threads
        Thread withdrawThread1 = new WithdrawThread(account, 150.0);
        Thread withdrawThread2 = new WithdrawThread(account, 400.0);
        Thread withdrawThread3 = new WithdrawThread(account, 800.0);

        // Start threads
        depositThread1.start();
        depositThread2.start();
        withdrawThread1.start();
        withdrawThread2.start();
        withdrawThread3.start();
    }
}

