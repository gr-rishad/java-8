package com.learnjava.optional;

import com.learnjava.data.Student;
import com.learnjava.data.StudentDatabase;

import java.util.Optional;

public class OptionalExample {

    public static String getStudentName() {
        // Student student = StudentDatabase.studentSupplier.get();
        Student student = null;
        if (student != null) {
            return student.getName();
        }
        return null;
    }

    public static Optional<String> getStudentNameOptional() {
        Optional<Student> studentOptional = Optional.ofNullable(StudentDatabase.studentSupplier.get()); // Optional<String>
        if (studentOptional.isPresent()) {
            return studentOptional.map(Student::getName); // Optional<String>
        }
        return Optional.empty(); // Represents an optional object with no value
    }

    public static void main(String[] args) {
/*
        String name = getStudentName();
        if (name != null) {
            System.out.println("Length of the student name ::" + name.length());
        }
        System.out.println("Name not found");
 */

        Optional<String> stringOptional= getStudentNameOptional();
        if (stringOptional.isPresent()){
            System.out.println("Length of the student name: "+stringOptional.get().length());
        }else {
            System.out.println("Name Not Found");
        }

    }
}
