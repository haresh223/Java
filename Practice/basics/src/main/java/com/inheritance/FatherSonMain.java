package com.inheritance;

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
    }
}
