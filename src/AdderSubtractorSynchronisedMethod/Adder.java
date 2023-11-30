package AdderSubtractorSynchronisedMethod;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

public class Adder implements Callable<Void> {
    private Value v;
    private Lock lock;

    Adder(Value x, Lock lock){
        v = x;
        this.lock = lock;
    }
    public Void call (){


        for(int i = 1;i <=50000; i++){
            this.v.increment(i);
        }

        return null;
    }
}