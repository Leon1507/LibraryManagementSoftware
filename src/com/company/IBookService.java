package com.company;


import java.util.ArrayList;
import java.util.List;

public interface IBookService {

    //Methode um alle Bücher eines Erscheinungsjahr zu finden
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

    //Methode um alle verfügbaren Bücher zu finden (Status Auf_Lager)
    static List<Book> availableBooks(){
        List<com.company.Book> stateAUF_LAGER = new ArrayList<com.company.Book>();
        for (com.company.Book book: com.company.Library.getBooks()) {
            if(book.getBookStatus() == BookStatus.AUF_LAGER){
                stateAUF_LAGER.add(book);
            }
        }
        return stateAUF_LAGER;
    }

    //Methode um alle ausgeliehenen Bücher von einer bestimmten Sprache zu finden (Status Verliehen)
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
