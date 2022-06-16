package Threading;

public class MyThreads {
    private Thread thread;
    private String threadName;

    MyThreads(String msg) {
        threadName = msg;
        System.out.println("Creating thread: " + threadName);
    }

    public void run() {
        System.out.println("Running thread: " + threadName);
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("Thread: " + threadName + ", " + i);
                Thread.sleep(0);
            }
        } catch (InterruptedException e) {
            System.out.println("Exception in thread: " + threadName);
        }
        System.out.println("Thread " + threadName + " continue...");
    }

    public void start() {
        System.out.println("Start method " + threadName);
        if (thread == null) {
            thread = new Thread(this.threadName);
            thread.start();
        }
    }
}
