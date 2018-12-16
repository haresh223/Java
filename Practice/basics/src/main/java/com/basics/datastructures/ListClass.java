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
        myList.add(4,60);
        myList.add(5,60);
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
        haresh.add("Babu"); //0
        haresh.add("Pakki"); //1
        System.out.println(haresh);
        System.out.println(haresh.get(1));


        //Return List between 2nd(Including)
        //Return 4 element (Excluding)
        List<String> ra ;

        haresh.add("Babu");  //2
        haresh.add("Pakki"); //3
        haresh.add("Divij"); //4
        haresh.add("anu"); //5
        haresh.add("kar"); //6

        ra = haresh.subList(1, 3);
        System.out.println("sublist: " +ra);
        System.out.println(haresh);

        // Using indexOf() and lastIndexOf()
        System.out.println("first index:" + haresh.indexOf("Babu"));
        System.out.println("last index:" + haresh.lastIndexOf("Pakki"));
        System.out.println("Index of element"+ " not present : " + haresh.indexOf("Hello"));
    }
}

