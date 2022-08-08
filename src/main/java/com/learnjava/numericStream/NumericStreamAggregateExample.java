package com.learnjava.numericStream;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumericStreamAggregateExample {
    public static void main(String[] args) {

        // sum()
        int sum = IntStream.rangeClosed(1, 50).sum();
        System.out.println("Sum is :" + sum);

        // max()
        OptionalInt optionalInt = IntStream.rangeClosed(1, 50).max();
        System.out.println("Max value is :" + optionalInt.getAsInt());

        // min()
        OptionalLong optionalLong = LongStream.rangeClosed(50, 100).min();
        System.out.println("Min value is :" + optionalLong.getAsLong());

        // avg()
        OptionalDouble optionalDouble = IntStream.rangeClosed(1, 50).average();
        System.out.println("Average value is: " + optionalDouble.getAsDouble());

    }
}
