package Fx;


import com.company.Book;
import com.company.BookStatus;
import com.company.Language;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class Controller {

    @FXML String title = "";
    @FXML String author;
    @FXML String isbn = "";
    @FXML int yearOfPublication = 0;
    @FXML int pageNo = 0;
    @FXML Language language;
    //@FXML String language = "";
    @FXML BookStatus bookStatus;


    public void saveBook(ActionEvent event){
        Book.createBookFX(author, title, pageNo, yearOfPublication, language, isbn);
        title = "";
        author = "";
        isbn = "";
        yearOfPublication = 0;
        pageNo = 0;
        language = Language.DEUTSCH;

    }


}
