package com.company;

import java.util.ArrayList;
import java.util.List;

public class BookService implements IBookService{

    //Attribute


    //Konstruktoren
    public BookService(){

    }

    //Methoden


    @Override
    public List<Book> getBooksFromYear(int year) {
        List<Book> booksSameYear = new ArrayList<Book>();
        for (Book book:Library.getBooks()) {
            if(book.getYear() == year){
                booksSameYear.add(book);
            }
        }
        return booksSameYear;
    }


    @Override
    public void addAuthorToBook(Author author, Book book) {
        //Book.setAuthor(author);
    }
}
