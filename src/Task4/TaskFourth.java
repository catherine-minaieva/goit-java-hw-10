package Task4;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TaskFourth {
    public List<Long> generator(long a, long c, long m, long seed) {
        Stream<Long> streamFromIterate = Stream.iterate(seed, n -> 1 * (a * n + c) % m);
       return streamFromIterate.limit(10).collect(Collectors.toList()); // напечатает streamFromIterate = [1, 3, 5]
          }

    public static void main(String[] args) {
        TaskFourth test = new TaskFourth();
        System.out.println(test.generator(25214903917L, 11L, 2^48, 0L));
    }
}