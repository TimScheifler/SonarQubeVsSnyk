package com.example.cyclic_dependency.user;

import com.example.cyclic_dependency.account.AccountHolder;

public class UserDetails extends AccountHolder {
    public synchronized double getUserBalance(String accountNumber) {
        // Use a method of AccountHolder to get the account balance
        return getBalance(accountNumber);
    }
}