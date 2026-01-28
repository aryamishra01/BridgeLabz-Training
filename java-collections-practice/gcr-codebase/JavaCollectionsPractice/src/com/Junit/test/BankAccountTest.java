package com.Junit.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.Junit.main.BankAccount;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

    private BankAccount account;

    @BeforeEach
    void setUp() {
        account = new BankAccount(1000.0); // initial balance
    }

    // Test deposit
    @Test
    void testDeposit() {
        account.deposit(500.0);
        assertEquals(1500.0, account.getBalance());
    }

    // Test withdraw
    @Test
    void testWithdraw() {
        account.withdraw(300.0);
        assertEquals(700.0, account.getBalance());
    }

    // Test insufficient balance
    @Test
    void testWithdrawInsufficientFunds() {
        Exception exception = assertThrows(IllegalStateException.class, () -> {
            account.withdraw(2000.0);
        });

        assertEquals("Insufficient funds", exception.getMessage());
        assertEquals(1000.0, account.getBalance()); // balance unchanged
    }

    // Test invalid deposit
    @Test
    void testInvalidDeposit() {
        assertThrows(IllegalArgumentException.class, () -> account.deposit(-100));
    }

    // Test invalid withdrawal
    @Test
    void testInvalidWithdraw() {
        assertThrows(IllegalArgumentException.class, () -> account.withdraw(0));
    }
}
