package com.learnjava.lambdas;

import java.util.Comparator;

public class ComparatorLambdaExample {

    public static void main(String[] args) {
        /*
        prior java 8
         */
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2); // output->0, if o1==o2
                // output->1, if o1>o2
                // output->-1, if o1<o2
            }
        };
        System.out.println("Result of the comparator is: " + comparator.compare(3, 2));

        // java 8
        Comparator<Integer> comparatorLambda = (Integer o1, Integer o2) -> {
            return o1.compareTo(o2);
        };
        System.out.println("Result of the comparator is: " + comparatorLambda.compare(3, 2));

        Comparator<Integer> comparatorLambda1 = (o1, o2) -> o1.compareTo(o2);
        System.out.println("Result of the comparator is: " + comparatorLambda1.compare(3, 2));
    }
}
