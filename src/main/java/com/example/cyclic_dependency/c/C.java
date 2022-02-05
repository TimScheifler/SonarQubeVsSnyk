package com.example.cyclic_dependency.c;

import com.example.cyclic_dependency.a.A;

public class C {

    public C(int x){
        if(x==0){
            A a = new A();
        }
    }
}