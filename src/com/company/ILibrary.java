package com.company;

import com.company.Book;
import com.company.Author;
import com.company.Customer;

public interface ILibrary {

    void addBook(Book book);

    void removeBook(Book book);

    void addAuthor(Author author);

    void removeAuthor(Author author);

    void addCustomer(Customer customer);

    void removeCustomer(Customer customer);


}
