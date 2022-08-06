package streams;

import java.util.ArrayList;

public class CollectionsVsStream {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("adam");
        names.add("jim");
        names.add("jenny");

        names.remove(0);
        System.out.println(names);

        for (String name : names) {
            System.out.println(name);
        }
        for (String name : names) {
            System.out.println(name);
        }

        names.stream().forEach(System.out::println);
        // names.stream().forEach(System.out::println);

    }
}
