package Task1;

import java.util.List;
import java.util.stream.Collectors;

public class TaskFirst {
    public List<Person> getPersons() {
        return List.of(new Person(1, "Anna"),
                new Person(2, "Maria"),
                new Person(3, "Ivan"),
                new Person(4, "Peter"),
                new Person(5, "Olga"),
                new Person(6, "Oleksandr"));
    }

    public static void main(String[] args) {
        TaskFirst first = new TaskFirst();
        System.out.println(exercise1(first.getPersons()));
    }

    private static String exercise1(List<Person> persons) {
        List<Person> result = persons.stream()
                .filter(person -> person.getId() % 2 != 0)
                .collect(Collectors.toList());

        String line = result.stream()
                .map(Person::toString)
                .collect(Collectors.joining(", "));
        return line;
    }
}

