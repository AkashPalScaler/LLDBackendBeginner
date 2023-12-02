package Generics;

import Interfaces.Animal;

import java.util.ArrayList;
import java.util.List;

public class Pair<E, V extends Animal> {
    private E first;
    private V second;

    public static <T, G > T someFun(T temp, G tmp2){
        List<T> store = new ArrayList<T>();
        store.add(temp);
        return temp;
    }

    public void setFirst(E first){
        this.first = first;
    }

    public E getFirst(){
        return first;
    }

    public void setSecond(V second){
        this.second = second;
    }

    public V getSecond(){
        return second;
    }

    public <T extends Number> Long add(T first, T second){
        return first.longValue()  + second.longValue();
    }

//    public E add(){
//        return first+second;
//    }

}
