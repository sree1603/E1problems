
public class Q2{
    public static void main(String[] args) {
        GoodMorningThread goodMorningThread = new GoodMorningThread();
        WelcomeThread welcomeThread = new WelcomeThread();

        goodMorningThread.start();
        welcomeThread.start();
    }
}
class GoodMorningThread extends Thread {
    public void run() {
        while(true) {
            System.out.println("Good morning");
            try {
                Thread.sleep(100); // Sleep for 100 milliseconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class WelcomeThread extends Thread {
    public void run() {
        while(true) {
            System.out.println("Welcome");
            try {
                Thread.sleep(200); // Sleep for 200 milliseconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


