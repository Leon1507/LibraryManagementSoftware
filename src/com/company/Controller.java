package com.company;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import java.util.List;

public class Controller {

    @FXML String title = "";
    @FXML String author;
    @FXML String isbn = "";
    @FXML int yearOfPublication = 0;
    @FXML int pageNo = 0;
    @FXML String language = "";


    public void saveBook(ActionEvent event){
        Book.createBookFX(author, title, pageNo, yearOfPublication, language, isbn);
        title = "";
        author = "";
        isbn = "";
        yearOfPublication = 0;
        pageNo = 0;
        language = "";
    }


}
