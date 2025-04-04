class BankAccount {
    protected String accountHolder;
    protected double balance;

    public BankAccount(String holder, double balance) {
        this.accountHolder = holder;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: ₹" + amount);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: ₹" + amount);
        } else {
            System.out.println("Insufficient funds!");
        }
    }

    public void showBalance() {
        System.out.println(accountHolder + "'s Balance: ₹" + balance);
    }
}

class SavingsAccount extends BankAccount {
    protected double interestRate;

    public SavingsAccount(String holder, double balance, double interestRate) {
        super(holder, balance);
        this.interestRate = interestRate;
    }

    public void applyInterest() {
        double interest = balance * (interestRate / 100);
        balance += interest;
        System.out.println("Interest Applied: ₹" + interest);
    }
}

class PremiumSavingsAccount extends SavingsAccount {
    private double cashbackRate;

    public PremiumSavingsAccount(String holder, double balance, double interestRate, double cashbackRate) {
        super(holder, balance, interestRate);
        this.cashbackRate = cashbackRate;
    }

    public void applyCashback(double spentAmount) {
        double cashback = spentAmount * (cashbackRate / 100);
        balance += cashback;
        System.out.println("Cashback Received: ₹" + cashback);
    }
}

public class MultilevelInheritance_1 {
    public static void main(String[] args) {
        System.out.println("\n Banking System Simulation\n");

        PremiumSavingsAccount account = new PremiumSavingsAccount("John Doe", 5000, 5, 2);

        account.deposit(1000);
        account.withdraw(500);
        account.applyInterest();
        account.applyCashback(200); 

        account.showBalance();
    }
}
