package com.example.cyclic_dependency.c;

import com.example.cyclic_dependency.a.A;

public class C {

    public C(){
        A a = new A();
    }
}