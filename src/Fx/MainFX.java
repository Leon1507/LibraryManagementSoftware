package Fx;

import com.company.Author;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Collections;


public class    MainFX extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("Fx/ui.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 800, 600));
        primaryStage.show();
    }




    public static void main(String[] args) {

        Author RobertKiyosaki = new Author("Kyiosaki", Collections.singletonList("Robert"), "Test", "FBV");
        launch(args);
    }
}
