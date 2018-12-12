package com.basics.com.basics.conditions;

public class IfCondition {

    public static void main(String[] args) {

        int a = -10;
        int b = 10;

        if (a > b) {
            System.out.println("A is greater");
        } else if (a == b) {
            System.out.println("A is equal to B");
        } else if (a < 0) {
            System.out.println(" A is a negative number");
        }
    }
}
