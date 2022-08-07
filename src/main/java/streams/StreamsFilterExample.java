package streams;

import com.learnjava.data.Student;
import com.learnjava.data.StudentDatabase;

import java.util.List;
import java.util.stream.Collectors;

public class StreamsFilterExample {

    public static List<Student> filterStudent() {
        List<Student> femaleStudent = StudentDatabase.getAllStudents().stream() // Stream<Student>
                .filter(student -> student.getGender().equals("female")) // Stream<Student> --> filters and sends only the students whose gender is female
                .filter(student -> student.getGpa()>=3.9)
                .collect(Collectors.toList());
        return femaleStudent;
    }

    public static void main(String[] args) {
        System.out.println("Filter Female Students:: ");
        filterStudent().stream().forEach(System.out::println);
    }
}
