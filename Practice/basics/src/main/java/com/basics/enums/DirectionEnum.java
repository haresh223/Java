package com.basics.enums;

import apple.laf.JRSUIConstants;

enum Directions {EAST, WEST, NORTH, SOUTH} // Enum declaration
public class DirectionEnum {

     int value;
     enum EmployeeType {PERM, CONT, INTERN}
    // creating a constant
    private static final int CONST_VAL = 5;
    public static void main(String[] args) {
        // this below line will not work
        //CONST_VAL = 10;

        System.out.println(CONST_VAL);
        System.out.println(new FinalDirectionExample().findDirection(5));

        Directions direction = Directions.EAST;
        EmployeeType et = EmployeeType.PERM;

        System.out.println(et);


        CoffeeSize cs = CoffeeSize.LARGE;
        System.out.println("Coffee Size: " + cs);

        switch(direction) {
            case EAST:
                System.out.println("EAST Direction");
                break;

        }

        for(Directions direct : Directions.values()) {
            System.out.println(direct);
        }
       // System.out.println(direction);
    }
}


class FinalDirectionExample {

    private static final int EAST = 1;
    private static final int WEST = 2;
    private static final int NORTH = 3;
    private static final int SOUTH = 4;

    int whichDirection = 0;


    public int findDirection(int direction) {
        if(direction < 1 || direction > 4) System.out.println("Error out");
        if(direction == 1) {
            whichDirection = EAST;
        }
        if(direction == 2) {
            whichDirection = WEST;
        }
        return whichDirection;
    }
}