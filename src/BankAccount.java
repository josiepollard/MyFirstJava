public class BankAccount {
    public int balance = 0;

    public Integer deposit(int i) {
        balance += i;
        return balance;
    }

    public Integer withdraw(int i) {
        balance -= i;
        return balance;
    }
}
