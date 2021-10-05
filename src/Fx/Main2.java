package Fx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.MenuBar;
import javafx.scene.control.TabPane;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.util.Locale;
import java.util.ResourceBundle;


public class Main2 extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception {

        //Locale.setDefault(Locale.ENGLISH);

        //ResourceBundle rb = ResourceBundle.getBundle("locale.locale", Locale.getDefault());
        Parent root = FXMLLoader.load(getClass().getResource("ListBook.fxml"));

        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        //scene.getStylesheets().add("/styleSheet.css");
        primaryStage.setResizable(false);
        primaryStage.setTitle("Library-Manager");
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }

}