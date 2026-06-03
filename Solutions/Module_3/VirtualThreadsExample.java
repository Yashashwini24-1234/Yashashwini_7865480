public class VirtualThreadsExample {

    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();

        // Creating 100000 virtual threads
        for (int i = 1; i <= 100000; i++) {

            int threadNumber = i;

            Thread.startVirtualThread(() -> {

                System.out.println(
                        "Virtual Thread: "
                                + threadNumber
                );
            });
        }

        long endTime = System.currentTimeMillis();

        System.out.println(
                "\nTime Taken: "
                        + (endTime - startTime)
                        + " ms"
        );
    }
}