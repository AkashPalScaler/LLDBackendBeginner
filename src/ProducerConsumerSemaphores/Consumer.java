package ProducerConsumerSemaphores;

import java.util.concurrent.Semaphore;

public class Consumer implements Runnable{
    Store store;
    Semaphore prodSema;
    Semaphore consSema;


    public Consumer(Store store, Semaphore prodSema, Semaphore consSema){

        this.store = store;
        this.prodSema = prodSema;
        this.consSema = consSema;
    }


    public void run(){
        while(true){
            try {
                consSema.acquire();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            store.removeItem();

            prodSema.release();
        }
    }
}
