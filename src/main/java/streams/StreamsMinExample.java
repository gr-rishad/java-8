package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsMinExample {

    public static int findMinValue(List<Integer> integerList) {
        return integerList.stream()
                // 6 -> y
                // 7 -> y
                // 8 ->y
                // 9 -> y
                // 10 -> y
                // x variable holds the max value for each element in the iteration
                .reduce(0, (a, b) -> a < b ? a : b);
    }

    public static Optional<Integer> findMinValueOptional(List<Integer> integerList) {
        return integerList.stream()
                // 6 -> y
                // 7 -> y
                // 8 ->y
                // 9 -> y
                // 10 -> y
                // x variable holds the max value for each element in the iteration
                .reduce((a, b) -> a < b ? a : b);
    }

    public static void main(String[] args) {


        List<Integer> integerList = Arrays.asList(6, 7, 8, 9, 15, 10);
        int minValue= findMinValue(integerList);
        System.out.println("minValue: "+minValue);

        Optional<Integer> minValueOptional=findMinValueOptional(integerList);
        if (minValueOptional.isPresent()){
            System.out.println("The minimum value is "+minValueOptional.get());
        }else {
            System.out.println("No input is passed");
        }

    }
}
