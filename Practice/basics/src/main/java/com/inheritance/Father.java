package com.inheritance;

import com.basics.Person;

public class Father extends Person {

    private String occupation;

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }
}
