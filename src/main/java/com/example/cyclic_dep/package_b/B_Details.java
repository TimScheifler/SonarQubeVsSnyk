package com.example.cyclic_dep.package_b;

import com.example.cyclic_dep.package_a.A;

public class B_Details extends A {
    public synchronized double getData_B(String accountNumber) {
        // Use a method of AccountHolder to get the account balance
        return getData(accountNumber);
    }
}