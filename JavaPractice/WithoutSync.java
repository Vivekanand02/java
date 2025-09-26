class BankAccount {
    private int balance = 1000;

    void withdraw(int amount) {
        if (balance >= amount) {
            System.out.println(Thread.currentThread().getName() + " is withdrawing " + amount);
            balance -= amount;
            System.out.println("Remaining balance: " + balance);
        } else {
            System.out.println("Insufficient balance for " + Thread.currentThread().getName());
        }
    }
}

public class WithoutSync {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        Runnable task = () -> account.withdraw(100);

        Thread t1 = new Thread(task, "User 1");
        Thread t2 = new Thread(task, "User 2");

        t1.start();
        t2.start();
    }
}
