package com.company;

import com.company.Book;
import com.company.Author;

import java.util.List;

public interface IAuthorService {

    List<Author> getAuthorsOfMultipleBooks();

    List<Author> getAuthorsFromCountry(String country);

    void addBookToAuthor(Book book, Author author);


}
