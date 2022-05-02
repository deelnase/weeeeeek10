package com.example.weeeeeek10;

import java.util.ArrayList;
import java.util.Iterator;

public class exx2006 {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        for (int i = 0; i < 5000000; i++) {
            integers.add(i);
        }
        Iterator<Integer> integerIterator = integers.iterator();
        long startTime = System.currentTimeMillis();
        while (integerIterator.hasNext()){
            Integer i = integerIterator.next();
            System.out.println(i );
        }
        long endTime = System.currentTimeMillis();
        long time1 = endTime-startTime;
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 5000000; i++) {
            System.out.println(integers.get(i));
        }
        endTime = System.currentTimeMillis();
        long time2 = endTime-startTime;
        System.out.println(time1);
        System.out.println(time2);
    }
}
