package com.learnjava.streams_terminal;

import com.learnjava.data.Student;
import com.learnjava.data.StudentDatabase;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class StreamsGroupingByExample {

    public static void groupStudentsByGender() {
        Map<String, List<Student>> studentMap = StudentDatabase.getAllStudents().stream()
                .collect(Collectors.groupingBy(Student::getGender));
        System.out.println(studentMap);
    }

    public static void customizedGroupingBy() {
        Map<String, List<Student>> studentMap = StudentDatabase.getAllStudents()
                .stream() // Stream<Students>
                .collect(Collectors.groupingBy(student -> student.getGpa() >= 3.8 ? "OUTSTANDING" : "AVERAGE"));
        System.out.println(studentMap);
    }

    public static void twoLevelGrouping_1() {
        Map<Integer, Map<String, List<Student>>> studentMap =
                StudentDatabase.getAllStudents().stream()
                        .collect(Collectors.groupingBy(Student::getGradeLevel, Collectors.groupingBy(student -> student.getGpa() >= 3.8 ? "OUTSTANDING" : "AVERAGE")));
        System.out.println(studentMap);
    }

    public static void twoLevelGrouping_2() {
        Map<String, Integer> studentMap =
                StudentDatabase.getAllStudents().stream()
                        .collect(Collectors.groupingBy(Student::getName, Collectors.summingInt(Student::getNoteBooks)));
        System.out.println(studentMap);
    }

    public static void threeArgumentGrouping() {
        LinkedHashMap<String, Set<Student>> studentMap =
                StudentDatabase.getAllStudents().stream()
                        .collect(Collectors.groupingBy(Student::getName, LinkedHashMap::new, toSet()));
        System.out.println(studentMap);
    }

    public static void GroupByMax() {
        Map<Integer, Optional<Student>> studentMap =
                StudentDatabase.getAllStudents().stream()
                        .collect(Collectors.groupingBy(Student::getGradeLevel, Collectors.maxBy(Comparator.comparing(Student::getGpa))));
        System.out.println(studentMap);
    }

    public static void calculateTopGpa() {
        Map<Integer, Optional<Student>> studentMapOptional = StudentDatabase.getAllStudents().stream()
                .collect(Collectors.groupingBy(Student::getGradeLevel, maxBy(Comparator.comparing(Student::getGpa))));
        System.out.println(studentMapOptional);

        Map<Integer, Student> studentMapOptional1 = StudentDatabase.getAllStudents().stream()
                .collect(Collectors.groupingBy(Student::getGradeLevel, collectingAndThen(maxBy(Comparator.comparing(Student::getGpa)), Optional::get)));
        System.out.println(studentMapOptional1);
    }

    public static void calculateLeastGpa() {
        Map<Integer, Optional<Student>> studentMapOptional = StudentDatabase.getAllStudents().stream()
                .collect(Collectors.groupingBy(Student::getGradeLevel, minBy(Comparator.comparing(Student::getGpa))));
        System.out.println(studentMapOptional);

        Map<Integer, Student> studentMapOptional1 = StudentDatabase.getAllStudents().stream()
                .collect(Collectors.groupingBy(Student::getGradeLevel, collectingAndThen(minBy(Comparator.comparing(Student::getGpa)), Optional::get)));
        System.out.println(studentMapOptional1);
    }


    public static void main(String[] args) {

        //  groupStudentsByGender();
        // customizedGroupingBy();
        // twoLevelGrouping_1();
        // twoLevelGrouping_2();
        // threeArgumentGrouping();
        // GroupByMax();
        //calculateTopGpa();
        //calculateLeastGpa();
    }
}
