package com.learnjava.optional;

import com.learnjava.data.Student;
import com.learnjava.data.StudentDatabase;

import java.util.Optional;

public class OptionalOrElseExample {
    // orElse
    public static String optionOrElse() {
        //Optional<Student> studentOptional = Optional.ofNullable(StudentDatabase.studentSupplier.get());
        Optional<Student> studentOptional = Optional.ofNullable(null); // Optional.empty()
        String name = studentOptional.map(Student::getName).orElse("Default");
        return name;
    }

    // orElseGet()
    public static String optionOrElseGet() {
        //Optional<Student> studentOptional = Optional.ofNullable(StudentDatabase.studentSupplier.get());
        Optional<Student> studentOptional = Optional.ofNullable(null); // Optional.empty()
        String name = studentOptional.map(Student::getName).orElseGet(() -> "Default");
        return name;
    }

    // orElseThrow()
    public static String optionOrElseThrow() {
        Optional<Student> studentOptional = Optional.ofNullable(StudentDatabase.studentSupplier.get());
        //  Optional<Student> studentOptional = Optional.ofNullable(null); // Optional.empty()
        String name = studentOptional.map(Student::getName).orElseThrow(() -> new RuntimeException("No Data Available."));
        return name;
    }

    public static void main(String[] args) {

        System.out.println("OrElse() ::" + optionOrElse());
        System.out.println("OrElseGet() :: " + optionOrElseGet());
        System.out.println("OrElseThrow() :: " + optionOrElseThrow());
    }
}
