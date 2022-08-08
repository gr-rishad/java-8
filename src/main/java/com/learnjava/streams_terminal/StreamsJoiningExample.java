package com.learnjava.streams_terminal;

import com.learnjava.data.Student;
import com.learnjava.data.StudentDatabase;

import java.util.stream.Collectors;

public class StreamsJoiningExample {

    public static String joining_3() {
        return StudentDatabase.getAllStudents().stream()
                .map(Student::getName)
                .collect(Collectors.joining("-", "(", ")"));
    }

    public static String joining_2() {
        return StudentDatabase.getAllStudents().stream()
                .map(Student::getName)
                .collect(Collectors.joining("-"));
    }

    public static String joining_1() {
        return StudentDatabase.getAllStudents().stream()
                .map(Student::getName)
                .collect(Collectors.joining());
    }

    public static void main(String[] args) {

        System.out.println("Joining 1 ::" + joining_1());
        System.out.println("Joining 2 ::" + joining_2());
        System.out.println("Joining 3 ::" + joining_3());
    }
}
