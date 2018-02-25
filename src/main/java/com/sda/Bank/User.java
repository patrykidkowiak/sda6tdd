package com.sda.Bank;

public class User {
    private String User;
    private int id;
    private String firstName;
    private String LastName;

    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.LastName = lastName;
    }

    public User(){

    }

    public String getUser() {
        return User;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return LastName;
    }
}
