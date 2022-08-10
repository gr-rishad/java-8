package com.learnjava.optional;

import com.learnjava.data.Bike;
import com.learnjava.data.Student;
import com.learnjava.data.StudentDatabase;

import java.util.Optional;

public class OptionalMapFlatMapExample {

    // filter
    public static void optionalFilter() {
        Optional<Student> studentOptional = Optional.ofNullable(StudentDatabase.studentSupplier.get()); // Optional<Student>

        studentOptional.filter(student -> student.getGpa() >= 3.5)
                .ifPresent(student -> System.out.println(student));
    }

    // Map
    public static void optionalMap() {
        Optional<Student> studentOptional = Optional.ofNullable(StudentDatabase.studentSupplier.get()); // Optional<Student>

        if (studentOptional.isPresent()) {
            studentOptional.filter(student -> student.getGpa() >= 3.5)
                    .map(Student::getName)
                    .ifPresent(s -> System.out.println(s));
        }
    }

    // flatMap
    public static void optionalFlatMap() {
        Optional<Student> studentOptional = Optional.ofNullable(StudentDatabase.studentSupplier.get()); // Optional<Student>

        Optional<String> name = studentOptional.filter(student -> student.getGpa() >= 3.5) // Optional<Student<Optional<Bike>>>
                .flatMap(Student::getBike) // Optional<Bike>
                .map(Bike::getName);

        System.out.println(name.get());
    }

    public static void main(String[] args) {

        // optionalFilter();
        // optionalMap();
        optionalFlatMap();
    }
}
