/**
 * Sample Skeleton for 'ListBook.fxml' Controller Class
 */

package Fx;

import java.net.URL;
import java.util.Arrays;
import java.util.Objects;
import java.util.ResourceBundle;

import com.company.*;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.util.Callback;
import javafx.util.StringConverter;

import javax.swing.*;



public class ControllerBook implements Initializable {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML
    private TableView<Book> TableViewTable;

    @FXML // fx:id="TableColumnTitle"
    private TableColumn<Book, String> TableColumnTitle; // Value injected by FXMLLoader

    @FXML // fx:id="TableColumnAutor"
    private TableColumn<Book, String> TableColumnAutor; // Value injected by FXMLLoader

    @FXML // fx:id="TableColumnISBN"
    private TableColumn<Book, String> TableColumnISBN; // Value injected by FXMLLoader

    @FXML // fx:id="TableColumnPageNo"
    private TableColumn<Book, Integer> TableColumnPageNo; // Value injected by FXMLLoader

    @FXML // fx:id="TableColumnYear"
    private TableColumn<Book, Integer> TableColumnYear; // Value injected by FXMLLoader

    @FXML // fx:id="TableColumnLanguage"
    private TableColumn<Book, String> TableColumnLanguage; // Value injected by FXMLLoader

    @FXML // fx:id="TableColumnStatus"
    private TableColumn<Book, ?> TableColumnStatus; // Value injected by FXMLLoader

    @FXML // fx:id="TFTitle"
    private TextField TFTitle; // Value injected by FXMLLoader

    //@FXML // fx:id="TFAuthor"
    //private TextField TFAuthor; // Value injected by FXMLLoader

    @FXML
    private ComboBox<Author> comboBoxAuthor;

    @FXML // fx:id="TFPageNo"
    private TextField TFPageNo; // Value injected by FXMLLoader

    @FXML // fx:id="TFIsbn"
    private TextField TFIsbn; // Value injected by FXMLLoader

    @FXML // fx:id="TFYearOfPublication"
    private TextField TFYearOfPublication; // Value injected by FXMLLoader

    @FXML // fx:id="comboBoxLanguage"
    private ComboBox<Language> comboBoxLanguage; // Value injected by FXMLLoader

    @FXML
    private TextField AutorVorname;

    @FXML
    private TextField AutorNachname;

    @FXML
    private TextField AutorWohnort;

    @FXML
    private TextField AutorVerlag;

    @FXML
    private Label label;

    public String title;
    private String author;
    private String isbn;
    private int yearOfPublication;
    private int pageNo;
    private String language;
    private String autorVorname;
    private String autorNachname;
    private String autorWohnort;
    private String autorVerlag;


    public void newBook_Speichern(ActionEvent event){
        //Temporäre Speicherung der Eingaben
        title = String.valueOf(TFTitle.getText());
        //author = String.valueOf(TFAuthor.getText());
        isbn = String.valueOf(TFIsbn.getText());
        pageNo = Integer.parseInt(TFPageNo.getText());
        language = String.valueOf(comboBoxLanguage.getValue());
        //language = Language.valueOf(comboBoxLanguage.getValue());
        yearOfPublication = Integer.parseInt(TFYearOfPublication.getText());

        //Objekt aus Datenfelder wird erstellt
        Book.createBookFX(title, pageNo, yearOfPublication, language, isbn, BookStatus.AUF_LAGER);

        //reset table
        TableViewTable.getItems().clear();
        //Läd Daten in Tabelle "Bücher"
        PopulateTable();
        TFTitle.clear();
        TFIsbn.clear();
        TFPageNo.clear();
        TFYearOfPublication.clear();




    }

    public void PopulateTable(){
        TableViewTable.getItems().addAll(com.company.Library.getBooks());
    }

    public void newAutor_Speichern(ActionEvent event){
        autorVorname = String.valueOf(AutorVorname.getText());
        autorNachname = String.valueOf(AutorNachname.getText());
        autorWohnort = String.valueOf(AutorWohnort.getText());
        autorVerlag = String.valueOf(AutorVerlag.getText());
        //System.out.println("Übergabe der Werte");
        Author.createAuthor(autorNachname, autorVorname, autorWohnort, autorVerlag);
        DefaultComboBoxModel dml= new DefaultComboBoxModel();
        for (int i = 0; i < Library.getAuthors().size(); i++) {
            //dml.addElement(Library.getAuthors().get(i).getFirstNames() + " " + Library.getAuthors().get(i).getLastName());
            comboBoxAuthor.setPromptText(Library.getAuthors().get(i).getFirstNames() + " " + Library.getAuthors().get(i).getLastName());
        }
        //System.out.println("Objekt Autor erstellt");

    }


    public void Btn_Bearbeiten(ActionEvent event){
        onEdit();
    }

    public void onEdit() {
        // check the table's selected item and get selected item
        if (TableViewTable.getSelectionModel().getSelectedItem() != null) {
            Book selectedBook = TableViewTable.getSelectionModel().getSelectedItem();
            TFTitle.setText(selectedBook.getTitle());
            TFIsbn.setText(selectedBook.getIsbn());
            TFPageNo.setText(String.valueOf(selectedBook.getPageNo()));
            TFYearOfPublication.setText(String.valueOf(selectedBook.getYear()));
        }
    }


    @Override
    public void initialize(URL url, ResourceBundle rb) {
        TableColumnTitle.setCellValueFactory(new PropertyValueFactory<>("title"));
        TableColumnAutor.setCellValueFactory(new PropertyValueFactory<>("author"));
        TableColumnISBN.setCellValueFactory(new PropertyValueFactory<>("isbn"));
        TableColumnPageNo.setCellValueFactory(new PropertyValueFactory<>("pageNo"));
        TableColumnYear.setCellValueFactory(new PropertyValueFactory<>("year"));
        TableColumnLanguage.setCellValueFactory(new PropertyValueFactory<>("language"));
        TableColumnStatus.setCellValueFactory(new PropertyValueFactory<>("bookStatus"));
        DefaultComboBoxModel dml= new DefaultComboBoxModel();
        for (int i = 0; i < Library.getAuthors().size(); i++) {
            //dml.addElement(Library.getAuthors().get(i).getFirstNames() + " " + Library.getAuthors().get(i).getLastName());
            comboBoxAuthor.setPromptText(Library.getAuthors().get(i).getFirstNames() + " " + Library.getAuthors().get(i).getLastName());
        }


    }

    public void btnRefresh() throws Exception {
        //reset table
        TableViewTable.getItems().clear();
        //Läd Daten in Tabelle "Bücher"
        PopulateTable();
        TFTitle.clear();
        TFIsbn.clear();
        TFPageNo.clear();
        TFYearOfPublication.clear();
    }



    /*
        Callback<ListView<Author>, ListCell<Author>> cellFactory = new Callback<ListView<Author>, ListCell<Author>>() {

            @Override
            public ListCell<Author> call(ListView<Author> l) {
                return new ListCell<Author>() {

                    @Override
                    protected void updateItem(Author item, boolean empty) {
                        super.updateItem(item, empty);
                        if (item == null || empty) {
                            setGraphic(null);
                        } else {
                            setText(item.getFirstNames() + " " + item.getLastName());
                        }
                    }
                } ;
            }
        };

        // Just set the button cell here:
        //comboBoxAuthor.getButtonCell(cellFactory.call(null));
        comboBoxAuthor.setCellFactory(cellFactory);

     */





}
