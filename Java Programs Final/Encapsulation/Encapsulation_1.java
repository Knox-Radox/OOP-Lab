class BankVault {
    private String vaultCode;  
    private double balance;    
    
    public BankVault(String vaultCode, double initialBalance) {
        this.vaultCode = vaultCode;
        this.balance = Math.max(initialBalance, 0); 
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: ₹" + amount + ". New balance: ₹" + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public boolean withdraw(double amount, String enteredCode) {
        if (!enteredCode.equals(vaultCode)) {
            System.out.println("Access Denied: Incorrect Vault Code!");
            return false;
        }

        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: ₹" + amount + ". New balance: ₹" + balance);
            return true;
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance.");
            return false;
        }
    }

    public void changeVaultCode(String oldCode, String newCode) {
        if (oldCode.equals(vaultCode)) {
            vaultCode = newCode;
            System.out.println("Vault code successfully changed!");
        } else {
            System.out.println("Failed: Incorrect old vault code.");
        }
    }
}

public class Encapsulation_1 {
    public static void main(String[] args) {
        BankVault vault = new BankVault("secure123", 1000);

        System.out.println("Current Balance: ₹" + vault.getBalance());

        vault.deposit(500);

        vault.withdraw(200, "wrongCode");

        vault.withdraw(200, "secure123");

        vault.changeVaultCode("secure123", "newSecret456");

        vault.withdraw(100, "secure123");

        vault.withdraw(100, "newSecret456");
    }
}
