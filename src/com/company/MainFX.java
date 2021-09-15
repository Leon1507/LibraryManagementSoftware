package com.company;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.MenuBar;
import javafx.scene.control.TabPane;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;


public class MainFX extends Application {

    Stage window;
    ListView<String> listBooks;

    @Override
    public void start(Stage primaryStage) throws Exception{

        window = primaryStage;
        window.setTitle("Library Manager");

        BorderPane borderPaneMain = new BorderPane();
        Scene libraryManager = new Scene(borderPaneMain, 800, 600);

        MenuBar libraryMenu = new MenuBar();
        TabPane tabStart = new TabPane();
        TabPane tabBooks = new TabPane();
        AnchorPane contentTabBooks = new AnchorPane();


        Button buttonSchließen = new Button("schließen");
        Button buttonAktualisieren = new Button("aktualisieren");
        Button buttonBuchAnlegen = new Button("Buch anlegen");

        HBox footerBooks = new HBox();
        footerBooks.setAlignment(Pos.CENTER_RIGHT);
        footerBooks.setPadding(new Insets(5, 5, 10,5 ));
        footerBooks.getChildren().addAll(buttonBuchAnlegen, buttonAktualisieren, buttonSchließen);



        //BorderPane
        borderPaneMain.setTop(libraryMenu);
        borderPaneMain.setCenter(tabBooks);
        borderPaneMain.setCenter(tabBooks);
        borderPaneMain.setBottom(footerBooks);



        window.setOnCloseRequest(e -> closeProgramm());
        window.setScene(libraryManager);
        window.show();





    }

    private void closeProgramm(){
        Boolean answer = ConfirmBox.display("Title", "Sure you want to exit?");
        if(answer){
            window.close();
        }

    }


    public static void main(String[] args) {
        launch(args);

    }
}
