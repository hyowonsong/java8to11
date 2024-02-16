package com.example;

public class DefultFoo implements Foo{

    String name;

    public DefultFoo(String name){
        this.name = name;
    }
    @Override
    public void printName() {

    }

    @Override
    public void printNameUpperCase() {
        Foo.super.printNameUpperCase();
    }

    @Override
    public String getName() {
        return null;
    }
}
