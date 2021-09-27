package Fx;


import com.company.Book;
import com.company.BookStatus;
import com.company.Language;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Controller {

    @FXML String title = "";
    @FXML String author;
    @FXML String isbn = "";
    @FXML int yearOfPublication = 0;
    @FXML int pageNo = 0;
    @FXML Language language;
    //@FXML String language = "";
    @FXML BookStatus bookStatus;

    Button btnNewBook;
    Button btnSaveBook;
    Button btnCancelNewBook;
    Button btnRefresh;
    Button btnModifyBook;
    Button btnDeleteBook;



    public void btnSaveBook(ActionEvent event){
        Book.createBookFX(author, title, pageNo, yearOfPublication, language, isbn);
        title = "";
        author = "";
        isbn = "";
        yearOfPublication = 0;
        pageNo = 0;

    }

    private void btnNewBook() throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("createBook.fxml"));
        Stage window = (Stage) btnNewBook.getScene().getWindow();
        window.setScene(new Scene(root, 600, 400));

    }

    public void btnCancelNewBook() throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("ListBook.fxml"));
        Stage window = (Stage) btnCancelNewBook.getScene().getWindow();
        window.setScene(new Scene(root, 950, 650));
    }



}
