package com.example.cyclic_dependency;

public class B extends C{

    public B(){
        C c = new C();
    }
}