package com.company;

import java.util.ArrayList;
import java.util.List;

public class AuthorService implements IAuthorService{


    //Konstruktoren
    public AuthorService(){

    }

    //Methoden

    //Gibt alle Autoren zurück, die mehr als ein Buch veröffentlicht haben
    @Override
    public List<Author> getAuthorsOfMultipleBooks() {
        List<Author> multipleBooks = new ArrayList<Author>();
        for (Author author:Library.getAuthors()) {
            if(author.getAuthoredBooks().size()>1){
                multipleBooks.add(author);
            }
        }
        return multipleBooks;
    }

    //Gibt alle Autoren aus, die dem übergebenen Parameter "country" entsprechen
    @Override
    public List<Author> getAuthorsFromCountry(String country) {
        List<Author> sameCountry = new ArrayList<Author>();
        for (Author author:Library.getAuthors()) {
            if(author.getCountry().equals(country)){
                sameCountry.add(author);
            }
        }

        return sameCountry;
    }

    //Fügt der Liste authoredBook des übergebenen Autors ein Buch hinzu
    @Override
    public void addBookToAuthor(Book book, Author author) {
        //mit for each schleife überprüfen ob der Autor bereits vorhanden ist
        /*for (Author author:book.getAuthor()) {

        }
        if()
        author.authoredBooks.add(book);*/
    }

}
