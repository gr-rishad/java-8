package com.learnjava.lambdas;

import java.util.function.Consumer;

public class LambdaVariable2 {
    public static void main(String[] args) {

        int value = 4;

        Consumer<Integer> c1 = (i) -> {
           // value++; -> not allowed
            System.out.println(value);
        };

        c1.accept(4);
    }
}
