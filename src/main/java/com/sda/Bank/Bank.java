package com.sda.Bank;

import cucumber.api.java.en_old.Ac;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private String name;
    private static int idCounter;
    private UserService userService;
    private AccountService accountService;

    public Bank(String name) {
        this.name = name;
        this.userService = new UserService();
        this.accountService = new AccountService();
    }

    public boolean addUser(User user) {
        return userService.addUser(user);
    }

    public AccountService getAccountService() {
        return accountService;
    }

    public UserService getUserService() {
        return userService;
    }

    public boolean createAccount(int userId, Account account) {
                boolean result = false;
                if (userService.isUserPresent(userId)) {
                        result = accountService.addAccount(account);
                    }
               return result;
           }

    public boolean changeAmount(Account account, int amount){
        boolean result=false;
        if (accountService.isAccountPresent(account.getId())){
            account.setAmount(account.getAmount()+amount);
            result=true;
        }
        return result;
    }



    public int accountAmount(Account account){
        return account.getAmount();
    }


    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public void setAccountService(AccountService accountService) {
        this.accountService = accountService;
    }

    public int getNumberOfUsers() {
        return userService.getNumberOfUsers();
    }

    public int getNumberOfAccounts() {
        return accountService.getNumberOfAccounts();
    }

    public Account getAccount(int accountId){
        return accountService.getAccount(accountId);
    }

}
