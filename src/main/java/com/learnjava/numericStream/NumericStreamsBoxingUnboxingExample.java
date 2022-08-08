package com.learnjava.numericStream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumericStreamsBoxingUnboxingExample {

    public static List<Integer> boxing() {
        return IntStream.rangeClosed(1, 10)
                // int --> input
                .boxed()
                // Integer --> Converted Output
                .collect(Collectors.toList());
    }

    public static int unboxing(List<Integer> integerList) {
        // Wrapper to primitive
        return integerList.stream()
                // Wrapper Integer values
                .mapToInt(Integer::intValue) // IntStream(int value of wrapper class)
                .sum();
    }

    public static void main(String[] args) {

        System.out.println(boxing());

        List<Integer> integerList = boxing();
        System.out.println(unboxing(integerList));
    }
}
