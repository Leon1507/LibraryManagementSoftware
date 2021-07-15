package com.company;

import java.util.ArrayList;
import java.util.List;

public class Person {

    //Eigenschaften
    private String lastName;
    private List<String> firstNames = new ArrayList<String>();
    private String country;


    //Konstruktor
    public Person (){

    }

    public Person(String lastName, List<String> firstNames, String country){
        this.lastName = lastName;
        this.firstNames = firstNames;
        this.country = country;
    }

<<<<<<< HEAD
    //Methoden


=======
>>>>>>> 62e52cb80a99513988ae0576d7f0fcf5a5b7be24
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<String> getFirstNames() {
        return firstNames;
    }

    public void setFirstNames(List<String> firstNames) {
        this.firstNames = firstNames;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
