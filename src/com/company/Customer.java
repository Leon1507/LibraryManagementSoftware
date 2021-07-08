package com.company;

import java.util.ArrayList;
import java.util.List;

public class Customer extends Person {

    //Attribute
    private boolean returnedLate;                                   //schonmal eine verspätete Rückgabe
    private double unpaidFees;                                         //unbezahlte Gebühren
    private List<Book> rentedBooks = new ArrayList<>();             //Momentan ausgeliehene Bücher


    //Konstruktoren
    public Customer(){

    }

    public Customer(String lastName, List<String> firstNames, String country, boolean returnedLate, double unpaidFees){
        super(lastName, firstNames, country);
        this.returnedLate = returnedLate;
        this.unpaidFees = unpaidFees;
    }



    //Methoden


    public boolean isReturnedLate() {
        return returnedLate;
    }

    public void setReturnedLate(boolean returnedLate) {
        this.returnedLate = returnedLate;
    }

    public double getUnpaidFees() {
        return unpaidFees;
    }

    public void setUnpaidFees(int unpaidFees) {
        this.unpaidFees = unpaidFees;
    }

    public List<Book> getRentedBooks() {
        return rentedBooks;
    }

    public void setRentedBooks(List<Book> rentedBooks) {
        this.rentedBooks = rentedBooks;
    }
}