import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorCallableExample {

    public static void main(String[] args) {

        try {

            // Creating thread pool
            ExecutorService executorService =
                    Executors.newFixedThreadPool(3);

            // Creating callable tasks
            List<Callable<Integer>> tasks =
                    new ArrayList<>();

            tasks.add(() -> {

                System.out.println("Task 1 Executing");

                return 10 + 20;
            });

            tasks.add(() -> {

                System.out.println("Task 2 Executing");

                return 30 + 40;
            });

            tasks.add(() -> {

                System.out.println("Task 3 Executing");

                return 50 + 60;
            });

            // Submitting tasks
            List<Future<Integer>> results =
                    new ArrayList<>();

            for (Callable<Integer> task : tasks) {

                Future<Integer> future =
                        executorService.submit(task);

                results.add(future);
            }

            // Collecting results
            System.out.println("\nTask Results:");

            for (Future<Integer> future : results) {

                System.out.println(
                        "Result: "
                                + future.get()
                );
            }

            // Shutting down executor
            executorService.shutdown();
        }

        catch (Exception e) {

            System.out.println(
                    "Error: "
                            + e.getMessage()
            );
        }
    }
}