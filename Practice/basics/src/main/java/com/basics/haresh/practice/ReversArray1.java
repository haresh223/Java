package com.basics.haresh.practice;

public class ReversArray1 {

    public static void main(String args[]) {
        int arr[] = {10, 40, 70, 20, 15, 60};
        printArray(arr, 6);
        revereseArray(arr, 0, 5);
        System.out.print("Reversed array is \n");
        printArray(arr, 6);
    }
        static void revereseArray(int arr[], int start, int end)
        {
            int temp;
            while (start < end)
            {
                temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }

        static void printArray(int arr[], int size)
        {
            for (int i = 0; i < size; i++)
                System.out.print(arr[i] + " ");
            System.out.println();
        }
    }

