package com.learnjava.streams_terminal;

import com.learnjava.data.Student;
import com.learnjava.data.StudentDatabase;

import java.util.stream.Collectors;

public class StreamsSumAvgExample {

    public static int sum(){
        return StudentDatabase.getAllStudents().stream()
                .collect(Collectors.summingInt(Student::getNoteBooks));
    }

    public static double avg(){
        return StudentDatabase.getAllStudents().stream()
                .collect(Collectors.averagingInt(Student::getNoteBooks));
    }

    public static void main(String[] args) {

        System.out.println("Summing Int :: "+sum());
        System.out.println("Averaging Int :: "+avg());
    }
}
