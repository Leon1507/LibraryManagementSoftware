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

        //System.out.println("test1");

        //Objekt aus Datenfelder wird erstellt
        Book.createBookFX(title, pageNo, yearOfPublication, language, isbn, BookStatus.AUF_LAGER);

        //Book.printBook();
        //System.out.println("Test2");

        //Zuordnung der Spalten zu den Variablen im Array
        TableColumnTitle.setCellValueFactory(new PropertyValueFactory<>("title"));
        TableColumnAutor.setCellValueFactory(new PropertyValueFactory<>("author"));
        TableColumnISBN.setCellValueFactory(new PropertyValueFactory<>("isbn"));
        TableColumnPageNo.setCellValueFactory(new PropertyValueFactory<>("pageNo"));
        TableColumnYear.setCellValueFactory(new PropertyValueFactory<>("year"));
        TableColumnLanguage.setCellValueFactory(new PropertyValueFactory<>("language"));
        TableColumnStatus.setCellValueFactory(new PropertyValueFactory<>("bookStatus"));
        //System.out.println("test4");


        //Läd Daten in Tabelle "Bücher"
        TableViewTable.getItems().addAll(com.company.Library.getBooks());
        //System.out.println("Test5");

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
    public void initialize(URL url, ResourceBundle rb) {
        //comboBoxLanguage.getItems().addAll(com.company.Language);
        //comboBoxLanguage.getItems().addAll("Deutsch", "Englisch");

        TableColumnTitle.setCellValueFactory(new PropertyValueFactory<>("title"));
        TableColumnAutor.setCellValueFactory(new PropertyValueFactory<>("authorfx"));
        TableColumnISBN.setCellValueFactory(new PropertyValueFactory<>("isbn"));
        TableColumnPageNo.setCellValueFactory(new PropertyValueFactory<>("pageNo"));
        TableColumnYear.setCellValueFactory(new PropertyValueFactory<>("year"));
        TableColumnLanguage.setCellValueFactory(new PropertyValueFactory<>("language"));
        TableColumnStatus.setCellValueFactory(new PropertyValueFactory<>("bookStatus"));


        //ComboBox Language
        //comboBoxLanguage.getItems().addAll(Language.values());

        /*
        Callback<ListView<Language>, ListCell<Language>> cellFactory
                = (ListView<Language> param) -> new ListCell<Language>() {

            @Override
            protected void updateItem(Language item, boolean empty) {
                super.updateItem(item, empty);
                if (item != null && !empty) {
                    setText(item.getName());

                }
            }
        };

        ObservableList<Language> list
                = FXCollections.observableArrayList(Language.values());
        comboBoxLanguage.getItems().addAll(list);
        comboBoxLanguage.setButtonCell(cellFactory.call(null));
        comboBoxLanguage.setCellFactory(cellFactory);
        comboBoxLanguage.valueProperty().addListener((

                ObservableValue<? extends Language> observable,
                Language oldValue, Language newValue) -> {

            if (Objects.nonNull(newValue)) {
                label.setText(newValue.getName());
            }

        });

         */





        // Link: https://titanwolf.org/Network/Articles/Article?AID=ba96913d-d0f7-4f14-abd6-4810b13075db#gsc.tab=0

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
