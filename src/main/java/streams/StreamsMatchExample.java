package streams;

import com.learnjava.data.StudentDatabase;

public class StreamsMatchExample {

    public static boolean allMatch() { // list a joto data ace,sobgular jodi cgpa Predicate er shathe match kore tahole output true hbe, otherwise false
        return StudentDatabase.getAllStudents().stream()
                .allMatch(student -> student.getGpa() >= 3.5); // 3.5 --> true, 3.9 --> false
    }

    public static boolean anyMatch() { // list a joto data ace,je kono ekta cgpa Predicate er shathe match kore tahole output true hbe, otherwise false
        return StudentDatabase.getAllStudents().stream()
                .anyMatch(student -> student.getGpa() >= 4.0);
    }

    public static boolean noneMatch() { // list a joto data ace,jodi ekjoner o cgpa Predicate er shathe match na kore tahole output true hbe, otherwise false
        return StudentDatabase.getAllStudents().stream()
                .noneMatch(student -> student.getGpa() >= 4.0);
    }

    public static void main(String[] args) {

        System.out.println("Result of All Match :" + allMatch());
        System.out.println("Result of Any Match :" + anyMatch());
        System.out.println("Result of None Match :" + noneMatch());
    }
}
