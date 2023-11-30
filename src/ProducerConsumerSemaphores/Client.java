package ProducerConsumerSemaphores;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class Client {
    public static void main(String[] args) {
        Store store = new Store(5);
        Semaphore prodSema = new Semaphore(5);
        Semaphore consSema = new Semaphore(0);
        Producer producer = new Producer(store, prodSema, consSema);
        Consumer consumer = new Consumer(store, prodSema, consSema);

        ExecutorService es = Executors.newCachedThreadPool();
        for(int i=0;i<8;i++){
            es.execute(producer);
        }
        for(int i=0;i<20;i++){
            es.execute(consumer);
        }
    }
}
