package com.sda.Bank;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    public String name;
    private static int idCounter;
    public List<User> users;
    public List<Account> accounts;

    public Bank(String name) {
        this.name = name;
        this.users= new ArrayList<>();
        this.accounts=new ArrayList<>();
    }

    public boolean addUser(User user){
        boolean result = false;
        if (user !=null){
            user.setId(idCounter++);
            users.add(user);
            result=true;
        }
        return result;
    }

    public List<User> getUsers() {
        return users;
    }

    public List<Account> getAccounts() {
        return accounts;
    }
}
