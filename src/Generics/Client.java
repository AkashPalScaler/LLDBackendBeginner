package Generics;

import Interfaces.Dog;

import java.util.LinkedList;

public class Client {
    public static void main(String[] args) {
        Pair<Integer, Dog> p = new Pair<Integer, Dog>();
//        p.setFirst(10);
//
//        System.out.println(p.getFirst());
        Double x = 10.0;
        Pair.someFun(x, "Akash");

//        Pair p1 = new Pair();
//////        p1.setFirst(new Object());
//////        Object o1 = p1.getFirst();
        p.add(1, 10.0);

    }
}
