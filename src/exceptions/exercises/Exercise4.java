package exceptions.exercises;

/**
 * Exercise 4 :
 * Create a class BankAccount with:
 *   - field double balance
 *   - method withdraw(double amount)
 *     → If amount > balance, throw a custom exception InsufficientFundsException.
 * In main():
 *   - Create an account with a starting balance
 *   - Try to withdraw more than available
 *   - Catch and handle the exception
 */
public class Exercise4 {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000.0); // Starting balance

        try {
            System.out.println("Attempting to withdraw 1500.0");
            account.withdraw(1500.0); // This will exceed balance
        } catch (InsufficientFundsException e) {
            System.out.println("Withdrawal failed: " + e.getMessage());
        }

        System.out.println("Current balance: " + account.getBalance());
    }
}

// Custom exception class
class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

// BankAccount class
class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("You do not have enough funds. Attempted to withdraw " + amount + ", but balance is " + balance);
        }
        balance -= amount;
        System.out.println("Withdrawal successful: " + amount);
    }
}


