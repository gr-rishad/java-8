package streams;

import com.learnjava.data.Student;
import com.learnjava.data.StudentDatabase;

import java.util.List;
import java.util.stream.Collectors;

public class StreamsMapExample {

    public List<String> nameList() {
        List<String> namesList = StudentDatabase.getAllStudents()
                .stream().map(Student::getName)
                .collect(Collectors.toList());

        return namesList;
    }

    public static void main(String[] args) {

    }
}
