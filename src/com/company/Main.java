package com.company;

import java.util.Collections;
import java.util.List;

import static com.company.Book.createBook;

public class Main {

    public static void main(String[] args) {

        //Author RobertKiyosaki = new Author("Kiyosaki", Collections.singletonList("Robert"), "Mainz", "FBV");
        //Author TimothyFerriss = new Author("Kiyosaki", Collections.singletonList("Robert"), "Mainz", "FBV");
        //createBook(Collections.singletonList(RobertKiyosaki), "Rich Dad Poor Dad", 240, 2014, Language.ENGLISCH, "978-3-89879-882-2", BookStatus.VERLIEHEN);
        //createBook(Collections.singletonList(TimothyFerriss), "Die 4-Stunden-Woche", 352, 2015, Language.DEUTSCH, "978-3-548-37596-0 ", BookStatus.AUF_LAGER);

        //Book buch1 = new Book("Robert", "Rich Dad Poor Dad", 240, 2014, Language.DEUTSCH, "978-3-89879-882-2");
        //buch1.Library.book.add(buch1);

        //Library.setBooks((List<Book>) buch1);
        //Library.books.add(buch1);

        Book.printBook();


        //Testing
        BookService.getRentedBooksInLanguage(Language.DEUTSCH);

    }
}
