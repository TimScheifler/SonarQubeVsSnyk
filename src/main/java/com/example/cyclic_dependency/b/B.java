package com.example.cyclic_dependency.b;

import com.example.cyclic_dependency.c.C;

public class B {

    public B(){
        C c = new C(1);
    }
}