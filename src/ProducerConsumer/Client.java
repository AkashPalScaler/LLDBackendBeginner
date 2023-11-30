package ProducerConsumer;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String[] args) {
        Store store = new Store(5);
        Producer producer = new Producer(store);
        Consumer consumer = new Consumer(store);

        ExecutorService es = Executors.newCachedThreadPool();
        for(int i=0;i<8;i++){
            es.execute(producer);
        }
        for(int i=0;i<20;i++){
            es.execute(consumer);
        }
    }
}
