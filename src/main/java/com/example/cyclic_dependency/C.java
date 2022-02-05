package com.example.cyclic_dependency;

public class C extends A{

    public C(){
        A a = new A();
    }
}
