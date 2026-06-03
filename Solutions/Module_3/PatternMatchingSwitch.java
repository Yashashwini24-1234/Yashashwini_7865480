public class PatternMatchingSwitch {

    static void checkType(Object obj) {

        switch (obj) {

            case Integer i ->

                    System.out.println(i + " is an Integer");

            case String s ->

                    System.out.println("\"" + s + "\"" + " is a String");

            case Double d ->

                    System.out.println(d + " is a Double");

            case Boolean b ->

                    System.out.println(b + " is a Boolean");

            case null ->

                    System.out.println("Object is null");

            default ->

                    System.out.println("Unknown type");
        }
    }

    public static void main(String[] args) {

        // Calling method with different object types
        checkType(25);

        checkType("Yashu");

        checkType(45.67);

        checkType(true);

        checkType(null);
    }
}