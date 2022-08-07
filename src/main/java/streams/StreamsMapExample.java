package streams;

import com.learnjava.data.Student;
import com.learnjava.data.StudentDatabase;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamsMapExample {

    public static List<String> nameList() {
        List<String> studentList = StudentDatabase.getAllStudents()
                // student as an input --> Student name
                .stream().map(Student::getName)// Stream<String>
                .map(String::toUpperCase) // Stream<String> --> uppercase operation on each input
                .collect(Collectors.toList()); // List<String>
        return studentList;
    }

    public static Set<String> nameSet() {
        Set<String> studentSet = StudentDatabase.getAllStudents()
                // student as an input --> Student name
                .stream().map(Student::getName)// Stream<String>
                .map(String::toUpperCase) // Stream<String> --> uppercase operation on each input
                .collect(Collectors.toSet()); // Set<String>
        return studentSet;
    }

    public static void main(String[] args) {
        System.out.println(nameList());
        System.out.println(nameSet());
    }
}
