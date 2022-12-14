package com.learnjava.streams_terminal;

import com.learnjava.data.StudentDatabase;

import java.util.stream.Collectors;

public class StreamsCountingExample {

    public static long count() {
        return StudentDatabase.getAllStudents().stream()
                .filter(student -> student.getGpa()>=3.9)
                .collect(Collectors.counting());
    }

    public static void main(String[] args) {

        System.out.println("Counting() ::" + count());
    }
}
