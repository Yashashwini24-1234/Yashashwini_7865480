import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

record Person(String name, int age) {
}

public class RecordsExample {

    public static void main(String[] args) {

        Person person1 = new Person("Yashu", 21);

        Person person2 = new Person("Rahul", 17);

        Person person3 = new Person("Ananya", 25);

        // Printing record objects
        System.out.println("Person Details:");

        System.out.println(person1);

        System.out.println(person2);

        System.out.println(person3);

        // Adding records to list
        List<Person> people = new ArrayList<>();

        people.add(person1);

        people.add(person2);

        people.add(person3);

        // Filtering people with age >= 18
        List<Person> adults = people.stream()
                .filter(person -> person.age() >= 18)
                .collect(Collectors.toList());

        // Displaying filtered records
        System.out.println("\nPeople with age 18 or above:");

        for (Person person : adults) {

            System.out.println(person);
        }
    }
}