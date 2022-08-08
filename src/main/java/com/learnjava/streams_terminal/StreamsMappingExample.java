package com.learnjava.streams_terminal;

import com.learnjava.data.Student;
import com.learnjava.data.StudentDatabase;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamsMappingExample {

    public static List<String> namesList() {
        return StudentDatabase.getAllStudents().stream()
                .map(Student::getName)
                .collect(Collectors.toList());
        // .collect(Collectors.mapping(Student::getName, Collectors.toList()));
    }

    public static void main(String[] args) {

        System.out.println("namesList:: " + namesList());

        List<String> namesList = StudentDatabase.getAllStudents().stream()
                .collect(Collectors.mapping(Student::getName, Collectors.toList()));
        System.out.println("NamesList :: " + namesList);

        Set<String> namesListSet = StudentDatabase.getAllStudents().stream()
                .collect(Collectors.mapping(Student::getName, Collectors.toSet()));
        System.out.println("NamesListSet :: " + namesListSet);
    }
}
