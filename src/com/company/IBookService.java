package com.company;


import java.util.ArrayList;
import java.util.List;

public interface IBookService {

    static List<Book> getBooksFromYear(int year){
        List<com.company.Book> booksSameYear = new ArrayList<Book>();
        for (com.company.Book book: com.company.Library.getBooks()) {
            if(book.getYear() == year){
                booksSameYear.add(book);
            }
        }
        return booksSameYear;
    }
    void addAuthorToBook(Author author, Book book);
    static List<Book> availableBooks(){
        List<com.company.Book> stateAUF_LAGER = new ArrayList<com.company.Book>();
        for (com.company.Book book: com.company.Library.getBooks()) {
            if(book.getBookStatus() == BookStatus.AUF_LAGER){
                stateAUF_LAGER.add(book);
            }
        }
        return stateAUF_LAGER;
    }
    static List<Book> getRentedBooksInLanguage(Language language){
        List<com.company.Book> stateVerliehen = new ArrayList<com.company.Book>();
        for (com.company.Book book: com.company.Library.getBooks()) {
            if(book.getLanguage() == language && book.getBookStatus() == BookStatus.VERLIEHEN){
                stateVerliehen.add(book);
            }
        }
        return stateVerliehen;
    }


}
