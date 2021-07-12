package com.company;

import java.util.List;
import com.company.Author;

public class AuthorService implements IAuthorService{


    //Konstruktoren
    public AuthorService(){

    }

    //Methoden


    @Override
    public List<Author> getAuthorsOfMultipleBooks() {
        for (Author author:Library.getAuthors()) {

        }
        for(int i = 0; i <Library.)

        return ;
    }

    @Override
    public List<Author> getAuthorsFromCountry(String country) {
        return null;
    }

    @Override
    public void addBookToAuthor(Book book, Author author) {

    }
}
