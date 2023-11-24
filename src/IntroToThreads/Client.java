package IntroToThreads;

public class Client {
    public static void main(String[] args) {
        System.out.println("Current thread: " + Thread.currentThread().getName());
        System.out.println("Current thread: " + Thread.currentThread().getName());
        System.out.println("Current thread: " + Thread.currentThread().getName());

        Runnable h = new HelloWorldPrinter();

        h.run();

        Thread t1 = new Thread(h);
        t1.start();

        Thread t2 = new Thread(h);

        t2.start();
    }
}
