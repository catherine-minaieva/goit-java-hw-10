package Task5;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TaskFifth {
    private static Stream<String> first = Arrays.stream(new String[]{"A", "B", "C"});
    private static Stream<String> second = Arrays.stream(new String[]{"D", "E", "F", "G", "H", "I"});

    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        List<T> result = Stream.concat(first, second).collect(Collectors.toList());
        Collections.shuffle(result);
        return result.stream();
    }

    public static void main(String[] args) {
        System.out.println(zip(first, second).collect(Collectors.joining(" ")));
    }
}