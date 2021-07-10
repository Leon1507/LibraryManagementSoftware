package com.company;

import java.util.ArrayList;
import java.util.List;

public class Author extends Person implements IAuthorService{

    //Attribute
    private String currentPublisher;                                //Name des Verlages für den der Autor schreibt
    ArrayList<Book> authoredBooks = new ArrayList<Book>();          //Liste mit Büchern die der Autor geschrieben hat


    //Konstruktoren
    public Author (){

    }

    public Author(String lastName, List<String> firstNames, String country, String currentPublisher){
        super(lastName, firstNames, country);
        this.currentPublisher = currentPublisher;
    }


    //Methoden


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

    @Override
    public List<Author> getAuthorsOfMultipleBooks() {
        return null;
    }

    @Override
    public List<Author> getAuthorsFromCountry(String country) {
        return null;
    }

    @Override
    public void addBookToAuthor(Book book, Author author) {

    }
}
