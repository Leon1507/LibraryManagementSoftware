package com.company;

import java.util.ArrayList;
import java.util.List;

public class Person {

    //Eigenschaften
    String lastName;
    List<String> firstNames = new ArrayList<String>();
    String country;


    //Konstruktor
    public Person (){

    }

    public Person(String lastName, List<String> firstNames, String country){
        this.lastName = lastName;
        this.firstNames = firstNames;
        this.country = country;
    }

}
