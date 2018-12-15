package com.basics.haresh.practice;
import java.util.Arrays;
public class ReverseArray {
    public static void main(String[] args) {

        int[] array = { 1, 2, 3, 4 ,5};   // { 5,4,3,2,1}

        for (int i = 0; i <= (array.length-1)/2; i++) {

            int temp = 0;
            temp = array[i];  // temp  = 1
            array[i] = array[array.length-(i+1)] ;
            array[array.length-(i+1)] = temp;

           // System.out.println(a[i]);
            //System.out.println(Arrays.toString(a));
        }

        for(int a : array) {
            System.out.println(a);
        }
    }
}

//insert sort and bubble sort


// a[0] == 1

// Expection: a[0] == 5;

