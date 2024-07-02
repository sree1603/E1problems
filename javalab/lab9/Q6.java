import java.util.ArrayList;
import java.util.List;

class PrimeSumThread extends Thread {
    private int start;
    private int end;
    private long sum;

    public PrimeSumThread(int start, int end) {
        this.start = start;
        this.end = end;
        this.sum = 0;
    }

    private boolean isPrime(int number) {
        if (number <= 1) return false;
        if (number == 2) return true;
        if (number % 2 == 0) return false;
        for (int i = 3; i <= Math.sqrt(number); i += 2) {
            if (number % i == 0) return false;
        }
        return true;
    }

    @Override
    public void run() {
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                sum += i;
            }
        }
    }

    public long getSum() {
        return sum;
    }
}

public class Q6 {
    public static void main(String[] args) {
        int limit = 100;  // The upper limit to find prime numbers
        int numberOfThreads = 4;  // Number of threads to use

        // Calculate the range for each thread
        int range = limit / numberOfThreads;
        List<PrimeSumThread> threads = new ArrayList<>();

        for (int i = 0; i < numberOfThreads; i++) {
            int start = i * range + 1;
            int end = (i == numberOfThreads - 1) ? limit : (i + 1) * range;
            PrimeSumThread thread = new PrimeSumThread(start, end);
            threads.add(thread);
            thread.start();
        }

        // Wait for all threads to complete
        long totalSum = 0;
        for (PrimeSumThread thread : threads) {
            try {
                thread.join();
                totalSum += thread.getSum();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Print the total sum of prime numbers
        System.out.println("The sum of all prime numbers up to " + limit + " is: " + totalSum);
    }
}

