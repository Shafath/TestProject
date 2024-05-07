import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {
    private final Lock depositLock = new ReentrantLock();
    private final Lock withdrawLock = new ReentrantLock();
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        depositLock.lock();
        try {
            // Simulate some processing
            Thread.sleep(100);

            balance += amount;
            System.out.println("Deposit successful. New balance: " + balance);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            depositLock.unlock();
        }
    }

    public void withdraw(double amount) {
        withdrawLock.lock();
        try {
            // Simulate some processing
            Thread.sleep(100);

            balance -= amount;
            System.out.println("Withdrawal successful. New balance: " + balance);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            withdrawLock.unlock();
        }
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000);

        // Thread 1
        new Thread(() -> {
            account.deposit(200);
            account.withdraw(100);
        }).start();

        // Thread 2
        new Thread(() -> {
            account.withdraw(50);
            account.deposit(100);
        }).start();
    }
}