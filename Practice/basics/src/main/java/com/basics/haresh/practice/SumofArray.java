package com.basics.haresh.practice;
public class SumofArray {
        public static void main(String[] args){

            int a[] = {10, 20,30,-10,10};
            int sum = 0;

            for (int i = 0; i < a.length; i++)
                sum += a[i];
            System.out.println("Sum of the array values: "+sum);
        }
}


