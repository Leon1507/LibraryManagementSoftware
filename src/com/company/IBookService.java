package com.company;


import java.util.List;
import com.company.Author;
import com.company.Book;

public interface IBookService {

    List<Book> getBooksFromYear(int year);

    void addAuthorToBook(Author author, Book book);


}
