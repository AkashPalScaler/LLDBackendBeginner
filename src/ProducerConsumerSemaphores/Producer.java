package ProducerConsumerSemaphores;

import java.util.concurrent.Semaphore;

public class Producer implements Runnable{
    Store store;
    Semaphore prodSema;
    Semaphore consSema;


    public Producer(Store store, Semaphore prodSema, Semaphore consSema){

        this.store = store;
        this.prodSema = prodSema;
        this.consSema = consSema;
    }
    public void run(){
        while(true){
                //producer--
            try {
                prodSema.acquire();
//                Thread.sleep(20); //Producer working on creating the food
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            store.addItem();
                    consSema.release();
                //Consumer++

        }
    }
}
