package com.company;

import java.util.ArrayList;
import java.util.List;

public class Person {

    //Eigenschaften
    private String lastName;
    private String firstName;
    private String country;


    //Konstruktor
    public Person(){

    }

    public Person(String lastName, String firstNames, String country){
        this.lastName = lastName;
        this.firstName = firstName;
        this.country = country;
    }


    //Methoden

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstNames() {
        return firstName;
    }

    public void setFirstNames(String firstNames) {
        this.firstName = firstName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
