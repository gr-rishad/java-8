package com.learnjava.methodReference;

import com.learnjava.data.Student;
import com.learnjava.data.StudentDatabase;

import java.util.function.Consumer;

public class ConsumerMethodReference {

    static Consumer<Student> c1 = p -> System.out.println(p);
    // Classname::methodName
    static Consumer<Student> c2 = System.out::println;
    // Classname::instanceMethodName
    static Consumer<Student> c3 = Student::printListOfActivities;

    public static void main(String[] args) {

        StudentDatabase.getAllStudents().forEach(c1);
        StudentDatabase.getAllStudents().forEach(c2);
        StudentDatabase.getAllStudents().forEach(c3);
    }
}
