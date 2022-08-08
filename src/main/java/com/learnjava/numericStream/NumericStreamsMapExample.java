package com.learnjava.numericStream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumericStreamsMapExample {

    public static List<Integer> mapToObj() {
        return IntStream.rangeClosed(1, 5)
                .mapToObj(Integer::new).collect(Collectors.toList());
    }

    public static long mapToLong() {
        return IntStream.rangeClosed(1, 5) //intStream
                // i is passed from the intStream
                .mapToLong(value -> value)// convert intStream to longStream
                .sum();
    }

    public static double mapToDouble() {
        return IntStream.rangeClosed(1, 5) //intStream
                // i is passed from the intStream
                .mapToDouble(value -> value)// convert intStream to doubleStream
                .sum();
    }

    public static void main(String[] args) {


        System.out.println("mapToObject :" + mapToObj());
        System.out.println("mapToLong :" + mapToLong());
        System.out.println("mapToDouble :" + mapToDouble());
    }
}
