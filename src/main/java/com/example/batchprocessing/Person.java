package com.example.batchprocessing;

import java.math.BigInteger;

public class Person {

    private BigInteger personId;
    private String lastName;
    private String firstName;

    public Person() {
    }

    public Person(BigInteger personId, String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.personId = personId;
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.personId = personId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "firstName: " + firstName + ", lastName: " + lastName;
    }

    public BigInteger getPersonId() {
        return personId;
    }

    public void setPersonId(BigInteger personId) {
        this.personId = personId;
    }
}
