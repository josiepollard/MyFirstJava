import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {
    @Test
    public void balanceIsZero() {
        BankAccount testBankAccount = new BankAccount();
        int balance = testBankAccount.balance;
        assertEquals(0, balance);
    }

    @Test
    public void depositMoney() {
        BankAccount testBankAccount = new BankAccount();
        testBankAccount.deposit(15);
        assertEquals(15, testBankAccount.balance);
    }

    @Test
    public void withdrawMoney() {
        BankAccount testBankAccount = new BankAccount();
        testBankAccount.deposit(10);
        testBankAccount.withdraw(10);
        assertEquals(0, testBankAccount.balance);
    }
}

