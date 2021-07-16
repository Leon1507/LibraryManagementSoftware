package com.company;

import java.util.List;

public interface IAuthorService {

    List<Author> getAuthorsOfMultipleBooks();

    List<Author> getAuthorsFromCountry(String country);

    void addBookToAuthor(Book book, Author author);


}
