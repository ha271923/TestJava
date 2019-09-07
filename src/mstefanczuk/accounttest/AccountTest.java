package pl.mstefanczuk.testdome.java.accounttest;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/*
7. Account Test

Using JUnit Assert class, write tests for the Account class that cover the following cases:

- The deposit and withdraw methods will not accept negative numbers.
- Account cannot overstep its overdraft limit.
- The deposit and withdraw methods will deposit or withdraw the correct amount, respectively.
- The withdraw and deposit methods return the correct results.
 */
public class AccountTest {
    private double epsilon = 1e-6;

    @Test
    public void accountCannotHaveNegativeOverdraftLimit() {
        Account account = new Account(-20);

        Assert.assertEquals(0d, account.getOverdraftLimit(), epsilon);
    }

    @Test
    public void depositWontAcceptNegativeNumbers() {
        Account account = new Account(0);
        double balance = account.getBalance();

        Assert.assertFalse(account.deposit(-20));
        Assert.assertEquals(balance, account.getBalance(), epsilon);
    }

    @Test
    public void withdrawWontAcceptNegativeNumbers() {
        Account account = new Account(0);
        double balance = account.getBalance();

        Assert.assertFalse(account.withdraw(-20));
        Assert.assertEquals(balance, account.getBalance(), epsilon);
    }

    @Test
    public void accountCannotOverstepItsOverdraftLimit() {
        Account account = new Account(20);
        double balance = account.getBalance();

        Assert.assertFalse(account.withdraw(30));
        Assert.assertEquals(balance, account.getBalance(), epsilon);
    }

    @Test
    public void depositWillDepositCorrectAmount() {
        Account account = new Account(20);

        account.deposit(10);
        Assert.assertEquals(10, account.getBalance(), epsilon);
    }

    @Test
    public void withdrawWillWithdrawCorrectAmount() {
        Account account = new Account(20);

        account.withdraw(10);
        Assert.assertEquals(-10, account.getBalance(), epsilon);
    }

    @Test
    public void depositReturnsTrueInCasePositiveAmount() {
        Account account = new Account(20);

        Assert.assertTrue(account.deposit(20));
    }
}