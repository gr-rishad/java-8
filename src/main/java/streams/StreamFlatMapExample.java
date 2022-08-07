package streams;

import com.learnjava.data.Student;
import com.learnjava.data.StudentDatabase;

import java.util.List;
import java.util.stream.Collectors;

public class StreamFlatMapExample {

    public static List<String> printStudentActivities() {
        List<String> studentActivities = StudentDatabase.getAllStudents().stream() // Stream<Student>
                .map(Student::getActivities) // Stream<List<String>>
                .flatMap(List::stream) // Stream<String>
                .distinct() // Stream<String> --> with distinct function performed
                .sorted()
                .collect(Collectors.toList());
        return studentActivities;
    }

    public static long getStudentActivities() {
        long totalActivities = StudentDatabase.getAllStudents().stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct()
                .count();
        return totalActivities;
    }


    public static void main(String[] args) {

        System.out.println(printStudentActivities());
        System.out.println("Total Unique Activities" + getStudentActivities());
    }
}
