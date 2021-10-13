package com.company;

import java.util.ArrayList;
import java.util.List;

public class Customer extends Person {

    //Attribute
    private boolean returnedLate;                                      //schonmal eine verspätete Rückgabe
    private double unpaidFees;                                         //unbezahlte Gebühren
    private List<com.company.Book> rentedBooks = new ArrayList<>();    //Momentan ausgeliehene Bücher
    private CustomerStatus customerStatus;


    //Konstruktoren
    public Customer(){

    }

    public Customer(String lastName, String firstName, String country, boolean returnedLate, double unpaidFees, CustomerStatus customerStatus){
        super(lastName, firstName, country);
        this.returnedLate = returnedLate;
        this.unpaidFees = unpaidFees;
        this.customerStatus = customerStatus;
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

    public List<com.company.Book> getRentedBooks() {
        return rentedBooks;
    }

    public void setRentedBooks(List<com.company.Book> rentedBooks) {
        this.rentedBooks = rentedBooks;
    }

    public void setUnpaidFees(double unpaidFees) {
        this.unpaidFees = unpaidFees;
    }

    public CustomerStatus getCustomerStatus() {
        return customerStatus;
    }

    public void setCustomerStatus(CustomerStatus customerStatus) {
        this.customerStatus = customerStatus;
    }
}