package com.learnjava.functionalInterface;

import com.learnjava.data.Student;
import com.learnjava.data.StudentDatabase;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {


    static Consumer<Student> studentConsumer = (student) -> System.out.println(student);
    static Consumer<Student> c1 = student -> System.out.print(student.getName());
    static Consumer<Student> c2 = student -> System.out.println(student.getActivities());

    public static void printName() {

        List<Student> studentList = StudentDatabase.getAllStudents();
        studentList.forEach(studentConsumer);
    }

    public static void printNameAndActivities() {

        List<Student> students = StudentDatabase.getAllStudents();
        students.forEach(c1.andThen(c2));
    }

    public static void printNameAndActivitiesUsingCondition() {

        List<Student> students = StudentDatabase.getAllStudents();
        students.forEach((student -> {
            if (student.getGradeLevel() >= 3 && student.getGpa() >= 3.9) {
                c1.andThen(c2).accept(student);
            }
        }));
    }


    public static void main(String[] args) {

        Consumer<String> c = (s) -> System.out.println(s.toUpperCase());
        c.accept("java8");
        // printName();
        // printNameAndActivities();
        printNameAndActivitiesUsingCondition();
    }
}
