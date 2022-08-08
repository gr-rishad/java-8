package com.learnjava.numericStream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class NumericStreamExample {

    public static int sumOfNNumbers(List<Integer> integerList) {
        return integerList.stream()
                .reduce(0, (x, y) -> x + y); // unboxing to convert the Integer to int
    }

    public static int sumOfNNumbersIntStream() {
        return IntStream.rangeClosed(1, 6)
                .sum();
    }

    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 6);
        System.out.println("Sum of N numbers :" + sumOfNNumbers(integerList));
        System.out.println("Sum of N numbers using IntStream :" + sumOfNNumbersIntStream());
    }
}
