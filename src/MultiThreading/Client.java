package MultiThreading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.*;
public class Client {
//    public static void main(String[] args) {
//        for(int i = 0;i<100;i++){
//
//            NumberPrinter np = new NumberPrinter(i);
//            Thread t = new Thread(np);
//
//            t.start();
//        }
//    }
    //ThreadPool
    public static void main(String[] args) {
        //This is creating a pool of thread to be assigned some tasks
        ExecutorService es = Executors.newFixedThreadPool(10);

        for(int i = 0;i<1000000;i++){
            NumberPrinter np = new NumberPrinter(i);
            es.execute(np);
        }
    }
}

