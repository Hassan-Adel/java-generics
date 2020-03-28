package com.tutorial.generics;
//Add constraint for T (Float, Int, Double)
//T is bounded
public class GenericsList<T extends Number & Comparable> {
    private T[] items = (T[]) new Object[10];
    private int count;

    public void add(T item){
        items[count++] = item;
    }
    public T get(int index){
        return items[index];
    }
}
