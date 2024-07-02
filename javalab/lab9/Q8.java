class Counter {
    private int count = 0;

    // Method to increment the counter
    public synchronized void increment() {
        count++;
    }

    // Method to get the current value of the counter
    public int getCount() {
        return count;
    }
}

class IncrementThread extends Thread {
    private final Counter counter;

    public IncrementThread(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.increment();
        }
    }
}

public class Q8 {
    public static void main(String[] args) {
        Counter counter = new Counter();
        int numberOfThreads = 10;
        Thread[] threads = new Thread[numberOfThreads];

        // Create and start multiple threads
        for (int i = 0; i < numberOfThreads; i++) {
            threads[i] = new IncrementThread(counter);
            threads[i].start();
        }

        // Wait for all threads to complete
        for (int i = 0; i < numberOfThreads; i++) {
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Print the final counter value
        System.out.println("Final Counter Value: " + counter.getCount());
    }
}

