package AdderSubtractorSynchronisedMethod;

public class Value {
    public int value = 0;
    synchronized public void increment(int i){
        value += i;
    }

    synchronized public void decrement(int i){
        value -= i;
    }
}