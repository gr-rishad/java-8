package com.learnjava.streams_terminal;

import com.learnjava.data.Student;
import com.learnjava.data.StudentDatabase;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamsMinByMaxByExample {

    public static Optional<Student> minBy_example(){
        return StudentDatabase.getAllStudents().stream()
                .collect(Collectors.minBy(Comparator.comparing(Student::getGpa)));
    }

    public static Optional<Student> maxBy_example(){
        return StudentDatabase.getAllStudents().stream()
                .collect(Collectors.maxBy(Comparator.comparing(Student::getGpa)));
    }
    public static void main(String[] args) {

        Optional<Student> minGpa= minBy_example();
        if (minGpa.isPresent()){
            System.out.println("Min Gpa:: "+minGpa.get());
        }

        Optional<Student> maxGpa= maxBy_example();
        if (maxGpa.isPresent()){
            System.out.println("Max Gpa:: "+maxGpa.get());
        }
    }
}
