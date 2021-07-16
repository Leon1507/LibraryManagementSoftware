package com.company;

import java.util.ArrayList;
import java.util.List;

public class BookService implements com.company.IBookService {

    //Attribute


    //Konstruktoren
    public BookService(){

    }

    //Methoden


    @Override
    public List<com.company.Book> getBooksFromYear(int year) {
        List<com.company.Book> booksSameYear = new ArrayList<com.company.Book>();
        for (com.company.Book book: com.company.Library.getBooks()) {
            if(book.getYear() == year){
                booksSameYear.add(book);
            }
        }
        return booksSameYear;
    }


    @Override
    public void addAuthorToBook(com.company.Author author, com.company.Book book) {
        //Book.setAuthor(author);
    }
}
