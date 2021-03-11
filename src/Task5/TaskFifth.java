package Task5;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TaskFifth {
    private static Stream<String> first = Arrays.stream(new String[]{"A", "B", "C"});
    private static Stream<String> second = Arrays.stream(new String[]{"D", "E", "F", "G", "H", "I"});

        public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
            Iterator<T> firstIterate = first.iterator();
            Iterator<T> secondIterate = second.iterator();
            Stream<T> result = Stream.empty();
            while (firstIterate.hasNext() & secondIterate.hasNext()) {
                result = Stream.concat(result, Stream.of(firstIterate.next(),
                        secondIterate.next()));
            }
            return result;
        }

    public static void main(String[] args) {
        System.out.println(zip(first, second).collect(Collectors.joining(" ")));
    }
}