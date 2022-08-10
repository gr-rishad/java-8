package com.learnjava.streams_terminal;

import com.learnjava.data.Student;
import com.learnjava.data.StudentDatabase;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamsPartitioningByExample {

    public static void partitioningBy_1() {
        Predicate<Student> gpaPredicate = student -> student.getGpa() >= 3.8;
        Map<Boolean, List<Student>> partitioningMap = StudentDatabase.getAllStudents().stream()
                .collect(Collectors.partitioningBy(gpaPredicate));
        System.out.println(partitioningMap);
    }

    public static void partitioningBy_2() {
        Predicate<Student> gpaPredicate = student -> student.getGpa() >= 3.8;
        Map<Boolean, Set<Student>> partitioningMap = StudentDatabase.getAllStudents().stream()
                .collect(Collectors.partitioningBy(gpaPredicate, Collectors.toSet()));
        System.out.println(partitioningMap);
    }

    public static void main(String[] args) {

        partitioningBy_1();
        partitioningBy_2();
    }
}
