/*2. Bank Account System.Create a class BankAccount with attributes accountHolderName, accountNumber, and balance. Create a constructor to initialize them.
Create methods deposit(amount) and withdraw(amount) which modify the balance.
Show messages if withdrawal amount exceeds balance.
*/

class BankAccount {
    String accountHolderName;
    int accountNumber;
    double balance;

    public BankAccount(String accountHolderName, int accountNumber, double initialBalance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited $" + amount + ". New balance: $" + balance);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew $" + amount + ". New balance: $" + balance);
        } else {
            System.out.println("Insufficient balance. Cannot withdraw $" + amount);
        }
    }

}
public class QnoTwo {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("John Doe", 123456, 1000.0);
        account.deposit(500.0);
        account.withdraw(200.0);
        account.withdraw(1500.0);

    }

}
