package com.learnjava.functionalInterface;

import com.learnjava.data.Student;
import com.learnjava.data.StudentDatabase;

import java.util.List;
import java.util.function.Predicate;

public class PredicateStudentExample {

    static Predicate<Student> p1 = s -> s.getGradeLevel() >= 3;
    static Predicate<Student> p2 = s -> s.getGpa() >= 3.9;

    public static void filterStudentByGradeLevel() {
        System.out.println("filterStudentByGradeLevel:");
        List<Student> studentList = StudentDatabase.getAllStudents();
        studentList.forEach(student -> {
            if (p1.test(student)) {
                System.out.println(student);
            }
        });
    }

    public static void filterStudentByGpa() {
        System.out.println("filterStudentByGpa :");
        List<Student> studentList = StudentDatabase.getAllStudents();
        studentList.forEach(student -> {
            if (p2.test(student)) {
                System.out.println(student);
            }
        });
    }

    public static void filterStudents() {
        System.out.println("filterStudents :");
        List<Student> studentList = StudentDatabase.getAllStudents();
        studentList.forEach(student -> {
            if (p2.and(p2).test(student)) { //p2.Or(p2).negate().test(student)
                System.out.println(student);
            }
        });
    }

    public static void main(String[] args) {
        filterStudentByGradeLevel();
        filterStudentByGpa();
        filterStudents();
    }
}
