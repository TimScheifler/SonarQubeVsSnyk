package com.example.cyclic_dep.package_a;

import com.example.cyclic_dep.package_b.B;

public class A {

    private B b;
    public void setUser(B newB) {
        b = newB;}

    synchronized void depositFunds(String test) {
        if (b.exists(test)) {
        }
    }

    protected double getData(String test) {
        return 1.0;
    }
}