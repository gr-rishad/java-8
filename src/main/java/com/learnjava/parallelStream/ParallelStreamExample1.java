package com.learnjava.parallelStream;

import com.learnjava.data.Student;
import com.learnjava.data.StudentDatabase;

import java.util.List;
import java.util.stream.Collectors;

public class ParallelStreamExample1 {

    public static List<String> sequentialPrintStudentActivities() {
        long startTime=System.currentTimeMillis();
        List<String> studentActivities = StudentDatabase.getAllStudents().stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct()
                .sorted()
                .collect(Collectors.toList());

        long endTime= System.currentTimeMillis();
        System.out.println("Duration to execute the pipeline is sequential :"+(endTime-startTime));
        return studentActivities;
    }

    public static List<String> parallelPrintStudentActivities() {
        long startTime=System.currentTimeMillis();
        List<String> studentActivities = StudentDatabase.getAllStudents().stream()
                .parallel()// Stream<String>
                .map(Student::getActivities) //Stream<List<String>> -- stateless
                .flatMap(List::stream) // Stream<String> -stateless
                .distinct() // stateful
                .sorted()// stateful
                .collect(Collectors.toList());

        long endTime= System.currentTimeMillis();
        System.out.println("Duration to execute the pipeline is parallel :"+(endTime-startTime));
        return studentActivities;
    }

    public static void main(String[] args) {

        sequentialPrintStudentActivities();
        parallelPrintStudentActivities();


    }
}
