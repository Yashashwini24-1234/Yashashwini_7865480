import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
class Student {

    public void showMessage() {

        System.out.println("Hello from Student Class");
    }

    public void displayName(String name) {

        System.out.println("Student Name: " + name);
    }
}


public class ReflectionExample {

    public static void main(String[] args) {

        try {

            // Loading class dynamically
            Class<?> cls = Class.forName("Student");

            System.out.println("Class Name: "
                    + cls.getName());

            // Getting all declared methods
            Method[] methods =
                    cls.getDeclaredMethods();

            System.out.println("\nMethods in Class:");

            for (Method method : methods) {

                System.out.println(
                        "\nMethod Name: "
                                + method.getName()
                );

                // Printing parameter details
                Parameter[] parameters =
                        method.getParameters();

                System.out.println(
                        "Number of Parameters: "
                                + parameters.length
                );

                for (Parameter parameter : parameters) {

                    System.out.println(
                            "Parameter Type: "
                                    + parameter.getType()
                    );
                }
            }

            // Creating object dynamically
            Object obj =
                    cls.getDeclaredConstructor()
                            .newInstance();

            // Invoking method dynamically
            Method method1 =
                    cls.getMethod("showMessage");

            method1.invoke(obj);

            // Invoking method with parameter
            Method method2 =
                    cls.getMethod(
                            "displayName",
                            String.class
                    );

            method2.invoke(obj, "Yashu");
        }

        catch (Exception e) {

            System.out.println(
                    "Error: " + e.getMessage()
            );
        }
    }
}