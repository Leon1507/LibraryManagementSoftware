package com.company;

import java.util.ArrayList;
import java.util.List;

public class Author extends Person {

    //Attribute
    private String currentPublisher;                                //Name des Verlages für den der Autor schreibt
    protected ArrayList<Book> authoredBooks = new ArrayList<Book>();          //Liste mit Büchern die der Autor geschrieben hat


    //Konstruktoren
    public Author (){

    }

    public Author(String lastName, String firstName, String country, String currentPublisher){
        super(lastName, firstName, country);
        this.currentPublisher = currentPublisher;
    }


    //Methoden

    public static void createAuthor(String lastName,String firstName, String country, String currentPublisher){
        Author author = new Author(lastName, firstName, country, currentPublisher);
        Library.authors.add(author);
    }


    public String getCurrentPublisher() {
        return currentPublisher;
    }

    public void setCurrentPublisher(String currentPublisher) {
        this.currentPublisher = currentPublisher;
    }

    public ArrayList<Book> getAuthoredBooks() {
        return authoredBooks;
    }

    public void setAuthoredBooks(ArrayList<Book> authoredBooks) {
        this.authoredBooks = authoredBooks;
    }

}
