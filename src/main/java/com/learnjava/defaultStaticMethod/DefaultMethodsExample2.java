package com.learnjava.defaultStaticMethod;

import com.learnjava.data.Student;
import com.learnjava.data.StudentDatabase;

import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class DefaultMethodsExample2 {

    static Consumer<Student> studentConsumer = student -> System.out.println(student);
    static Comparator<Student> nameComparator = Comparator.comparing(Student::getName);
    static Comparator<Student> gradeComparator = Comparator.comparingDouble(Student::getGradeLevel);

    static void sortByName(List<Student> studentList) {
        System.out.println("After Sort :: ");
        Comparator<Student> nameComparator = Comparator.comparing(Student::getName);
        studentList.sort(nameComparator);
        studentList.forEach(studentConsumer);
    }

    static void sortByGPA(List<Student> studentList) {
        System.out.println("After Sort :: ");
        Comparator<Student> nameComparator = Comparator.comparingDouble(Student::getGpa);
        studentList.sort(nameComparator);
        studentList.forEach(studentConsumer);
    }

    static void comparatorChaining(List<Student> studentList) {
        System.out.println("After Comparator Chaining  :: ");
        studentList.sort(gradeComparator.thenComparing(nameComparator));
        studentList.forEach(studentConsumer);
    }

    public static void sortWithNullValues(List<Student> studentList) {
        System.out.println("After Sort :: ");
        Comparator<Student> studentComparator = Comparator.nullsFirst(nameComparator);
        Comparator<Student> studentComparatorNullLast = Comparator.nullsLast(nameComparator);
        studentList.sort(studentComparator);
        studentList.forEach(studentConsumer);
    }

    public static void main(String[] args) {

        List<Student> studentList = StudentDatabase.getAllStudents();
        // System.out.println("Before Sort :: ");
        // System.out.println(studentList);

        // studentList.forEach(studentConsumer);
        // sortByName(studentList);
        //sortByGPA(studentList);
        // comparatorChaining(studentList);
        sortWithNullValues(studentList);

    }
}
