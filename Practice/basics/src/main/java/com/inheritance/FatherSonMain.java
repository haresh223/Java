package com.inheritance;

import com.basics.exception.PersonNotFoundException;

public class FatherSonMain {

    public static void main(String[] args) {

        Father f = new Father();
        f.setFirstName("Abc");
        f.setLastName("D");
        f.setOccupation("Employee");

        Son s = new Son();
        s.setFirstName("JKL");
        s.setAge(10);
        s.setOccupation("Student");
        try {
            f.findFather() ;
        } catch(PersonNotFoundException e) {
            System.out.println("ERROR: " + e.getMessage());
            e.printStackTrace();
        }
    }
}




