package com.company;

public class Main {

    public static void main(String[] args) {

        Book.createBook("Robert Kiyosaki", "Rich Dad Poor Dad", 240, 2014, "Deutsch", "978-3-89879-882-2");
        Book.createBook("Timothy Ferriss", "Die 4-Stunden-Woche", 352, 2015, "Deutsch", "978-3-548-37596-0 ");

        Book.printBook();
    }
}
