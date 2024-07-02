class EvenThread extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println("Even: " + i);
                try {
                    // Sleep for a short time to simulate work
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    System.out.println("EvenThread interrupted");
                }
            }
        }
    }
}

class OddThread extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 20; i++) {
            if (i % 2 != 0) {
                System.out.println("Odd: " + i);
                try {
                    // Sleep for a short time to simulate work
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    System.out.println("OddThread interrupted");
                }
            }
        }
    }
}

public class Q5 {
    public static void main(String[] args) {
        // Create threads
        EvenThread evenThread = new EvenThread();
        OddThread oddThread = new OddThread();

        // Start threads
        evenThread.start();
        oddThread.start();
    }
}

