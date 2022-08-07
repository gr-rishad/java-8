package streams;

import java.util.Arrays;
import java.util.List;

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

    public static int performMultiplicationWithoutIdentity(List<Integer> integerList) {
        return integerList.stream()
                // values are--> 1,3,5,7
                // 1st iteration--> a=1(default),b=1(from stream) => result 1 is return
                // 2nd iteration--> a=1(result in prv. iter.), b=3(from stream) => result 3 is return
                // 3rd iteration--> a=3(result in prv. itr.), b=5(from stream)=> result 15 is return
                // 4th iteration --> a=15(result in prv. itr.), b=7(from stream)=> result 105 is return
                .reduce(1, (a, b) -> a * b);
    }

    public static void main(String[] args) {

        List<Integer> integers = Arrays.asList(1, 3, 5, 7);

        System.out.println(performMultiplication(integers));

    }
}
