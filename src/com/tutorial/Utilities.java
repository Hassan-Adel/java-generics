package com.tutorial;

public class Utilities {
    public static <T extends Comparable<T>> T max(T first , T second){
        return first.compareTo(second) > 0 ? first : second;
    }
}
