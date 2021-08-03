package com.company;

import java.util.ArrayList;
import java.util.List;

public class Book {

    //Eigenschaften
    private String authorfx;                                                            //Autor des Buches
    private List<com.company.Author> author = new ArrayList<Author>();      //Liste um mehrere Autoren zum Buch hinzuzufügen
    private String title;                                                               //Buchtitle
    private int pageNo;                                                                 //Anzahl der Buchseiten
    private int year;                                                                   //Erscheinungsjahr
    //private String language;                                                            //Sprache des Buches
    private Language language;
    private String isbn;
    private BookStatus bookStatus;



    //Konstruktoren
    public Book (List<Author> author, String title, int pageNo, int year, Language language, String isbn, BookStatus bookStatus){
        this.author = author;
        this.title = title;
        this.pageNo = pageNo;
        this.year = year;
        this.language = language;
        this.isbn = isbn;
        this.bookStatus = bookStatus;


    }
    public Book (String authorfx, String title, int pageNo, int year, Language language, String isbn){
        this.authorfx = authorfx;
        this.title = title;
        this.pageNo = pageNo;
        this.year = year;
        this.language = language;
        this.isbn = isbn;

    }


    //Methoden
    //Erstellen eines neuen Buches
    public static void createBook(List<Author> author, String title, int pageNo, int year, Language language, String isbn, BookStatus bookStatus){
        Book book = new Book(author, title, pageNo, year, language, isbn, bookStatus);
        Library.books.add(book);


    }

    public static void createBookFX(String authorfx, String title, int pageNo, int year, Language language, String isbn){
        Book book = new Book(authorfx, title, pageNo, year, language, isbn);
        Library.books.add(book);
    }

    //Ausgabe aller Bücher
    public static void printBook(){
        for (Book book:Library.getBooks()) {
            System.out.println("");
            System.out.println("Produktdetails:");
            System.out.println("");
            System.out.println("Autor: " + book.getAuthor());
            System.out.println("Status: " + book.getBookStatus() + "        " + "Titel: " + book.getTitle());
            System.out.println("Seitenzahl: " + book.getPageNo() + "               " + "Sprache: " + book.getLanguage());
            System.out.println("Erscheinungsjahr: " + book.getYear() + "        " + "ISBN: " + book.getIsbn());
            System.out.println("--------------------------------------------------------------------");
        }
    }


    public List<com.company.Author> getAuthor() {
        return author;
    }

    public void setAuthor(List<com.company.Author> author) {
        this.author = author;
    }

    /*
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

     */

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

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public BookStatus getBookStatus() {
        return bookStatus;
    }

    public void setBookStatus(BookStatus bookStatus) {
        this.bookStatus = bookStatus;
    }
}
