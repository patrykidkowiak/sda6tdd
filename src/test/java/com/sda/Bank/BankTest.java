package com.sda.Bank;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BankTest {
    private Bank bank;

    @Before
    public void init() {
        bank = new Bank("test");
    }


    @Test
    public void shouldAddNewUser() {
        User user = new User("Patryk", "Idkowiak");
        boolean result = bank.addUser(user);
        Assert.assertTrue("Method returned false", result);
        Assert.assertEquals("User is not present in bank list", 1, bank.getUsers().size());
    }

    @Test
    public void shouldNotAddNullUser() {
        User user = null;
        boolean result = bank.addUser(user);
        Assert.assertFalse("Method returned true", result);
        Assert.assertEquals("User is present in bank list", 0, bank.getUsers().size());
    }

}
