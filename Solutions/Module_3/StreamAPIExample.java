import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPIExample {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();

        numbers.add(10);

        numbers.add(15);

        numbers.add(22);

        numbers.add(37);

        numbers.add(40);

        numbers.add(55);

        numbers.add(68);

        // Filtering even numbers using Stream API
        List<Integer> evenNumbers = numbers.stream()
                .filter(number -> number % 2 == 0)
                .collect(Collectors.toList());

        // Displaying even numbers
        System.out.println("Even Numbers:");

        for (int number : evenNumbers) {

            System.out.println(number);
        }
    }
}