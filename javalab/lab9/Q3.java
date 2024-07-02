class MyThread extends Thread {
    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " - Priority: " + Thread.currentThread().getPriority());
    }
}

public class Q3 {
    public static void main(String[] args) {
        // Create threads
        MyThread thread1 = new MyThread("Thread 1");
        MyThread thread2 = new MyThread("Thread 2");
        MyThread thread3 = new MyThread("Thread 3");

        // Set priorities
        thread1.setPriority(Thread.MIN_PRIORITY); // Priority 1
        thread2.setPriority(Thread.NORM_PRIORITY); // Priority 5
        thread3.setPriority(Thread.MAX_PRIORITY); // Priority 10

        // Start threads
        thread1.start();
        thread2.start();
        thread3.start();

        // Get and print the priorities
        System.out.println(thread1.getName() + " - Priority: " + thread1.getPriority());
        System.out.println(thread2.getName() + " - Priority: " + thread2.getPriority());
        System.out.println(thread3.getName() + " - Priority: " + thread3.getPriority());
    }
}

