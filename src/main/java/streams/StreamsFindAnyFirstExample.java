package streams;

import com.learnjava.data.Student;
import com.learnjava.data.StudentDatabase;

import java.util.Optional;

public class StreamsFindAnyFirstExample {

    public static Optional<Student> findAnyStudent() {// findAny() --> condition(filter) er shate jodi je kono ekta element match kore tahole baki element gula r execute hbe na
        return StudentDatabase.getAllStudents().stream()
                .filter(student -> student.getGpa() >= 3.9)
                .findAny();
    }

    public static Optional<Student> findFirstStudent() {// findAny() --> condition(filter) er shate jodi je kono ekta element match kore tahole baki element gula r execute hbe na
        return StudentDatabase.getAllStudents().stream()
                .filter(student -> student.getGpa() >= 3.9)
                .findAny();
    }

    public static void main(String[] args) {

        Optional<Student> studentOptionalFindAny = findAnyStudent();
        if (studentOptionalFindAny.isPresent()) {
            System.out.println("Found the student :" + studentOptionalFindAny.get());
        } else {
            System.out.println("Student Not Found !!");
        }

        Optional<Student> studentOptionalFindFirst = findFirstStudent();
        if (studentOptionalFindFirst.isPresent()) {
            System.out.println("Found the student :" + studentOptionalFindFirst.get());
        } else {
            System.out.println("Student Not Found !!");
        }
    }
}
