package com.company;

import java.util.ArrayList;
import java.util.List;
import com.company.*;

public class Book {

    //Eigenschaften
    //private String author;                                          //Autor des Buches
    public List<Author> author = new ArrayList<Author>();                       //Liste um mehrere Autoren zum Buch hinzuzufügen
    private String title;                                           //Buchtitle
    private int pageNo;                                             //Anzahl der Buchseiten
    private int year;                                               //Erscheinungsjahr
    private String language;                                        //Sprache des Buches
    private String isbn;
    protected static final List<Book> bookList = new ArrayList<>();


    //Konstruktoren
    public Book (List<Author> author, String title, int pageNo, int year, String language, String isbn){
        this.author = author;
        this.title = title;
        this.pageNo = pageNo;
        this.year = year;
        this.language = language;
        this.isbn = isbn;

    }

    //Methoden
    //Erstellen eines neuen Buches
    public static void createBook(List<Author> author, String title, int pageNo, int year, String language, String isbn){
        Book book = new Book(author, title, pageNo, year, language, isbn);
        bookList.add(book);

    }

    //Ausgabe aller Bücher
    public static void printBook(){
        for (Book book:bookList) {
            System.out.println("");
            System.out.println("Produktdetails:");
            System.out.println("");
            System.out.println("Autor: " + book.getAuthor() + "        " + "Titel: " + book.getTitle());
            System.out.println("Seitenzahl: " + book.getPageNo() + "               " + "Sprache: " + book.getLanguage());
            System.out.println("Erscheinungsjahr: " + book.getYear() + "        " + "ISBN: " + book.getIsbn());
            System.out.println("--------------------------------------------------------------------");
        }
    }

    public List<Author> getAuthor() {
        return author;
    }

    public void setAuthor(List<Author> author) {
        this.author = author;
    }

    public List<Book> getBookList() {
        return bookList;
    }

    public void setBookList(List<Book> bookList) {
        bookList = bookList;
    }

    /*public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }*/

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPageNo() {
        return pageNo;
    }

    public void setPageNo(int pageNo) {
        this.pageNo = pageNo;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

}
