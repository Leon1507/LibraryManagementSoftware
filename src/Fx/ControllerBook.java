/**
 * Sample Skeleton for 'ListBook.fxml' Controller Class
 */

package Fx;

import java.net.URL;
import java.util.Arrays;
import java.util.ResourceBundle;

import com.company.*;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class ControllerBook implements Initializable {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML
    private TableView<Book> TableViewTable;

    @FXML // fx:id="TableColumnTitle"
    private TableColumn<Library, String> TableColumnTitle; // Value injected by FXMLLoader

    @FXML // fx:id="TableColumnAutor"
    private TableColumn<Library, String> TableColumnAutor; // Value injected by FXMLLoader

    @FXML // fx:id="TableColumnISBN"
    private TableColumn<Library, String> TableColumnISBN; // Value injected by FXMLLoader

    @FXML // fx:id="TableColumnPageNo"
    private TableColumn<Library, Integer> TableColumnPageNo; // Value injected by FXMLLoader

    @FXML // fx:id="TableColumnYear"
    private TableColumn<Library, Integer> TableColumnYear; // Value injected by FXMLLoader

    @FXML // fx:id="TableColumnLanguage"
    private TableColumn<Library, String> TableColumnLanguage; // Value injected by FXMLLoader

    @FXML // fx:id="TableColumnStatus"
    private TableColumn<Library, ?> TableColumnStatus; // Value injected by FXMLLoader

    @FXML // fx:id="TFTitle"
    private TextField TFTitle; // Value injected by FXMLLoader

    @FXML // fx:id="TFAuthor"
    private TextField TFAuthor; // Value injected by FXMLLoader
    
    @FXML 
    private ComboBox<Author> comboBoxAuthor;

    @FXML // fx:id="TFPageNo"
    private TextField TFPageNo; // Value injected by FXMLLoader

    @FXML // fx:id="TFIsbn"
    private TextField TFIsbn; // Value injected by FXMLLoader

    @FXML // fx:id="TFYearOfPublication"
    private TextField TFYearOfPublication; // Value injected by FXMLLoader

    @FXML // fx:id="comboBoxLanguage"
    private ComboBox<String> comboBoxLanguage; // Value injected by FXMLLoader

    @FXML
    private TextField AutorVorname;

    @FXML
    private TextField AutorNachname;

    @FXML
    private TextField AutorWohnort;

    @FXML
    private TextField AutorVerlag;


    public String title;
    private String author;
    private String isbn;
    private int yearOfPublication;
    private int pageNo;
    private Language language;
    private String autorVorname;
    private String autorNachname;
    private String autorWohnort;
    private String autorVerlag;


    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert TableColumnTitle != null : "fx:id=\"TableColumnTitle\" was not injected: check your FXML file 'ListBook.fxml'.";
        assert TableColumnAutor != null : "fx:id=\"TableColumnAutor\" was not injected: check your FXML file 'ListBook.fxml'.";
        assert TableColumnISBN != null : "fx:id=\"TableColumnISBN\" was not injected: check your FXML file 'ListBook.fxml'.";
        assert TableColumnPageNo != null : "fx:id=\"TableColumnPageNo\" was not injected: check your FXML file 'ListBook.fxml'.";
        assert TableColumnYear != null : "fx:id=\"TableColumnYear\" was not injected: check your FXML file 'ListBook.fxml'.";
        assert TableColumnLanguage != null : "fx:id=\"TableColumnLanguage\" was not injected: check your FXML file 'ListBook.fxml'.";
        assert TableColumnStatus != null : "fx:id=\"TableColumnStatus\" was not injected: check your FXML file 'ListBook.fxml'.";
        assert TFTitle != null : "fx:id=\"TFTitle\" was not injected: check your FXML file 'ListBook.fxml'.";
        assert TFAuthor != null : "fx:id=\"TFAuthor\" was not injected: check your FXML file 'ListBook.fxml'.";
        assert TFPageNo != null : "fx:id=\"TFPageNo\" was not injected: check your FXML file 'ListBook.fxml'.";
        assert TFIsbn != null : "fx:id=\"TFIsbn\" was not injected: check your FXML file 'ListBook.fxml'.";
        assert TFYearOfPublication != null : "fx:id=\"TFYearOfPublication\" was not injected: check your FXML file 'ListBook.fxml'.";
        assert comboBoxLanguage != null : "fx:id=\"comboBoxLanguage\" was not injected: check your FXML file 'ListBook.fxml'.";

    }

    public void newBook_Speichern(ActionEvent event){
        title = String.valueOf(TFTitle.getText());
        //author = String.valueOf(TFAuthor.getText());
        isbn = String.valueOf(TFIsbn.getText());
        pageNo = Integer.parseInt(TFPageNo.getText());
        language = Language.DEUTSCH;
        yearOfPublication = Integer.parseInt(TFYearOfPublication.getText());
        //System.out.println("test1");
        //System.out.println(title + author + isbn + pageNo + yearOfPublication + language);
        Book.createBookFX(title, pageNo, yearOfPublication, language, isbn, BookStatus.AUF_LAGER);
        //Book.printBook();
        //System.out.println("Test2");

        //Setze Daten in TableView
        TableViewTable.setItems(FXCollections.observableList(com.company.Library.getBooks()));
        //System.out.println("Test3");
    }

    public void newAutor_Speichern(ActionEvent event){
        autorVorname = String.valueOf(AutorVorname.getText());
        autorNachname = String.valueOf(AutorNachname.getText());
        autorWohnort = String.valueOf(AutorWohnort.getText());
        autorVerlag = String.valueOf(AutorVerlag.getText());
        System.out.println("Übergabe der werte");
        Author.createAuthor(autorNachname, autorVorname, autorWohnort, autorVerlag);
        System.out.println("Objekt AAutor erstellt");
    }




    @Override
    public void initialize(URL url, ResourceBundle rb){
        //comboBoxLanguage.getItems().addAll("Deutsch", "Englisch", "Spanisch");
        comboBoxLanguage.getItems().addAll("Deutsch", "Englisch");

        TableColumnTitle.setCellValueFactory(new PropertyValueFactory<>("title"));
        TableColumnAutor.setCellValueFactory(new PropertyValueFactory<>("author"));
        TableColumnISBN.setCellValueFactory(new PropertyValueFactory<>("isbn"));
        TableColumnPageNo.setCellValueFactory(new PropertyValueFactory<>("pageNo"));
        TableColumnYear.setCellValueFactory(new PropertyValueFactory<>("year"));
        TableColumnLanguage.setCellValueFactory(new PropertyValueFactory<>("language"));
        TableColumnStatus.setCellValueFactory(new PropertyValueFactory<>("bookStatus"));
    }



    /*
    public void initialize(URL url, ResourceBundle rb){
        //ComboBoxLanguage.getItems().setAll(com.company.Language.values());
        //ComboBox<Language> Language = new ComboBox<>();
        //Language.getItems().setAll(Language.values());

        ComboBox<Language> cbxStatus = new ComboBox<>();
        cbxStatus.getItems().setAll(Arrays.asList(Language.values()));
    }

     */
}
