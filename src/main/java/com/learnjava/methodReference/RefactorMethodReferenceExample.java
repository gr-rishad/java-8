package com.learnjava.methodReference;

import com.learnjava.data.Student;
import com.learnjava.data.StudentDatabase;

import java.util.function.Predicate;

public class RefactorMethodReferenceExample {

    static Predicate<Student> p1 = RefactorMethodReferenceExample::greaterThanGradeLevel;

    public static boolean greaterThanGradeLevel(Student s){
        return s.getGradeLevel()>=3;
    }

    public static void main(String[] args) {
        System.out.println(p1.test(StudentDatabase.studentSupplier.get()));
    }
}
