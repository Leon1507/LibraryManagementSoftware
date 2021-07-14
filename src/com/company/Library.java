package com.company;

import java.util.ArrayList;
import java.util.List;

public class Library  implements ILibrary {

    //Attribute
    protected static List<Book> books = new ArrayList<Book>();
    protected static List<Author> authors = new ArrayList<Author>();
    protected static List<Customer> customers = new ArrayList<Customer>();

    //Konstruktoren
    public Library(){

    }

    //Methoden



    //Getter & Setter
    public static List<Book> getBooks() {
        return books;
    }

    public static void setBooks(List<Book> books) {
        Library.books = books;
    }

    public static List<Author> getAuthors() {
        return authors;
    }

    public static void setAuthors(List<Author> authors) {
        Library.authors = authors;
    }

    public static List<Customer> getCustomers() {
        return customers;
    }

    public static void setCustomers(List<Customer> customers) {
        Library.customers = customers;
    }

    //Methoden aus dem Interface
    @Override
    public void addBook(Book book) {

    }

    @Override
    public void removeBook(Book book) {

    }

    @Override
    public void addAuthor(Author author) {

    }

    @Override
    public void removeAuthor(Author author) {

    }

    @Override
    public void addCustomer(Customer customer) {

    }

    @Override
    public void removeCustomer(Customer customer) {

    }
}
