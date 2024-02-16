package com.example;

import java.util.function.IntConsumer;

import static java.lang.Character.getName;

public interface Foo {

    void printName();

    default void printNameUpperCase(){
        System.out.println(getName().toUpperCase());
    }

    String getName();

    /**
    public static void main(String[] args) {
        Foo foo = new Foo();
        foo.run();
    }

    private void run() {
        int baseNumber = 10;

        //람다
        IntConsumer printInt = (i) ->
                System.out.println(i + baseNumber);

        printInt.accept(10);

        /**
        Function<Integer, Integer> plus10 = (i) -> i+10;
        Function<Integer, Integer> multiply2 = (i) -> i*2;

        System.out.println(plus10.andThen(multiply2).apply(2));
         **/

    }
}
