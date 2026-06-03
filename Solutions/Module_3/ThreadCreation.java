class MyThread extends Thread {

    @Override
    public void run() {

        for (int i = 1; i <= 5; i++) {

            System.out.println(Thread.currentThread().getName() + " is running");

            try {

                Thread.sleep(500);
            }

            catch (InterruptedException e) {

                System.out.println("Thread interrupted");
            }
        }
    }
}

public class ThreadCreation {

    public static void main(String[] args) {

        // Creating thread objects
        MyThread thread1 = new MyThread();

        MyThread thread2 = new MyThread();

        // Setting thread names
        thread1.setName("Thread 1");

        thread2.setName("Thread 2");

        // Starting threads
        thread1.start();

        thread2.start();
    }
}