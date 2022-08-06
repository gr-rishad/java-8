package streams;

import com.learnjava.data.Student;
import com.learnjava.data.StudentDatabase;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamsExample {
    public static void main(String[] args) {

        Map<String, List<String>> studentMap = StudentDatabase.getAllStudents().stream()
                .peek(student -> System.out.println(student))
                .filter(student -> student.getGradeLevel() >= 3)
                .peek(student -> System.out.println("After first filter: " + student))// Stream<Student>
                .filter(student -> student.getGpa() >= 3.9)
                .peek(student -> System.out.println("After 2nd filter: " + student))//Stream<Student>
                .collect(Collectors.toMap(Student::getName, Student::getActivities)); //<Map>

        System.out.println(studentMap + "\n");
    }


}
