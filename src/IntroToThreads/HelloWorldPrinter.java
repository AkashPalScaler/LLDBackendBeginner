package IntroToThreads;

public class HelloWorldPrinter implements Runnable {
    public void run(){
        System.out.println("Hello world from " + Thread.currentThread().getName());
    }
}
