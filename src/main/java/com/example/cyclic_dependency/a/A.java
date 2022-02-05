package com.example.cyclic_dependency.a;

import com.example.cyclic_dependency.b.B;

public class A {

    public A (){
        B b = new B();
    }
}
