package com.tutorial;

import com.tutorial.generics.GenericsList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        var myList = new GenericsList<Integer>();
        myList.add(12);
        int test = myList.get(0);
    }
}
