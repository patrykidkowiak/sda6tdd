package com.sda.Bank;

public class Account {
    private int id;
    private int userId;
    private int amount;

    public Account(int userId, int amount) {
        this.userId = userId;
        this.amount = amount;
    }

    public Account() {
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public int getUserId() {
        return userId;
    }

    public int getAmount() {
        return amount;
    }
}
