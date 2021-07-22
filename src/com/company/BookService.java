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

    @Override
    public List<Book> availableBooks() {
        List<com.company.Book> stateAUF_LAGER = new ArrayList<com.company.Book>();
        for (com.company.Book book: com.company.Library.getBooks()) {
            if(book.getBookStatus() == BookStatus.AUF_LAGER){
                stateAUF_LAGER.add(book);
            }
        }
        return stateAUF_LAGER;

    }

    @Override
    public List<Book> getRentedBooksInLanguage(String language) {
        List<com.company.Book> stateVerliehen = new ArrayList<com.company.Book>();
        for (com.company.Book book: com.company.Library.getBooks()) {
            if(book.getLanguage() == language && book.getBookStatus() == BookStatus.VERLIEHEN){
                stateVerliehen.add(book);
            }
        }
        return stateVerliehen;


    }
}
