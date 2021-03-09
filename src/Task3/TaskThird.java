package Task3;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;

public class TaskThird {
    public static void main(String[] args) {
        Collection<String> collection = Arrays.asList("1,2,0", "4,5");
        String number = collection.stream().flatMap((p) -> Arrays.stream(p.split(","))).sorted()
                .collect(Collectors.joining(", "));
        System.out.println(number.toString());
    }
}


