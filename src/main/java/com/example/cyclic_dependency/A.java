package com.example.cyclic_dependency;

public class A extends B{

    public A (){
        B b = new B();
    }
}
