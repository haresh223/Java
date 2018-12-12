package com.basics.com.basics.conditions;

public class ForCondition {

    public static void main(String[] args) {

        for( int i = 0; i <= 5; i++) {
            System.out.println("i = " + i);
        }

        for( int i = 1 ; i <= 5; i++) {
            for (int j = 1 ; j <= 5; j++) { // i = 1 j = 1
                System.out.println(i*j);
            }
        }
    }
}