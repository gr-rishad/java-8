package streams;

import com.learnjava.data.Student;
import com.learnjava.data.StudentDatabase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsReduceExample {

    public static int performMultiplication(List<Integer> integerList) {
        return integerList.stream()
                // values are--> 1,3,5,7
                // 1st iteration--> a=1(default),b=1(from stream) => result 1 is return
                // 2nd iteration--> a=1(result in prv. iter.), b=3(from stream) => result 3 is return
                // 3rd iteration--> a=3(result in prv. itr.), b=5(from stream)=> result 15 is return
                // 4th iteration --> a=15(result in prv. itr.), b=7(from stream)=> result 105 is return
                .reduce(1, (a, b) -> a * b);
    }

    public static Optional<Integer> performMultiplicationWithoutIdentity(List<Integer> integerList) {
        return integerList.stream()
                .reduce((a, b) -> a * b);
    }

    public static Optional<Student> getHighestGPAStudent() {
        // students one by one
        return StudentDatabase.getAllStudents().stream()
                .reduce((s1, s2) ->
                        (s1.getGpa() > s2.getGpa()) ? s1 : s2);
//                    if (s1.getGpa() > s2.getGpa()) {
//                        return s1;
//                    } else {
//                        return s2;
//                    }
    }

    public static void main(String[] args) {

        List<Integer> integers = Arrays.asList(1, 3, 5, 7);
        List<Integer> integers1 = new ArrayList<>();

        System.out.println(performMultiplication(integers));

        Optional<Integer> result = performMultiplicationWithoutIdentity(integers);
        System.out.println(result.isPresent());
        System.out.println(result.get());

        Optional<Integer> result1 = performMultiplicationWithoutIdentity(integers1);
        if (result1.isPresent()) {
            System.out.println(result1.get());
        }

        Optional<Student> studentOptional = getHighestGPAStudent();
        if (studentOptional.isPresent()) {
            System.out.println(studentOptional.get());
        }

    }


}
