package com.tutorial;

import com.tutorial.generics.GenericsList;

public class Utilities {
    public static <T extends Comparable<T>> T max(T first , T second){
        return first.compareTo(second) > 0 ? first : second;
    }
    public static void printUsers(GenericsList<User> users){
    }
}
