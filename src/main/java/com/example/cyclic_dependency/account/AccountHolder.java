package com.example.cyclic_dependency.account;

import com.example.cyclic_dependency.user.User;

public class AccountHolder {

    private User user;
    public void setUser(User newUser) {user = newUser;}

    synchronized void depositFunds(String username, double amount) {
        // Use a utility method of User to check whether username exists
        if (user.exists(username)) {
            // Deposit the amount
        }
    }

    protected double getBalance(String accountNumber) {
        // Return the account balance
        return 1.0;
    }
}