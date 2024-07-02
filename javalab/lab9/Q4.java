class MyThread extends Thread {
    @Override
    public void run() {
        // Get reference to the current thread
        Thread currentThread = Thread.currentThread();
        // Print the name and priority of the current thread
        System.out.println("Current thread in MyThread: " + currentThread.getName() + ", Priority: " + currentThread.getPriority());
    }
}

public class Q4 {
    public static void main(String[] args) {
        // Get reference to the main thread
        Thread mainThread = Thread.currentThread();
        // Print the name and priority of the main thread
        System.out.println("Main thread: " + mainThread.getName() + ", Priority: " + mainThread.getPriority());

        // Create and start a new thread
        MyThread thread1 = new MyThread();
        thread1.setName("MyThread-1");
        thread1.start();

        // Additional demonstration within the main thread
        for (int i = 0; i < 5; i++) {
            System.out.println("Iteration " + i + " in main thread: " + mainThread.getName());
            try {
                // Sleep for a short time to simulate some work
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("Main thread interrupted");
            }
        }
    }
}



