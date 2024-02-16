package com.example;

import java.util.function.Function;
import java.util.function.IntConsumer;

public class Foo {

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
