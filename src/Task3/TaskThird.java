package Task3;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;

public class TaskThird {
    public static void main(String[] args) {
        String[] array = new String[]{"1, 2, 0", "4, 5"};
        Collection<String> collection = Arrays.asList("1,2,0", "4,5");
        String number = collection.stream().flatMap((p) -> Arrays.asList(p.split(","))
                .stream()).sorted()
                .collect(Collectors.joining(", "));
                     System.out.println(number.toString());
    }
}


