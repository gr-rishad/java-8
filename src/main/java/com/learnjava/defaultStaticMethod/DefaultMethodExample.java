package com.learnjava.defaultStaticMethod;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class DefaultMethodExample {

    public static void main(String[] args) {

        /*
        Sort the list in alphabetically order
         */
        List<String> stringList = Arrays.asList("Adam", "Jack", "Alex", "Dan", "Mike", "Eric");

        // prior java 8
        //Collections.sort(stringList);
        // System.out.println("Sorted list using Collections.Sort():: "+stringList);

        // java 8
        stringList.sort(Comparator.naturalOrder());
        System.out.println("Sorted list using List.Sort():: " + stringList);

        stringList.sort(Comparator.reverseOrder());
        System.out.println("Sorted list using List.Sort() reverse :: " + stringList);
    }
}
