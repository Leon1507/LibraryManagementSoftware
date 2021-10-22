package Fx;


import com.company.Book;
import com.company.BookStatus;
import com.company.Language;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;


import java.net.URL;
import java.util.ResourceBundle;

public class Controller {




    @FXML String title = "";
    @FXML String author;
    @FXML String isbn = "";
    @FXML int yearOfPublication = 0;
    @FXML int pageNo = 0;
    @FXML Language language;
    //@FXML String language = "";
    @FXML BookStatus bookStatus;



    @FXML
    private TextField TFTitle;

    @FXML
    private TextField TFAuthor;

    @FXML
    private TextField TFPageNo;

    @FXML
    private TextField TFIsbn;

    @FXML
    private TextField TFYearOfPublication;

    @FXML
    private ComboBox<String> comboBoxLanguage;

    //Language

    public Button btnNewBook_Speichern;
    public Button btnSaveBook;
    public Button btnNewBook_Abbrechen;
    public Button btnListBook_Refresh;
    public Button btnListBook_ModifyBook;
    public Button btnListBook_DeleteBook;


    /*
    public void initialize(URL url, ResourceBundle rb){
        //ComboBoxLanguage.getItems().setAll(com.company.Language.values());
        ComboBox<Language> testLanguage = new ComboBox<>();
        testLanguage.getItems().setAll(Language.values());
    }

     */

    public void initialize(URL url, ResourceBundle rb){
        comboBoxLanguage.getItems().addAll("Deutsch", "Englisch", "Spanisch");
    }

    public void btnSaveBook(ActionEvent event){
        //Book.createBookFX(author, title, pageNo, yearOfPublication, language, isbn);
        title = "";
        author = "";
        isbn = "";
        yearOfPublication = 0;
        pageNo = 0;

    }

    public void btnNewBook_Abbrechen() throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("ListBook.fxml"));
        Stage window = (Stage) btnNewBook_Abbrechen.getScene().getWindow();
        window.setScene(new Scene(root, 950, 650));
    }

    /*
    public void btnNewBook_Speichern() throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("createBook.fxml"));
        Stage window = (Stage) btnNewBook_Speichern.getScene().getWindow();
        window.setScene(new Scene(root, 600, 400));

    }
     */

    public void btnRefresh() throws Exception {

        System.out.println("Test erfolgreich");
    }






}
