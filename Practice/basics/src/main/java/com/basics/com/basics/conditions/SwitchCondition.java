package com.basics.com.basics.conditions;

public class SwitchCondition {

    public static void main(String[] args) {

        String fruit = "Mango";

        switch(fruit) {

            case "Mango":
                System.out.println("Fruit is :" + fruit);
                break;
            case "Orange":
                System.out.println("Fruit is : " + fruit);
                break;
            default:
                System.out.println("Unknown fruit");
        }

    }
}
