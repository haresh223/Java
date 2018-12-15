package com.basics.haresh.practice;

import java.util.Arrays;

public class ArraySorting {
        public static void main (String [] args) {
            int [] a = {300,204,1,7,56,77,45,33,0,1,6,700};

            Arrays.sort(a);
            // Just print the sorrted values in for loop
            for (int i = 0; i < a.length; i++) {
                System.out.println(a[i]);
            };
        }
}


