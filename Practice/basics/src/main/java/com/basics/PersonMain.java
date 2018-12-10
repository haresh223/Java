package com.basics;

public class PersonMain {

    public static void main(String[] args) {
        Person p = new Person();
        p.setFirstName("shiva");
        p.setFirstName("Mahesh");
        p.setLastName("Reddy");
        p.setAge(25);
        p.personDetails();
        System.out.println(p);
        Person p1 = new Person();
        p1.personDetails();
        System.out.println(p1);
        Person p2 = new Person("xyz", "abc", 10, "Male");
        System.out.println(p2);
    }
}

// Consturctors are simimilar to methods but differ in few aspects

/***
 1. constructor name should be same as the class name;
 2. construcotrs will not have any return value not even void
 3. constructos are called only once, when the object is being created
 ***/