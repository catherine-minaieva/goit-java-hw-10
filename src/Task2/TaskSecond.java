package Task2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class TaskSecond {

    public static void main(String[] args) {
        List<String> users = Arrays.asList("Anna", "Maria", "Ivan", "Peter","Olga", "Oleksandr");
        List <String> result = users.stream()
                .map(user -> user.toUpperCase())
                .sorted(Collections.reverseOrder())
                .collect(Collectors.toList());
        System.out.println(result);
    }
}


