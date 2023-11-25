package MultiThreading;

public class NumberPrinter implements Runnable{
    int numToPrint;

    NumberPrinter(int num){
        numToPrint = num;
    }

    public void run(){
        System.out.println("Number : " + numToPrint + " Current Thread : " + Thread.currentThread().getName());
    }
}
