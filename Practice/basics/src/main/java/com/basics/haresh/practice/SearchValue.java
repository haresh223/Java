package com.basics.haresh.practice;

public class SearchValue {

        public static void main(String[] args) {
            int[] a = { 100, 33, 28, 34, 56, 8, 55, 33, 11, 77 };
            int search = 11;

            for (int i = 0; i < a.length; i++) {
                System.out.println("False");
                if (a[i] == search) {
                    System.out.println("True");
                    System.out.println("Element found at index " + i);
                    break;
                }
                System.out.println(a[i]);
            }
        }
}

//1. sort  78
//2. 5, 8, 11, 54, 78, 99, 102, 79, 12, 56

//lenngth = 7
//        loop:
//lenght - 1/ 2 = a[3]
//a[3] < 99
//11 < 78 ? go right 3 = i lenght = 7 7-3 =4/ 2
//else go left
///divide and conquer algorithem
// Binary search
// Binaery sort
// Binary tree
// Heap sort
// Priority queue
//   data  hypernate or spring jdfc templetate(ORM)
//Rober Lafore

