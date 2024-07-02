public class Q9{

    private int counter = 0;

    // Synchronized method to ensure thread safety
    public synchronized void increment() {
        counter++;
    }

    public int getCounter() {
        return counter;
    }

    public static void main(String[] args) {
        Q9 counterIncrement = new Q9();
        int numberOfThreads = 10; // Number of threads to create
        int incrementsPerThread = 1000; // Number of increments per thread

        Thread[] threads = new Thread[numberOfThreads];

        // Create and start threads
        for (int i = 0; i < numberOfThreads; i++) {
            threads[i] = new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int j = 0; j < incrementsPerThread; j++) {
                        counterIncrement.increment();
                    }
                }
            });
            threads[i].start();
        }

        // Wait for all threads to finish
        for (int i = 0; i < numberOfThreads; i++) {
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Print the final counter value
        System.out.println("Final counter value: " + counterIncrement.getCounter());
    }
}

