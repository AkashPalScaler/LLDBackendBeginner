package AdderSubtractor;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;


public class Subtractor implements Callable<Void> {
    private Value v;
    private Lock lock;

    Subtractor(Value x, Lock lock){
        v = x;
        this.lock = lock;
    }

    public Void call (){
        for(int i = 1;i <=50000; i++){
//            lock.lock();
//////                System.out.println("Lock acquired for subtractor : " + i);
//////                this.v.value -= i;
//////            lock.unlock();

            synchronized (this.v){
                this.v.value -= i;
            }
        }
        return null;
    }
}