package streams;

import com.learnjava.data.Student;
import com.learnjava.data.StudentDatabase;

public class StreamMapReduceExample {

    public static int noOfNoteBooks() {
        int noOfNoteBooks = StudentDatabase.getAllStudents().stream()
                .filter(student -> student.getGradeLevel()>=3)
                .filter(student -> student.getGender().equals("female"))
                .map(Student::getNoteBooks)
                // .reduce(0, (a, b) -> a + b);
                .reduce(0, Integer::sum);
        return noOfNoteBooks;
    }

    public static void main(String[] args) {

        System.out.println(noOfNoteBooks());
    }
}
