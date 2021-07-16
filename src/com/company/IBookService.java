package com.company;


import java.util.List;

public interface IBookService {

    List<Book> getBooksFromYear(int year);

    void addAuthorToBook(Author author, Book book);


}
