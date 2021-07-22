package com.company;

import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Author RobertKiyosaki = new Author("Kiyosaki", Collections.singletonList("Robert"), "Mainz", "FBV");
        Author TimothyFerriss = new Author("Kiyosaki", Collections.singletonList("Robert"), "Mainz", "FBV");
        Book.createBook(Collections.singletonList(RobertKiyosaki), "Rich Dad Poor Dad", 240, 2014, "Deutsch", "978-3-89879-882-2");
        Book.createBook(Collections.singletonList(TimothyFerriss), "Die 4-Stunden-Woche", 352, 2015, "Deutsch", "978-3-548-37596-0 ");

        Book buch1 = new Book(Collections.singletonList(RobertKiyosaki), "Rich Dad Poor Dad", 240, 2014, "Deutsch", "978-3-89879-882-2");
        //buch1.Library.book.add(buch1);

        Library.setBooks((List<Book>) buch1);


        Book.printBook();
    }
}
