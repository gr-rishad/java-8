package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsLimitSkipExample {

    public static Optional<Integer> limit(List<Integer> integerList) {
        return integerList.stream()
                // process first 2 value -> 6,7
                .limit(2)
                .reduce((x, y) -> x + y);
    }

    public static Optional<Integer> skip(List<Integer> integerList) {
        return integerList.stream()
                // skip first 2 value -> 6,7  --> process 8,9, 10
                .skip(2)
                .reduce((x, y) -> x + y);
    }

    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(6, 7, 8, 9, 10);
        Optional<Integer> limitResult = limit(integerList);
        if (limitResult.isPresent()) {
            System.out.println("Limit output: " + limitResult.get());
        } else {
            System.out.println("No Input is passed");
        }


        Optional<Integer> skipResult = skip(integerList);
        if (skipResult.isPresent()) {
            System.out.println("Skip output: " + skipResult.get());
        } else {
            System.out.println("No Input is passed");
        }

    }
}
