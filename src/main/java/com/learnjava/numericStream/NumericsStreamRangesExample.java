package com.learnjava.numericStream;

import java.util.stream.IntStream;

public class NumericsStreamRangesExample {
    public static void main(String[] args) {

        IntStream intStreamRange = IntStream.range(1, 50);
        System.out.println(intStreamRange.count());
        System.out.println("IntStream Range ::");
        IntStream.range(1, 50).forEach(value -> System.out.print(value + ","));

        System.out.println(":::::::::::::::::::");

        IntStream intStreamRangeClosed = IntStream.rangeClosed(1, 50);
        System.out.println(intStreamRangeClosed.count());
        System.out.println("IntStream RangeClosed ::");
        IntStream.rangeClosed(1, 50).forEach(value -> System.out.print(value + ","));

    }
}
