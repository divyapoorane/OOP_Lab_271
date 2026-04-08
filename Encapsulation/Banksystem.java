class BankAccount {
    private double balance;

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if(amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance");
        }
    }

    public double getBalance() {
        return balance;
    }
}

public class Banksystem {
    public static void main(String[] args) {

        BankAccount acc = new BankAccount();

        acc.deposit(5000);
        acc.withdraw(2000);

        System.out.println("Balance: " + acc.getBalance());
    }
}