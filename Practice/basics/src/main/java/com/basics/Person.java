package com.basics;

public class Person {

    private String firstName;
    private String lastName;
    private int age;

    public void personDetails() {
        firstName  = "Jhon";
        lastName = "Stewart";
        age = 5;

        System.out.println("FirstName: "+ firstName);

    }

    public static void main(String[] args) {
        Person p = new Person();
        p.personDetails();
    }
}

