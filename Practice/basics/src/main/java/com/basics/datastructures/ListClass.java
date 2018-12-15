package com.basics.datastructures;

import java.util.*;

public class ListClass {

    public static void main(String[] args) {

        int n=5 ;
        List<Integer> myList = new ArrayList<>(5);
        myList.add(10); // Index 0 is 10
        myList.add(20); // Index 1 is 20
        myList.add(2,30);
        myList.add(3, 60);
        myList.remove(2);
        System.out.println(myList);
        System.out.println(myList.get(1));
        // Replace 0th element with 5
        myList.set(0, 4);
        System.out.println(myList);

        // // Appending the new element at the end of the list
        for (int i=1; i<n ;i++)
            myList.add(i);
        System.out.println(myList);

        List<String> haresh = new ArrayList<String>(5);
        haresh.add("Babu");
        haresh.add("Pakki");
        System.out.println(haresh);
        System.out.println(haresh.get(1));


        //Return List between 2nd(Including)
        //Return 4 element (Excluding)
        List<String> ra = new ArrayList<String>();

        haresh.add("Babu");
        haresh.add("Pakki");
        haresh.add("Divij");
        haresh.add("anu");
        haresh.add("kar");

        ra =haresh.subList(1, 3);
        System.out.println("range");

        // Using indexOf() and lastIndexOf()
        System.out.println("first index:" + haresh.indexOf("Babu"));
        System.out.println("last index:" + haresh.lastIndexOf("Pakki"));
        System.out.println("Index of element"+ " not present : " + haresh.indexOf("Hello"));
    }
}

