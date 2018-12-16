package com.basics.datastructures;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetClass {

     // A set will contain a duplicate value

    // md5checksum

    public static void main(String[] args) {
        Set<Integer> integerSet = new HashSet<>();
        integerSet.add(9);
        integerSet.add(90);
        integerSet.add(11);
        integerSet.add(11);
        integerSet.add(11);
        integerSet.add(11);
        integerSet.add(10);
        System.out.println("Our Final Integer Set:" +integerSet);
        integerSet = new TreeSet<>();integerSet.add(9);
        integerSet.add(90);
        integerSet.add(11);
        integerSet.add(11);
        integerSet.add(11);
        integerSet.add(11);
        integerSet.add(10);
        System.out.println("Our Final Integer Set:" +integerSet);
     }
}
