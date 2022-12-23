package com.example.thelephonebook;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity

public class PhoneBook {
    private String firstName;
    @Id
    private String lastName;
    private int telephoneNumber;

    public PhoneBook() {
    }

    public PhoneBook(String firstName, String lastName, int telephoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.telephoneNumber = telephoneNumber;
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

    public int getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(int telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    @Override
    public String toString() {
        return "PhoneBook{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", telephoneNumber=" + telephoneNumber +
                '}';
    }


}
