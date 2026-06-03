import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LambdaExpressions {

    public static void main(String[] args) {

        // Creating list of strings
        List<String> names = new ArrayList<>();

        names.add("Yashu");

        names.add("Rahul");

        names.add("Ananya");

        names.add("Kiran");

        names.add("Bhavya");

        // Sorting list using lambda expression
        Collections.sort(names, (a, b) -> a.compareTo(b));

        // Displaying sorted list
        System.out.println("Sorted List:");

        for (String name : names) {

            System.out.println(name);
        }
    }
}