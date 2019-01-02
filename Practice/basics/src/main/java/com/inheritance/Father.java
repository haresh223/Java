package com.inheritance;

import com.basics.Person;
import com.basics.exception.PersonNotFoundException;

public class Father extends Person {

    private String occupation;

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public void findFather() throws PersonNotFoundException {
        throw new PersonNotFoundException("No such person found");
    }
}
