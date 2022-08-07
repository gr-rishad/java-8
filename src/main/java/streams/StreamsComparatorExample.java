package streams;

import com.learnjava.data.Student;
import com.learnjava.data.StudentDatabase;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsComparatorExample {

    public static List<Student> sortStudentsByName() {
        List<Student> studentsNameList = StudentDatabase.getAllStudents().stream()
                .sorted(Comparator.comparing(Student::getName))
                // .sorted((o1, o2) -> o1.compareTo(o2))
                .collect(Collectors.toList());
        return studentsNameList;
    }

    public static List<Student> sortStudentsByGpa() {
        List<Student> studentsNameList = StudentDatabase.getAllStudents().stream()
                .sorted(Comparator.comparing(Student::getGpa))
                // .sorted((o1, o2) -> o1.compareTo(o2))
                .collect(Collectors.toList());
        return studentsNameList;
    }

    public static List<Student> sortStudentsByGpaDesc() {
        List<Student> studentsNameList = StudentDatabase.getAllStudents().stream()
                .sorted(Comparator.comparing(Student::getGpa).reversed())
                // .sorted((o1, o2) -> o1.compareTo(o2))
                .collect(Collectors.toList());
        return studentsNameList;
    }

    public static void main(String[] args) {

        System.out.println("Sort Student By Name::");
        sortStudentsByName().forEach(System.out::println);
        System.out.println("Sort Student by GPA:: " + sortStudentsByGpa());
        System.out.println("Sort Student by GPA DESC:: " + sortStudentsByGpaDesc());
    }
}
